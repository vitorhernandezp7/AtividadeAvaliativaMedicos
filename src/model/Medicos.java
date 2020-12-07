package model;

public class Medicos {
	
	private int crm;
	private String nome;
	private String cpf;
	private int telefone;
	private String especialidade;

	public Medicos(int crm, String nome, String cpf, int telefone,String especialidade) {
		this.crm = crm;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.especialidade = especialidade;
	}
	
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
