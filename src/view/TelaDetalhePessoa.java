package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;
import modelo.Cliente;
import modelo.Endereco;
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
	private JTextField valorCargo;
	private JLabel labelSalario = new JLabel("Salário: ");
	private JTextField valorSalario;
	private JLabel labelDateNasc = new JLabel("Data de nascimento(dd/mm/aaaa): ");
	private JTextField valorDateNasc;
	private JLabel labelvendas = new JLabel("Número do Cartão: ");
	private JTextField valorVendas;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void cadastrarEditar(int op, ControleDados d, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Cliente";
		if (op == 2) s = "Cadastro de Funcionário";
		if (op == 3) s = "Detalhe de Cliente";
		if (op == 4) s = "Detalhe de Funcionário";

		janela = new JFrame(s);

		//Preenche dados com dados do aluno clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getClientes().get(pos).getNome(), 200);
			valorEstado = new JTextField(dados.getClientes().get(pos).getEndereco().getEstado(),200);
			valorCidade = new JTextField(dados.getClientes().get(pos).getEndereco().getCidade(),200);
			valorBairro = new JTextField(dados.getClientes().get(pos).getEndereco().getBairro(),200);
			valorCep = new JTextField(dados.getClientes().get(pos).getEndereco().getCep(),200);
			valorNumero = new JTextField(String.valueOf(dados.getClientes().get(pos).getEndereco().getNumero()),200);
			valorEmail = new JTextField(dados.getClientes().get(pos).getEmail(),200);
			valorNumCartao = new JTextField(dados.getClientes().get(pos).getNumCartao(),200);
			valorDDD = new JTextField(dados.getClientes().get(pos).getTelefone().getDdd(),3);
			valorTelefone = new JTextField(dados.getClientes().get(pos).getTelefone().getNumero(),10);		

//		} else if (op == 4) { //Preenche dados com dados do professor clicado 
//			valorNome = new JTextField(dados.getProfessores()[pos].getNome(), 200);
//			valorHoraAula = new JTextField(String.valueOf(
//					dados.getProfessores()[pos].getValorHoraAula()),200);
//			valorEnd = new JTextField(200);
//			valorCPF = new JTextField(String.valueOf(dados.getProfessores()[pos].getCPF()), 200);
//			valorID = new JTextField(String.valueOf(dados.getProfessores()[pos].getNumID()), 200);
//			valorDDD = new JTextField(
//					String.valueOf(dados.getProfessores()[pos].getNumTel().getDDD()), 3);
//			valorTelefone = new JTextField(
//					String.valueOf(dados.getProfessores()[pos].getNumTel().getNumero()), 10);
//
		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorEstado = new JTextField(200);
			valorCidade = new JTextField(200);
			valorBairro =  new JTextField(200);
			valorCep = new JTextField(200);
			valorNumero = new JTextField(3);
			valorEmail = new JTextField(200);
			valorNumCartao =  new JTextField(200);
			valorDDD = new JTextField(3);
			valorTelefone =  new JTextField(10);

			botaoSalvar.setBounds(245, 295, 115, 30);
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
		labelTelefone.setBounds(30, 260, 150, 25);
		valorDDD.setBounds(180, 260, 28, 25);
		valorTelefone.setBounds(210, 260, 75, 25);

		//Coloca os campos relacionados a cartão se Cliente
		if (op == 1 || op == 3 ) {
			this.janela.add(labelNumCartao);
			this.janela.add(valorNumCartao);

		}

//		//Coloca campos relacionados a valor hora/aula se professor
//		if (op == 2 || op == 4) {
//
//			this.janela.add(labelHoraAula);
//			this.janela.add(valorHoraAula);
//		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 295, 115, 30);
			botaoExcluir.setBounds(245, 295, 115, 30);
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

		this.janela.setSize(470, 385);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res=false;

				String nome =  valorNome.getText();
				
				String estado =  valorEstado.getText();
				String cidade =  valorCidade.getText();
				String bairro =  valorBairro.getText();
				String cep =  valorCep.getText();
				int num =  Integer.valueOf(valorNumero.getText());				
				Endereco end = new Endereco(estado, cidade, bairro, cep, num);
				
				String email =  valorEmail.getText();
				
				String ddd =  valorDDD.getText();
				String numTel =  valorTelefone.getText();				
				Telefone tel= new Telefone(ddd, numTel);
				
				if (opcao ==1) {
					String numCart =  valorNumCartao.getText();
					Cliente c = new Cliente(nome,end,tel, email, numCart);
					res = dados.inserirCliente(c);
				
				}else if(opcao==3) {
					String numCart =  valorNumCartao.getText();
					Cliente c = new Cliente(nome,end,tel, email, numCart);
					res = dados.editarCliente(posicao,c);
				}
//				} else {
//					novoDado[2] =  valorHoraAula.getText();
//					res = dados.inserirEditarProf(novoDado);
//				}
				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();
				
			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui aluno
				res = dados.removerCliente(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
				
//			if (opcao == 4){ //exclui professor
//				res = dados.removerProfessor(posicao);
//				if (res) mensagemSucessoExclusao(); 
//				else mensagemErroExclusaoProf(); 
//			}


			
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
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno está matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o professor está responsável\n"
				+ "por alguma disciplina. Se sim, substitua\n "
				+ "o professor e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}
