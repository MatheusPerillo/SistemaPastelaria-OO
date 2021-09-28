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
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Pastel;
import modelo.Pedido;
import modelo.Produto;

public class TelaPedidoProduto implements ActionListener {
	private JFrame janela;
	private  JLabel labelPastel = new JLabel("Escolha seu pastel:");
	private JComboBox<String> pasteis;
	private  JLabel labelBebida = new JLabel("Escolha sua bebida:");
	private JComboBox<String> bebidas;
	
	private  JLabel labelQtd = new JLabel("Digite a quantidade:");
	private  JTextField valorQtd = new JTextField(3);
	private  JButton confirmar = new JButton("Confirmar");
	private String s;
	private int op;
	private ControleDados dados;

	public void fazerPedido(ControleDados d, int op) {
		this.op = op;
		this.dados = d;
		String[] listaPasteis = new ControlePastel(dados).getNomePasteis();
		String[] listaBebidas = new ControleBebida(dados).getNomeBebidas();
		
		pasteis = new JComboBox<String>(listaPasteis);
		bebidas = new JComboBox<String>(listaBebidas);
		

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
		
		confirmar.setBounds(170, 100, 100, 30);

		this.janela.setSize(450, 200);
		this.janela.setLayout(null);
		this.janela.setVisible(true);

		this.janela.add(labelQtd);
		this.janela.add(valorQtd);
		
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
			try {
				int quantidade = Integer.valueOf(valorQtd.getText());
				
				if (op == 1) {
					String nome = (String) pasteis.getSelectedItem();
					Pastel p = ControlePastel.buscarPorNome(dados.getPasteis(), nome);
					dados.getPedido().pedirPastel(p, quantidade);
					mensagemSucessoPedido(1, p);
				}
				if (op == 2) {
					String nome = (String) bebidas.getSelectedItem();
					Bebida b = ControleBebida.buscarPorNome(dados.getBebidas(), nome);
					dados.getPedido().pedirBebida(b, quantidade);
					mensagemSucessoPedido(1, b);
				}
				
				
				
			} catch (StringIndexOutOfBoundsException exc1) {
				mensagemSemEstoque();
			} catch (NumberFormatException exc2) {
				mensagemErro();
			}
		}

	}

	public void mensagemSucessoPedido(int op,Produto p) {
		if (op == 1) {
			JOptionPane.showMessageDialog(null, "Pastel pedido com sucesso!\n" + p , null, JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		if (op == 2) {
			JOptionPane.showMessageDialog(null, "Bebida pedida com sucesso!\n" + p, null, JOptionPane.INFORMATION_MESSAGE);
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
