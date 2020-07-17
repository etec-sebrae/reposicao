package recuperacao.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;
	@Column(name = "nome", nullable = false,length = 50)
	private String nome;
	@Column(name = "matricula", unique = true, nullable = false, length = 12)
	private long matricula;
	@Column(name = "rg", nullable = false, length = 12)
	private String rg;
	@Column(name = "cpf",nullable = false, length = 14,unique = true)
	private String cpf;	
	@Column(name = "data_nasc", nullable = false)
	private Date data_nasc;
	@Column(name = "email", nullable = false, unique = true, length = 55)
	private String email;
	
	public Aluno(String nome, long matricula, String rg, String cpf, Date dataNasc, String email) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.rg = rg;
		this.cpf = cpf;
		this.data_nasc = dataNasc;
		this.email = email;		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
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
	public Date getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
