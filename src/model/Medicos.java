package model;

public class Medicos {
	
	private int crm;
	private String nome;
	private String cpf;
	private int telefone;

	public Medicos(int crm, String nome, String cpf, int telefone) {
		this.crm = crm;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
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
	
	
}
