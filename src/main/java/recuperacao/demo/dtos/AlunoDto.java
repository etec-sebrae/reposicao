package recuperacao.demo.dtos;

import java.io.Serializable;
import java.util.Date;

import recuperacao.demo.entity.Aluno;


public class AlunoDto implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9044491255859109607L;

	private String nome;

	private String rg;

	private String cpf;

	private long matricula;
	
	private String email;

	private Date dataNasc;

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public long getMatricula() {
		return matricula;
	}



	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getDataNasc() {
		return dataNasc;
	}



	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}



	public Aluno transformaAlunoDto() {
		return new Aluno(nome,matricula,rg,cpf,dataNasc,email);
	}
	
	
	

}
