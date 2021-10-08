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
/**
 * Classe para exibir a tela de pagamento que cont�m os atributos e os elementos da interface gr�fica 
 * @author Joao Victor Correia
 * @author Matheus Perillo 
 * @version 1.0(out,2021)
 *
 */
public class TelaPagamento implements ActionListener {
	private JFrame janela;
	private JLabel titulo = new JLabel("Pagar pedido");
	private JLabel labelPagamento = new JLabel("Escolha a forma de pagamento: ");
	private JLabel labelValorTotal = new JLabel("Valor total do pedido: ");
	private JLabel valorTotal;
	private JComboBox<String> valorPagamento;
	private JButton confirmar = new JButton("Confirmar");
	private static ControleDados dados;
/**
 * M�todo para exibir elementos da interface gr�fica e possibilitar cadastro de vendas
 * @param d dados presentes no sistema
 */
	public void cadastrarVenda(ControleDados d) {
		dados = d;

		dados.getPedido().calcularValorTotal();
		valorTotal = new JLabel(Util.doubleParaString((dados.getDados().getPedido().getValorTotal())));

		String[] formPag = { "Pix", "Dinheiro", "Cart�o de cr�dito", "Cart�o de d�bito" };

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
	/** 
	 * M�todo para realizar uma a��o quando ocorre um evento: 
	 *<br>
	 * A��o-  cadastrar venda     
	 */
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
	/**
	 * M�todo para exibir uma mensagem de sucesso ao cadastrar uma venda
	 */
	public void mensagemSucesso() {
		JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!\n", null, JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	/**
	 * M�todo para exibir uma mensagem de erro ao cadastrar uma venda<br>
	 * Poss�veis erros: <br>
	 * 1- N�o foi escolhida a forma de pagamento; <br>
	
	 */
	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Escolha a forma de pagamento", null, JOptionPane.ERROR_MESSAGE);
		janela.dispose();
	}
}
