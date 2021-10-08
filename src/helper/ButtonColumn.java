package helper;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import controle.ControleDados;
import controle.ControleVenda;
import modelo.Venda;

/**
 * Classe para possibilitar a criação de uma coluna com botões de excluir em uma
 * JTable
 * 
 * @author Joao Victor Correia
 * @author Matheus Perillo
 * @version 1.0(out,2021)
 */
public class ButtonColumn extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener {
	JTable table;
	JButton renderButton;
	JButton editButton;
	String text;
	ControleDados dados;

	/**
	 * Construtor para instaciação do objeto ButtonColumn
	 * 
	 * @param table	JTable que a coluna será adicionada
	 * @param column	número da coluna da tabela que será ocupada
	 * @param d	dados presentes no sistema
	 */
	public ButtonColumn(JTable table, int column, ControleDados d) {
		super();
		this.dados = d;
		this.table = table;
		renderButton = new JButton();

		editButton = new JButton();
		editButton.setFocusPainted(false);
		editButton.addActionListener(this);

		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(column).setCellRenderer(this);
		columnModel.getColumn(column).setCellEditor(this);
	}

	/**
	 * Retorna o componente usado para desenhar a célula. Este método é usado para
	 * configurar o renderizador apropriadamente antes de desenhar
	 * 
	 * @param table,      JTable em que ocorrerá alterações
	 * @param value,      Valor da célula a ser renderizada
	 * @param isSelected, verdadeiro se a célula deve ser renderizada com a seleção
	 *                    realçada, caso contrário, falso
	 * @param hasFocus,   se verdadeiro, renderiza a célula apropriadamente
	 * @return Component, componente a ser renderizado
	 */
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		if (hasFocus) {
			renderButton.setForeground(table.getForeground());
			renderButton.setBackground(UIManager.getColor("Button.background"));
		} else if (isSelected) {
			renderButton.setForeground(table.getSelectionForeground());
			renderButton.setBackground(table.getSelectionBackground());
		} else {
			renderButton.setForeground(table.getForeground());
			renderButton.setBackground(UIManager.getColor("Button.background"));
		}

		renderButton.setText((value == null) ? "Excluir" : value.toString());
		return renderButton;
	}

	/**
	 * Retorna o componente que deve ser adicionado.Este componente será capaz de
	 * desenhar e receber a entrada do usuário.
	 * 
	 * @param table,                JTable em que ocorrerá alterações
	 * @param value,                Valor da célula a ser editada
	 * @param isSelected,verdadeiro se a célula deve ser renderizada com destaque
	 * @param row,                  linha da célula a ser editada
	 * @param column,               coluna da célula a ser editada
	 * @return Component, componente a ser editado
	 */
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		text = (value == null) ? "Excluir" : value.toString();
		editButton.setText(text);
		return editButton;
	}

	/**
	 * Método para retornar o valor contido no editor
	 * 
	 * @return valor contido no editor
	 */
	public Object getCellEditorValue() {
		return text;
	}
	/** 
	 * Método para realizar uma ação quando ocorre um evento: 
	 *<br>
	 * Ação- Remove do objeto Dados a venda presente na linha da tabela     
	 */
	public void actionPerformed(ActionEvent e) {
		fireEditingStopped();
		DefaultTableModel model = (DefaultTableModel) this.table.getModel();
		int id = (int) table.getValueAt(table.getSelectedRow(), 0);
		model.removeRow(table.getSelectedRow());
		Venda v = new ControleVenda(dados).buscarPorId(id);
		dados.removerVenda(v);

	}
}
