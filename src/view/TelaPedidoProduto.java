package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControleBebida;
import controle.ControleCliente;
import controle.ControleDados;
import controle.ControleFuncionario;
import controle.ControlePastel;
import modelo.Bebida;
import modelo.Pastel;

public class TelaPedidoProduto implements ActionListener {
	private JFrame janela;
	private static JLabel labelPastel = new JLabel("Escolha seu pastel:");
	private JComboBox<String> pasteis;
	private static JLabel labelBebida = new JLabel("Escolha sua bebida:");
	private JComboBox<String> bebidas;
	private static JLabel labelCliente = new JLabel("Escolha qual cliente pediu:");
	private JComboBox<String> clientes;
	private static JLabel labelFuncionario = new JLabel("Escolha qual funcionário atendeu:");
	private JComboBox<String> funcionarios;
	private static JLabel labelQtd = new JLabel("Digite a quantidade:");
	private static JTextField valorQtd = new JTextField(3);
	private static JButton confirmar = new JButton("Confirmar");
	private String s;
	private int i;

	public void fazerPedido(ControleDados dados, int op) {

		String[] listaPasteis = new ControlePastel(dados).getNomePasteis();
		String[] listaBebidas = new ControleBebida(dados).getNomeBebidas();
		String[] listaClientes = new ControleCliente(dados).getNomeClientes();
		String[] listaFuncionarios = new ControleFuncionario(dados).getNomeFuncionarios();
		pasteis = new JComboBox<String>(listaPasteis);
		bebidas = new JComboBox<String>(listaBebidas);
		clientes = new JComboBox<String>(listaClientes);
		funcionarios = new JComboBox<String>(listaFuncionarios);

		if (op == 1)
			s = "Pedir pastel";

		if (op == 2)
			s = "Pedir bebida";

		janela = new JFrame(s);

		labelPastel.setBounds(30, 20, 150, 25);
		pasteis.setBounds(230, 20, 180, 25);
		labelBebida.setBounds(30, 20, 150, 25);
		bebidas.setBounds(230, 20, 180, 25);
		labelQtd.setBounds(30, 50, 150, 25);
		valorQtd.setBounds(230, 50, 28, 25);
		labelCliente.setBounds(30, 80, 150, 25);
		clientes.setBounds(230, 80, 180, 25);
		labelFuncionario.setBounds(30, 110, 200, 25);
		funcionarios.setBounds(230, 110, 180, 25);
		confirmar.setBounds(170, 150, 100, 30);

		this.janela.setSize(450, 250);
		this.janela.setLayout(null);
		this.janela.setVisible(true);

		this.janela.add(labelQtd);
		this.janela.add(valorQtd);
		this.janela.add(labelCliente);
		this.janela.add(clientes);
		this.janela.add(labelFuncionario);
		this.janela.add(funcionarios);
		this.janela.add(confirmar);
		

		if (op == 1) {
			this.janela.add(labelPastel);
			this.janela.add(pasteis);
		}
		if (op == 2) {
			this.janela.add(labelBebida);
			this.janela.add(bebidas);
		}

		confirmar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == confirmar) {
		}

	}

	public void mensagemSucessoPedido(int op) {
		if (op == 1) {
			JOptionPane.showMessageDialog(null, "Pastel pedido com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		if (op == 2) {
			JOptionPane.showMessageDialog(null, "Pastel pedido com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
	}

	public void mensagemErro() {

		JOptionPane.showMessageDialog(null, "Digite apenas números na quantidade", null, JOptionPane.ERROR_MESSAGE);
		janela.dispose();

	}

	public void mensagemSemEstoque() {

		JOptionPane.showMessageDialog(null,
				"Não temos essa quantidade em estoque\n" + "Por favor peça uma quatidade menor ou outro pastel", null,
				JOptionPane.ERROR_MESSAGE);
		janela.dispose();

	}

}
