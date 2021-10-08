package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.ControleDados;
/**
 * Classe para exibir o menu e onde contém a main que possibilita o funcionamento de todo o sistema 
 * @author Joao Victor Correia
 * @author Matheus Perillo 
 * @version 1.0(out,2021)
 *
 */
public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Pastelaria Perillão");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton funcionario = new JButton("Funcionário");
	private static JButton vendas = new JButton("Vendas");
	private static JButton pastel = new JButton("Pastel");
	private static JButton bebida = new JButton("Bebida");
	private static JButton loja = new JButton("Loja");
	private static JButton pedido = new JButton("Realizar pedido");
	public static ControleDados dados = new ControleDados();

	/**
	 * Construtor para instanciação do objeto TelaMenu
	 */
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(180, 30, 150, 30);
		cliente.setBounds(120, 100, 120, 30);
		funcionario.setBounds(120, 150, 120, 30);
		vendas.setBounds(120, 200, 120, 30);
		pastel.setBounds(260, 100, 120, 30);
		bebida.setBounds(260, 150, 120, 30);
		loja.setBounds(260, 200, 120, 30);
		pedido.setBounds(180,250,150,30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cliente);
		janela.add(funcionario);
		janela.add(vendas);
		janela.add(pastel);
		janela.add(bebida);
		janela.add(loja);
		janela.add(pedido);
		
		janela.setSize(500, 330);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	/**
	 * Classe main para execução do programa
	 * @param args
	 */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		cliente.addActionListener(menu);
		funcionario.addActionListener(menu);
		vendas.addActionListener(menu);
		pastel.addActionListener(menu);
		bebida.addActionListener(menu);
		loja.addActionListener(menu);
		pedido.addActionListener(menu);
		
	}
	/** 
	 * Método para realizar uma ação quando ocorre um evento: 
	 *<br>
	 * Ação-  Abrir a tela referente ao botão clicado: <br>
	 * Cliente- Tela de pessoas com dados dos clientes;<br>
	 * Funcionário - Tela de pessoas com dados dos funcionários;<br>
	 * Pastel - Tela de produtos com dados dos pastéis; <br>
	 * Bebida - Tela de produtos com dados das bebidas; <br> 
	 * Loja - Tela de Loja exibindo seus respectivos dados;<br>
	 * Venda-    Tela de vendas com dados das vendas cadastradas;<br>
	 * Pedido- Tela de pedido para realizar pedidos
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cliente)
			new TelaPessoa().mostrarDados(dados, 1);
		
		if(src == funcionario)
			new TelaPessoa().mostrarDados(dados, 2);
		
		if(src == pastel)
			new TelaProduto().mostrarDados(dados, 3);
		
		if(src == bebida)
			new TelaProduto().mostrarDados(dados, 4);
		
		
		if(src == loja)
			new TelaLoja().mostrarDados(dados.getDados().getLoja());
		
		if(src == vendas)
			new TelaVenda().mostrarDados(dados);
		if(src == pedido)
			new TelaPedido().mostrarMenu(dados);
	}
}

