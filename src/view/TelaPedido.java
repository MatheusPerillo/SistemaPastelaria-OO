package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controle.ControleCliente;
import controle.ControleDados;
import controle.ControleFuncionario;
import modelo.Cliente;
import modelo.Funcionario;

public class TelaPedido implements ActionListener {
	private JFrame janela;
	private static JLabel titulo = new JLabel("Faça aqui o seu pedido");
	private static JButton pastel = new JButton("Pedir Pastel");
	private static JButton bebida = new JButton("Pedir Bebida");
	private static JButton finalizar = new JButton("Finalizar pedido");
	private JLabel labelCliente = new JLabel("Escolha qual cliente pediu:");
	private JComboBox<String> clientes;
	private JLabel labelFuncionario = new JLabel("Escolha qual funcionário atendeu:");
	private JComboBox<String> funcionarios;
	private static ControleDados dados;

	public void mostrarMenu(ControleDados d) {
		TelaPedido.dados = d;

		String[] listaClientes = new ControleCliente(dados).getNomeClientes();
		String[] listaFuncionarios = new ControleFuncionario(dados).getNomeFuncionarios();
		clientes = new JComboBox<String>(listaClientes);

		funcionarios = new JComboBox<String>(listaFuncionarios);

		janela = new JFrame("Realizar pedido");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 15, 250, 30);
		labelCliente.setBounds(30, 60, 150, 25);
		clientes.setBounds(230, 60, 180, 25);
		labelFuncionario.setBounds(30, 110, 200, 25);
		funcionarios.setBounds(230, 110, 180, 25);
		pastel.setBounds(80, 160, 120, 30);
		bebida.setBounds(230, 160, 120, 30);
		finalizar.setBounds(130, 210, 170, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(labelCliente);
		janela.add(clientes);
		janela.add(labelFuncionario);
		janela.add(funcionarios);
		janela.add(bebida);
		janela.add(pastel);
		janela.add(finalizar);

		janela.setSize(450, 300);
		janela.setVisible(true);

		bebida.addActionListener(this);
		pastel.addActionListener(this);
		finalizar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();

		if (src == pastel) {
			new TelaPedidoProduto().fazerPedido(dados, 1);
		}

		if (src == bebida) {
			new TelaPedidoProduto().fazerPedido(dados, 2);
		}
		if (src == finalizar) {
			try {
				String nomeCliente = (String) clientes.getSelectedItem();
				Cliente c = new ControleCliente(dados).buscarPorNome(nomeCliente);

				String nomeFuncionario = (String) funcionarios.getSelectedItem();
				Funcionario f = new ControleFuncionario(dados).buscarPorNome(nomeFuncionario);

				dados.getPedido().setCliente(c);
				dados.getPedido().setVendedor(f);
				janela.dispose();

				dados.getPedido().calcularValorTotal();
				double valorTotal = dados.getDados().getPedido().getValorTotal();
				if (valorTotal > 0) {
					new TelaPagamento().cadastrarVenda(dados);
				} else {
					mensagemErro();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

	public void mensagemErro() {
		JOptionPane.showMessageDialog(null, "É necessário pedir pelo menos um produto", null, JOptionPane.ERROR_MESSAGE);
		janela.dispose();
	}
}
