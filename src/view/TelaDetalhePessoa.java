package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;
import modelo.Cargo;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Funcionario;
import modelo.Telefone;

public class TelaDetalhePessoa implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelEstado = new JLabel("Estado: ");
	private JTextField valorEstado;
	private JLabel labelCidade = new JLabel("Cidade: ");
	private JTextField valorCidade;
	private JLabel labelBairro = new JLabel("Bairro: ");
	private JTextField valorBairro;
	private JLabel labelCep = new JLabel("Cep: ");
	private JTextField valorCep;
	private JLabel labelNumero = new JLabel("Número: ");
	private JTextField valorNumero;
	private JLabel labelEmail = new JLabel("Email: ");
	private JTextField valorEmail;;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JLabel labelNumCartao = new JLabel("Número do Cartão: ");
	private JTextField valorNumCartao;
	private JLabel labelCargo = new JLabel("Cargo: ");
	private JComboBox<Cargo> valorCargo;
	private JLabel labelSalario = new JLabel("Salário: ");
	private JTextField valorSalario;
	private JLabel labelDateNasc = new JLabel("Data de nascimento(dd/mm/aaaa): ");
	private JTextField valorDateNasc;
	private JLabel labelVendas = new JLabel("Vendas: ");
	private JTextField valorVendas;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void cadastrarEditar(int op, ControleDados d, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Cliente";
		if (op == 2)
			s = "Cadastro de Funcionário";
		if (op == 3)
			s = "Detalhe de Cliente";
		if (op == 4)
			s = "Detalhe de Funcionário";

		janela = new JFrame(s);

		// Preenche dados com dados do cliente clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getClientes().get(pos).getNome(), 200);
			valorEstado = new JTextField(dados.getClientes().get(pos).getEndereco().getEstado(), 200);
			valorCidade = new JTextField(dados.getClientes().get(pos).getEndereco().getCidade(), 200);
			valorBairro = new JTextField(dados.getClientes().get(pos).getEndereco().getBairro(), 200);
			valorCep = new JTextField(dados.getClientes().get(pos).getEndereco().getCep(), 200);
			valorNumero = new JTextField(String.valueOf(dados.getClientes().get(pos).getEndereco().getNumero()), 200);
			valorEmail = new JTextField(dados.getClientes().get(pos).getEmail(), 200);
			valorNumCartao = new JTextField(dados.getClientes().get(pos).getNumCartao(), 200);
			valorDDD = new JTextField(String.valueOf(dados.getClientes().get(pos).getTelefone().getDdd()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getClientes().get(pos).getTelefone().getNumero()), 10);
			valorCargo = new JComboBox<Cargo>(Cargo.values());
			valorSalario = new JTextField(200);
			valorDateNasc = new JTextField(200);
			valorVendas = new JTextField(200);

		} else if (op == 4) { // Preenche dados com dados do funcionário clicado
			valorNome = new JTextField(dados.getFuncionarios().get(pos).getNome(), 200);
			valorEstado = new JTextField(dados.getFuncionarios().get(pos).getEndereco().getEstado(), 200);
			valorCidade = new JTextField(dados.getFuncionarios().get(pos).getEndereco().getCidade(), 200);
			valorBairro = new JTextField(dados.getFuncionarios().get(pos).getEndereco().getBairro(), 200);
			valorCep = new JTextField(dados.getFuncionarios().get(pos).getEndereco().getCep(), 200);
			valorNumero = new JTextField(String.valueOf(dados.getFuncionarios().get(pos).getEndereco().getNumero()),
					200);
			valorEmail = new JTextField(dados.getFuncionarios().get(pos).getEmail(), 200);
			valorNumCartao = new JTextField(200);
			valorDDD = new JTextField(String.valueOf(dados.getFuncionarios().get(pos).getTelefone().getDdd()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getFuncionarios().get(pos).getTelefone().getNumero()),
					10);
			valorCargo = new JComboBox<Cargo>(Cargo.values());
			valorCargo.setSelectedItem(dados.getFuncionarios().get(pos).getCargo());
			valorSalario = new JTextField(String.valueOf(dados.getFuncionarios().get(pos).getSalario()), 200);
			valorDateNasc = new JTextField(dados.getFuncionarios().get(pos).getDateNasc(), 200);
			valorVendas = new JTextField(String.valueOf(dados.getFuncionarios().get(pos).getVendas()), 200);

		} else { // Não preenche com dados

			valorNome = new JTextField(200);
			valorEstado = new JTextField(200);
			valorCidade = new JTextField(200);
			valorBairro = new JTextField(200);
			valorCep = new JTextField(200);
			valorNumero = new JTextField(3);
			valorEmail = new JTextField(200);
			valorNumCartao = new JTextField(200);
			valorDDD = new JTextField(3);
			valorTelefone = new JTextField(10);
			valorCargo = new JComboBox<Cargo>(Cargo.values());
			valorSalario = new JTextField(200);
			valorDateNasc = new JTextField(200);
			valorVendas = new JTextField(200);

			if (op == 1) {
				botaoSalvar.setBounds(120, 295, 115, 30);
			} else if (op == 2) {
				botaoSalvar.setBounds(120, 380, 115, 30);
			}
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEstado.setBounds(30, 50, 150, 25);
		valorEstado.setBounds(180, 50, 180, 25);
		labelCidade.setBounds(30, 80, 180, 25);
		valorCidade.setBounds(180, 80, 180, 25);
		labelBairro.setBounds(30, 110, 150, 25);
		valorBairro.setBounds(180, 110, 180, 25);
		labelCep.setBounds(30, 140, 150, 25);
		valorCep.setBounds(180, 140, 180, 25);
		labelNumero.setBounds(30, 170, 150, 25);
		valorNumero.setBounds(180, 170, 180, 25);
		labelEmail.setBounds(30, 200, 150, 25);
		valorEmail.setBounds(180, 200, 180, 25);
		labelNumCartao.setBounds(30, 230, 150, 25);
		valorNumCartao.setBounds(180, 230, 180, 25);
		labelDateNasc.setBounds(30, 230, 150, 25);
		valorDateNasc.setBounds(180, 230, 180, 25);
		labelTelefone.setBounds(30, 260, 150, 25);
		valorDDD.setBounds(180, 260, 28, 25);
		valorTelefone.setBounds(210, 260, 75, 25);
		labelCargo.setBounds(30, 290, 150, 25);
		valorCargo.setBounds(180, 290, 180, 25);
		labelSalario.setBounds(30, 320, 150, 25);
		valorSalario.setBounds(180, 320, 180, 25);
		labelVendas.setBounds(30, 350, 150, 25);
		valorVendas.setBounds(180, 350, 180, 25);

		// Coloca os campos relacionados a cartão se Cliente
		if (op == 1 || op == 3) {
			this.janela.add(labelNumCartao);
			this.janela.add(valorNumCartao);

		}

//		//Coloca campos exclusivos de funcionário
		if (op == 2 || op == 4) {
			this.janela.add(labelCargo);
			this.janela.add(valorCargo);
			this.janela.add(labelDateNasc);
			this.janela.add(valorDateNasc);
			this.janela.add(labelSalario);
			this.janela.add(valorSalario);
			this.janela.add(labelVendas);
			this.janela.add(valorVendas);
		}

		// Coloca botoes de excluir e salvar
		if (op == 3) {
			botaoSalvar.setBounds(120, 295, 115, 30);
			botaoExcluir.setBounds(245, 295, 115, 30);
			this.janela.add(botaoExcluir);
		} else if (op == 4) {
			botaoSalvar.setBounds(120, 380, 115, 30);
			botaoExcluir.setBounds(245, 380, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEstado);
		this.janela.add(valorEstado);
		this.janela.add(labelCidade);
		this.janela.add(valorCidade);
		this.janela.add(labelBairro);
		this.janela.add(valorBairro);
		this.janela.add(labelCep);
		this.janela.add(valorCep);
		this.janela.add(labelNumero);
		this.janela.add(valorNumero);
		this.janela.add(labelEmail);
		this.janela.add(valorEmail);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		if (op == 2 || op == 4) {
			this.janela.setSize(500, 470);
		} else if (op == 1 || op == 3) {
			this.janela.setSize(500, 385);
		}
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res = false;

				String nome = valorNome.getText();

				String estado = valorEstado.getText();
				String cidade = valorCidade.getText();
				String bairro = valorBairro.getText();
				String cep = valorCep.getText();
				int num = Integer.valueOf(valorNumero.getText());
				Endereco end = new Endereco(estado, cidade, bairro, cep, num);

				String email = valorEmail.getText();

				int ddd = Integer.valueOf(valorDDD.getText());
				int numTel = Integer.valueOf(valorTelefone.getText());
				Telefone tel = new Telefone(ddd, numTel);

				if (opcao == 1) {
					if (!valorNome.getText().isEmpty() && new ControleCliente(dados).buscarPorNome(nome) == null) {
						String numCart = valorNumCartao.getText();
						Cliente c = new Cliente(nome, end, tel, email, numCart);
						res = dados.inserirCliente(c);

					} else {
						System.out.println("entrou");
						mensagemErroCadastro();
					}

				} else if (opcao == 3) {
					String numCart = valorNumCartao.getText();
					Cliente c = new Cliente(nome, end, tel, email, numCart);
					res = dados.editarCliente(posicao, c);
				}

				if (opcao == 2) {
					if (!valorNome.getText().isEmpty() && new ControleFuncionario(dados).buscarPorNome(nome) == null) {
						String dateNasc = valorDateNasc.getText();
						Cargo cargo = (Cargo) valorCargo.getSelectedItem();
						Double salario = Double.valueOf(valorSalario.getText());
						int vendas = Integer.valueOf(valorVendas.getText());
						Funcionario f = new Funcionario(nome, end, tel, email, cargo, salario, dateNasc, vendas);
						res = dados.inserirFuncionario(f);

					} else {
						mensagemErroCadastro();
					}

				} else if (opcao == 4) {
					String dateNasc = valorDateNasc.getText();
					Cargo cargo = (Cargo) valorCargo.getSelectedItem();
					Double salario = Double.valueOf(valorSalario.getText());
					int vendas = Integer.valueOf(valorVendas.getText());
					Funcionario f = new Funcionario(nome, end, tel, email, cargo, salario, dateNasc, vendas);
					res = dados.editarFuncionario(posicao, f);
				}

				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if (src == botaoExcluir)

		{
			boolean res = false;

			if (opcao == 3) {// exclui cliente
				res = dados.removerCliente(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusao();
			}

			if (opcao == 4) { // exclui funcionário
				res = dados.removerFuncionario(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusao();
			}

		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. Campo número,DDD e telefone não contém apenas números\n"
						+ "Não é possível cadastrar um nome que já exista",
				null, JOptionPane.ERROR_MESSAGE);

	}

	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n ", null, JOptionPane.ERROR_MESSAGE);

	}

}
