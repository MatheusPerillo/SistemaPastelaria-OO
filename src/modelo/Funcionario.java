package modelo;
import java.util.Date;

public class Funcionario {

	private String cargo;
	private Float salario;
	private Date dateNasc;
	private int vendasMes;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	public Date getDateNasc() {
		return dateNasc;
	}
	public void setDateNasc(Date dateNasc) {
		this.dateNasc = dateNasc;
	}
	public int getVendasMes() {
		return vendasMes;
	}
	public void setVendasMes(int vendasMes) {
		this.vendasMes = vendasMes;
	}

	
}
