package modelo;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int numero;
	private int id;

	public Pessoa() {
		super();
	}

	public Pessoa(int id, String nome, String sobrenome, int numero) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numero = numero;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		if (sobrenome == null) {
			return "[" + nome + " | " + numero + " | id:" + id + "]";
		} else {
			return "[" + nome + " " + sobrenome + " | " + numero + " | id:" + id + "]";
		}
	}
}