package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;
/**
 * Classe para exibir a tela de Pessoa que contém os atributos e os elementos da interface gráfica 
 * @author Joao Victor Correia
 * @author Matheus Perillo 
 * @version 1.0(out,2021)
 *
 */
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

	/**
	 * Método para exibir elementos da interface gráfica e a lista de Pessoas cadastradas de acordo com a operação
	 * @param d dados presentes no sistema
	 * @param op int para verificar qual operação será realizada <br>
	 * 1- Lista de Clientes <br>
	 * 2- Lista de Funcionários <br>
	 */
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

	/** 
	 * Método para realizar uma ação quando ocorre um evento: 
	 *<br>
	 * Ação-  Redirecionar para a página de cadastro de Pessoa ou atualizar a lista: <br>
	 * CadastrarCliente- Redireciona para a tela de cadastro de Cliente;<br>
	 * CadastroFuncionario - Redireciona para a tela de cadastro de Funcionario;<br>
	 * refreshCliente - Atualiza a tela e a lista de Clientes; <br>
	 * refreshFuncionario - Atualiza a tela e a lista de Funcionarios; <br> 
	 
	 */
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

	/** 
	 * Método para realizar uma ação quando ocorre uma seleção na lista: 
	 *<br>
	 * Ação-  Redirecionar para a página de edição da Pessoa selecionada: <br>
	 * listaCliente- Redireciona para a tela de edição de Cliente;<br>
	 * ListaFuncionario - Redireciona para a tela de edição de Funcionario;<br>
	
	 
	 */
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