package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controle.ControleDados;

public class TelaPedido implements ActionListener{
	private static JFrame janela;
	private static JLabel titulo = new JLabel("Faça aqui o seu pedido");
	private static JButton pastel = new JButton("Pedir Pastel");
	private static JButton bebida = new JButton("Pedir Bebida");
	private static ControleDados dados;
	
	public void mostrarMenu(ControleDados d) {
		TelaPedido.dados=d;
		janela = new JFrame("Realizar pedido");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(80,50,250,30);
		pastel.setBounds(130, 100, 120, 30);
		bebida.setBounds(130, 150, 120, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(bebida);
		janela.add(pastel);
		
		janela.setSize(400, 300);
		janela.setVisible(true);
		
		bebida.addActionListener(this);
		pastel.addActionListener(this);
	}                                                    

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src== pastel) {
			new TelaPedidoProduto().fazerPedido(dados,1);
		}
		
		if(src== bebida) {
			new TelaPedidoProduto().fazerPedido(dados,2);
		}
		
	}
}
