package entities;

public class Usuario {
	
	private String name;
	private String cpf;
	private String email;
	
	public Usuario() {
		super();
	}

	public Usuario(String name, String cpf, String email) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.email = email;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nome: " + this.name
				+ "\nCPF: " + this.cpf 
				+ "\nE-mail: " + this.email;
	}
	
	
}
