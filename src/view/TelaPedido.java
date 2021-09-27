package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import controle.ControleDados;

public class TelaPedido implements ActionListener{
	private static JFrame janela;
	private static JButton pastel = new JButton("Pedir Pastel");
	private static JButton bebida = new JButton("Pedir Bebida");
	
	public void mostrarMenu(ControleDados d) {
		janela = new JFrame("Realizar pedido");
		pastel.setBounds(130, 100, 120, 30);
		bebida.setBounds(130, 150, 120, 30);
		
		janela.setLayout(null);
		
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
		
	}
}
