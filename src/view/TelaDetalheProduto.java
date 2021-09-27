package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;
import modelo.Pastel;
import modelo.Bebida;
import modelo.Produto;

public class TelaDetalheProduto implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelSabor = new JLabel("Sabor: ");
	private JTextField valorSabor;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	private JLabel labelVolume = new JLabel("Volume: ");
	private JTextField valorVolume;
	private JLabel labelTamanho = new JLabel("Tamanho: ");
	private JTextField valorTamanho;
	private JLabel labelDescricao = new JLabel("Descrição: ");
	private JTextField valorDescricao;
	private JLabel labelPreco = new JLabel("Valor: ");
	private JTextField valorPreco;
	private JLabel labelEstoque = new JLabel("Em estoque: ");
	private JTextField valorEstoque;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void cadastroEditar(int op, ControleDados d, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Pastel";
		if (op == 2)
			s = "Cadastro de Bebida";
		if (op == 3)
			s = "Detalhe de Pastel";
		if (op == 4)
			s = "Detalhe de Bebida";

		janela = new JFrame(s);

		// Preenche dados com dados do pastel que foi clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getPasteis().get(pos).getNome(), 200);
			valorSabor = new JTextField(dados.getPasteis().get(pos).getSabor(), 100);
			valorTamanho = new JTextField(dados.getPasteis().get(pos).getTamanho(), 2);
			valorDescricao = new JTextField(dados.getPasteis().get(pos).getDescricao(), 200);
			valorPreco = new JTextField(String.valueOf(dados.getPasteis().get(pos).getValor()),50);
			valorEstoque = new JTextField(String.valueOf(dados.getPasteis().get(pos).getQtdEstoque()),9);

			// Preenche dados com dados da bebida que foi clicada
		} else if (op == 4) {
			valorNome = new JTextField(dados.getBebidas().get(pos).getNome(), 200);
			valorTipo = new JTextField(dados.getBebidas().get(pos).getTipo(), 100);
			valorVolume = new JTextField(String.valueOf(dados.getBebidas().get(pos).getVolume()),5);
			valorDescricao = new JTextField(dados.getBebidas().get(pos).getDescricao(), 200);
			valorPreco = new JTextField(String.valueOf(dados.getBebidas().get(pos).getValor()),50);
			valorEstoque = new JTextField(String.valueOf(dados.getBebidas().get(pos).getQtdEstoque()),9);

			// Não preenche com dados
		} else {

			valorNome = new JTextField(200);
			valorSabor = new JTextField(100);
			valorTamanho = new JTextField(2);
			valorDescricao = new JTextField(200);
			valorPreco = new JTextField(50);
			valorEstoque = new JTextField(9);
			valorTipo = new JTextField(100);
			valorVolume = new JTextField(5);

			if (op == 1) {
				botaoSalvar.setBounds(120, 295, 115, 30);
			} else if (op == 2) {
				botaoSalvar.setBounds(120, 380, 115, 30);
			}

		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);

		labelSabor.setBounds(30, 20, 150, 25);
		valorSabor.setBounds(180, 20, 180, 25);

		labelTamanho.setBounds(30, 20, 150, 25);
		valorTamanho.setBounds(180, 20, 180, 25);

		labelDescricao.setBounds(30, 20, 150, 25);
		valorDescricao.setBounds(180, 20, 180, 25);

		labelPreco.setBounds(30, 20, 150, 25);
		valorPreco.setBounds(180, 20, 180, 25);

		labelEstoque.setBounds(30, 20, 150, 25);
		valorEstoque.setBounds(180, 20, 180, 25);

		labelTipo.setBounds(30, 20, 150, 25);
		valorTipo.setBounds(180, 20, 180, 25);

		labelVolume.setBounds(30, 20, 150, 25);
		valorVolume.setBounds(180, 20, 180, 25);

		// Coloca os campos relacionados a pastel
		if (op == 1 || op == 3) {
			this.janela.add(labelTamanho);
			this.janela.add(valorTamanho);
			this.janela.add(labelSabor);
			this.janela.add(valorSabor);

		}

		// Coloca campos exclusivos de bebida
		if (op == 2 || op == 4) {
			this.janela.add(labelVolume);
			this.janela.add(valorVolume);
			this.janela.add(labelTipo);
			this.janela.add(valorTipo);

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
		}
		
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
		this.janela.add(labelDescricao);
		this.janela.add(valorDescricao);
		this.janela.add(labelEstoque);
		this.janela.add(valorEstoque);
		
		this.janela.setLayout(null);
		
		if(op== 2 || op==4) {this.janela.setSize(500, 470);}
		else if(op==1 || op==3) {this.janela.setSize(500, 385);}
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
				String descricao = valorDescricao.getText();
				double preco = Double.valueOf(valorPreco.getText());
				int estoque = Integer.valueOf(valorEstoque.getText());
				
				
				//String tipo = valorTipo.getText();
				//int volume = Integer.valueOf(valorVolume.getText());
				//String sabor = valorSabor.getText();
				//String tamanho = valorTamanho.getText();
				
				
			}catch (NullPointerException exc1) {
				mensagemErroCadastro();
			}catch(NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}
		
		if (src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {// exclui pastel
				res = dados.removerPastel(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoAluno();
			}

			if (opcao == 4){ //exclui bebida
				res = dados.removerBebida(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoProf(); 
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
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. Volume, preço e Estoque não contém apenas números",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o aluno está matriculado\n"
						+ "em alguma disciplina. Se sim, cancele\n " + "a matricula e tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o professor está responsável\n"
						+ "por alguma disciplina. Se sim, substitua\n " + "o professor e tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}
}
