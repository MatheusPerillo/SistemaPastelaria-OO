package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaPessoa implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private JButton cadastroFunc;
	private JButton refreshFunc;
	private static ControleDados dados;
	private JList<String> listaClientesCadastrados;
	private JList<String> listaFuncionariosCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de Clientes cadastrados (JList)
			listaNomes = new ControleCliente(dados).getNomeClientes();
			listaClientesCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			refreshCliente = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaClientesCadastrados.setBounds(20, 50, 350, 120);
			listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClientesCadastrados.setVisibleRowCount(10);

			cadastroCliente.setBounds(70, 177, 100, 30);
			refreshCliente.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaClientesCadastrados);
			janela.add(cadastroCliente);
			janela.add(refreshCliente);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroCliente.addActionListener(this);
			refreshCliente.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);

			break;

		case 2:// Mostrar dados de funcionários cadastrados (JList)
			listaNomes = new ControleFuncionario(dados).getNomeFuncionarios();
			listaFuncionariosCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Funcionários");
			titulo = new JLabel("Funcionários Cadastrados");
			cadastroFunc = new JButton("Cadastrar");
			refreshFunc = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaFuncionariosCadastrados.setBounds(20, 50, 350, 120);
			listaFuncionariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaFuncionariosCadastrados.setVisibleRowCount(10);

			cadastroFunc.setBounds(70, 177, 100, 30);
			refreshFunc.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaFuncionariosCadastrados);
			janela.add(cadastroFunc);
			janela.add(refreshFunc);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroFunc.addActionListener(this);
			refreshFunc.addActionListener(this);
			listaFuncionariosCadastrados.addListSelectionListener(this);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Cadastro de novo cliente
		if (src == cadastroCliente)
			new TelaDetalhePessoa().cadastrarEditar(1, dados, 0);

		// Cadastro de novo funcionário
		if (src == cadastroFunc)
			new TelaDetalhePessoa().cadastrarEditar(2, dados, 0);

		// Atualiza a lista de nomes de clientes mostrada no JList
		if (src == refreshCliente) {
			listaClientesCadastrados.setListData(new ControleCliente(dados).getNomeClientes());
			listaClientesCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de funcionários mostrada no JList
		if (src == refreshFunc) {
			listaFuncionariosCadastrados.setListData(new ControleFuncionario(dados).getNomeFuncionarios());
			listaFuncionariosCadastrados.updateUI();
		}

	}

	// Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new TelaDetalhePessoa().cadastrarEditar(3, dados, listaClientesCadastrados.getSelectedIndex());

		}

		if (e.getValueIsAdjusting() && src == listaFuncionariosCadastrados) {
			new TelaDetalhePessoa().cadastrarEditar(4, dados, listaFuncionariosCadastrados.getSelectedIndex());
		}
	}

}