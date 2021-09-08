package modelo;
import java.util.Date;

public class Funcionario extends Pessoa {

	private Cargo cargo;
	private Double salario;
	private String dateNasc;
	private int vendasMes;
	
	public Funcionario(String nome, Endereco endereco, Telefone telefone, String email, Cargo cargo,
			Double salario,String dateNasc, int vendasMes) {
		super(nome, endereco, telefone, email);
		this.cargo = cargo;
		this.salario = salario;
		this.dateNasc = dateNasc;
		this.vendasMes = vendasMes;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDateNasc() {
		return dateNasc;
	}

	public void setDateNasc(String dateNasc) {
		this.dateNasc = dateNasc;
	}

	public int getVendasMes() {
		return vendasMes;
	}

	public void setVendasMes(int vendasMes) {
		this.vendasMes = vendasMes;
	}

	@Override
	public String toString() {
		return "\nID:" + this.getId() + "\nNome: " + this.getNome() + "\nEndereco: " + this.getEndereco() 
		+"\nData de Nascimento: "+ this.getDateNasc()+ "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail() + "\nCargo: " + this.getCargo()
		+ "\nSalário: " + this.getSalario() + "\nVendas no mês: " + this.getVendasMes() ;
	}	
	
	
	
}