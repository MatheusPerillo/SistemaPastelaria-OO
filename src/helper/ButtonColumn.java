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

public class ButtonColumn extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener {
	JTable table;
	JButton renderButton;
	JButton editButton;
	String text;
	ControleDados dados;

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

	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		text = (value == null) ? "Excluir" : value.toString();
		editButton.setText(text);
		return editButton;
	}

	public Object getCellEditorValue() {
		return text;
	}

	public void actionPerformed(ActionEvent e) {
		fireEditingStopped();
		 DefaultTableModel model = (DefaultTableModel) this.table.getModel();
		 int id= (int) table.getValueAt(table.getSelectedRow(), 0);
		 model.removeRow(table.getSelectedRow());
		Venda v= ControleVenda.buscarPorId(dados.getVendas(), id);
		dados.removerVenda(v);
		 
		 
	} 
}
