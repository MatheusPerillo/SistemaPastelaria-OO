package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControleDados;
import helper.Util;
import modelo.Pedido;
import modelo.Produto;
import modelo.Venda;

public class TelaPagamento implements ActionListener {
	private JFrame janela;
	private JLabel titulo = new JLabel("Pagar pedido");
	private JLabel labelPagamento = new JLabel("Escolha a forma de pagamento: ");
	private JLabel labelValorTotal = new JLabel("Valor total do pedido: ");
	private JLabel valorTotal;
	private JComboBox<String> valorPagamento;
	private JButton confirmar = new JButton("Confirmar");
	private static ControleDados dados;

	public void cadastrarVenda(ControleDados d) {
		dados = d;

		dados.getPedido().calcularValorTotal();
		valorTotal = new JLabel(Util.doubleParaString((dados.getDados().getPedido().getValorTotal())));

		String[] formPag = { "Pix", "Dinheiro", "Cartão de crédito", "Cartão de débito" };

		valorPagamento = new JComboBox<String>(formPag);
		valorPagamento.setSelectedItem(dados.getPedido().getValorTotal());

		janela = new JFrame("Cadastro de venda");
		janela = new JFrame("Realizar pedido");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(140, 30, 250, 30);
		labelValorTotal.setBounds(50, 60, 150, 30);
		valorTotal.setBounds(240, 60, 150, 30);
		labelPagamento.setBounds(50, 90, 200, 30);
		valorPagamento.setBounds(240, 90, 130, 30);
		confirmar.setBounds(140, 140, 100, 30);

		janela.add(titulo);
		janela.add(labelValorTotal);
		janela.add(valorTotal);
		janela.add(labelPagamento);
		janela.add(valorPagamento);
		janela.add(confirmar);

		janela.setLayout(null);
		janela.setSize(400, 300);
		janela.setVisible(true);

		confirmar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == confirmar) {
			if (!((String) valorPagamento.getSelectedItem()).isEmpty()) {
				String pag = (String) valorPagamento.getSelectedItem();
				GregorianCalendar data = new GregorianCalendar();
				Venda v = new Venda(dados.getPedido(), pag, data.getTime());
				dados.inserirVenda(v);
				mensagemSucesso();

			} else {
				mensagemErro();
			}
		}
	}

	public void mensagemSucesso() {
		JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!\n", null, JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Escolha a forma de pagamento", null, JOptionPane.ERROR_MESSAGE);
		janela.dispose();
	}
}
