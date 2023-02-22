package modelo;

import java.util.*;

public class Contato {
	private ArrayList<Pessoa> contatos = new ArrayList<>();

	public ArrayList<Pessoa> getContatos() {
		System.out.println();
		System.out.println("====    Contatos atuais    ====");
		return contatos;
	}

	public void setContatos(ArrayList<Pessoa> contatos) {
		this.contatos = contatos;
	}

	public void adicionarContato(Pessoa pessoa) {
		contatos.add(pessoa);

		System.out.println();
		System.out.println("====    Contato adicionado    ====");
		System.out.println(pessoa);
		System.out.println();
	}

	public void editarContato(int id, Pessoa pessoa, String nome, String sobrenome, int numero) {
		for (Pessoa contato : contatos) {

			if (contato.getId() == id) {
				System.out.println();
				System.out.println("====    Contato " + pessoa + " editado    ====");
				System.out.println();

				contato.setNome(nome);
				contato.setSobrenome(sobrenome);
				contato.setNumero(numero);

			}
		}
	}

	public void removerContato(Pessoa pessoa) {
		System.out.println();
		System.out.println("====    Contato removido    ====");
		System.out.println(pessoa);
		System.out.println();

		contatos.remove(pessoa);
	}
}
