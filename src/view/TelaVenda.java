package view;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import controle.*;
import modelo.Venda;
import helper.ButtonColumn;
import helper.Util;
/**
 * Classe para exibir a tela de Vendas que cont�m os atributos e os elementos da interface gr�fica 
 * @author Joao Victor Correia
 * @author Matheus Perillo 
 * @version 1.0(out,2021)
 *
 */
public class TelaVenda {
	private JFrame janela;
	JTable tabela;
	private static ControleDados dados;
/**
 * 
 * @param d	dados presentes no sistema
 */
	public void mostrarDados(ControleDados d) {
		dados = d;
		 janela = new JFrame("Listagem de Vendas");

		DefaultTableModel tableModel = new DefaultTableModel();
		tabela = new JTable(tableModel);
		
		
		tableModel.addColumn("ID");
		tableModel.addColumn("Cliente");
		tableModel.addColumn("Funcion�rio");
		tableModel.addColumn("ValorTotal");
		tableModel.addColumn("FormaPagamento");
		tableModel.addColumn("DataPagamento");
		tableModel.addColumn("");
		tabela.setRowHeight(40);
		DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();        
		centralizado.setHorizontalAlignment(SwingConstants.CENTER);
		tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
		tabela.getColumnModel().getColumn(1).setCellRenderer(centralizado);
		tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
		tabela.getColumnModel().getColumn(3).setCellRenderer(centralizado);
		tabela.getColumnModel().getColumn(4).setCellRenderer(centralizado);
		
		
		ButtonColumn buttonColumn = new ButtonColumn(tabela, 6,  d);
		
		for (Venda v : dados.getVendas()) {
			int i = 0;
			tableModel.insertRow(i, new Object[] { v.getId(), v.getPedido().getCliente().getNome(), v.getPedido().getVendedor().getNome(),
					Util.doubleParaString(v.getPedido().getValorTotal()), v.getFormaPagamento(), Util.dateParaString(v.getDataPagamento()) });
			i++;
		}
		janela.setSize(850, 500);
		janela.add(new JScrollPane(tabela));
		janela.setVisible(true);
	}

}