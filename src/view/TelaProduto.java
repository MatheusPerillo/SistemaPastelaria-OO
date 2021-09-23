package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaProduto implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroPastel;
	private JButton refreshPastel;
	private JButton cadastroBebida;
	private JButton refreshBebida;
	private static ControleDados dados;
	private JList<String> listaPasteisCadastrados;
	private JList<String> listaBebidasCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 3:// Mostrar dados dos Pasteis cadastrados (JList)
			listaNomes = new ControlePastel(dados).getNomePasteis();
			listaPasteisCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Pasteis");
			titulo = new JLabel("Pasteis cadastrados");
			cadastroPastel = new JButton("Cadastrar");
			refreshPastel = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaPasteisCadastrados.setBounds(20, 50, 350, 120);
			listaPasteisCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPasteisCadastrados.setVisibleRowCount(10);

			cadastroPastel.setBounds(70, 177, 100, 30);
			refreshPastel.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaPasteisCadastrados);
			janela.add(cadastroPastel);
			janela.add(refreshPastel);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroPastel.addActionListener(this);
			refreshPastel.addActionListener(this);
			listaPasteisCadastrados.addListSelectionListener(this);

			break;

		case 4:// Mostrar dados das Bebidas cadastradas (JList)
			listaNomes = new ControleBebida(dados).getNomeBebidas();
			listaBebidasCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Bebidas");
			titulo = new JLabel("Bebidas cadastradas");
			cadastroBebida = new JButton("Cadastrar");
			refreshBebida = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaBebidasCadastrados.setBounds(20, 50, 350, 120);
			listaBebidasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaBebidasCadastrados.setVisibleRowCount(10);


			cadastroBebida.setBounds(70, 177, 100, 30);
			refreshBebida.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaBebidasCadastrados);
			janela.add(cadastroBebida);
			janela.add(refreshBebida);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroBebida.addActionListener(this);
			refreshBebida.addActionListener(this);
			listaBebidasCadastrados.addListSelectionListener(this);
			break;

		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}



	//Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
//		//Cadastro de novo aluno
//		if(src == cadastroCliente)
//			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);
//
//		//Cadastro de novo professor
//		if(src == cadastroProf)
//			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);
//
//		// Atualiza a lista de nomes de alunos mostrada no JList
//		if(src == refreshCliente) {
//			listaClientesCadastrados.setListData(new ControleCliente(dados).getNomeCliente());			
//			listaClientesCadastrados.updateUI();
//		}
//
//		// Atualiza a lista de nomes de professores mostrada no JList
//		if(src == refreshProf) {
//			listaProfsCadastrados.setListData(new ControleFuncionario(dados).getNomeProf());
//			listaProfsCadastrados.updateUI();
//		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

//		if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
//			new TelaDetalhePessoa().inserirEditar(3, dados, this, 
//					listaClientesCadastrados.getSelectedIndex());
//		}
//
//		if(e.getValueIsAdjusting() && src == listaProfsCadastrados) {
//			new TelaDetalhePessoa().inserirEditar(4, dados, this, 
//					listaProfsCadastrados.getSelectedIndex());
//		}
	}

}