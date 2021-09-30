package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Loja;

public class TelaLoja {
	private JFrame janela;
	private JLabel titulo = new JLabel("Pastelaria Perillão ");;
	private JLabel labelPropaganda = new JLabel("Aqui fazemos os melhores pastéis da cidade ");
	private JLabel labelEstado = new JLabel("Estado: ");
	private JLabel estado;
	private JLabel labelCidade = new JLabel("Cidade: ");
	private JLabel cidade;
	private JLabel labelBairro = new JLabel("Bairro: ");
	private JLabel bairro;
	private JLabel labelCep = new JLabel("Cep: ");
	private JLabel cep;
	private JLabel labelNumero = new JLabel("Número: ");
	private JLabel num;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JLabel ddd;
	private JLabel telefone;

	public void mostrarDados(Loja lj) {
		janela = new JFrame("Pastelaria");
		estado = new JLabel(lj.getEndereco().getEstado());
		cidade = new JLabel(lj.getEndereco().getCidade());
		bairro = new JLabel(lj.getEndereco().getBairro());
		cep = new JLabel(lj.getEndereco().getCep());
		num = new JLabel(String.valueOf(lj.getEndereco().getNumero()));
		ddd = new JLabel(String.valueOf(lj.getTelefone().getDdd()));
		telefone = new JLabel(String.valueOf(lj.getTelefone().getNumero()));

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(100, 10, 250, 30);
		labelPropaganda.setFont(new Font("Arial", Font.BOLD, 15));
		labelPropaganda.setBounds(30, 35, 350, 30);
		labelEstado.setBounds(60, 80, 150, 25);
		estado.setBounds(190, 80, 150, 25);
		labelCidade.setBounds(60, 110, 150, 25);
		cidade.setBounds(190, 110, 150, 25);
		labelBairro.setBounds(60, 140, 150, 25);
		bairro.setBounds(190, 140, 150, 25);
		labelCep.setBounds(60, 170, 150, 25);
		cep.setBounds(190, 170, 150, 25);
		labelNumero.setBounds(60, 200, 150, 25);
		num.setBounds(190, 200, 150, 25);
		labelTelefone.setBounds(60, 230, 150, 25);
		ddd.setBounds(190, 230, 150, 25);
		telefone.setBounds(220, 230, 150, 25);

		janela.setLayout(null);
		janela.add(titulo);
		janela.add(labelPropaganda);
		janela.add(labelEstado);
		janela.add(estado);
		janela.add(labelCidade);
		janela.add(cidade);
		janela.add(labelBairro);
		janela.add(bairro);
		janela.add(labelCep);
		janela.add(cep);
		janela.add(labelNumero);
		janela.add(num);
		janela.add(labelTelefone);
		janela.add(ddd);
		janela.add(telefone);

		janela.setSize(400, 350);
		janela.setVisible(true);
	}

}
