package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controle.*;
import modelo.Pastel;
import modelo.Venda;
import helper.Util;
public class TelaVenda {
	private JFrame janela;
	private JLabel titulo;
	private static ControleDados dados;

	public void mostrarDados(ControleDados d) {
		dados = d;

		DefaultTableModel tableModel = new DefaultTableModel();
		JTable table = new JTable(tableModel);
		tableModel.addColumn("ID");
		tableModel.addColumn("Cliente");
		tableModel.addColumn("Funcionário");
		tableModel.addColumn("ValorTotal");
		tableModel.addColumn("FormaPagamento");
		tableModel.addColumn("DataPagamento");
		table.setBounds(20, 150, 700, 350);

		for (Venda v : dados.getVendas()) {
			int i = 0;
			tableModel.insertRow(i, new Object[] { v.getId(), v.getPedido().getCliente().getNome(), v.getPedido().getVendedor().getNome(),
					v.getPedido().getValorTotal(), v.getFormaPagamento(), Util.dateParaString(v.getDataPagamento()) });
			i++;
		}
		JFrame janela = new JFrame();
		janela.setSize(750, 350);
		janela.add(new JScrollPane(table));
		janela.setVisible(true);
	}

}