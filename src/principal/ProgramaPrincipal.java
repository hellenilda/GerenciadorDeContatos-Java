package principal;

import modelo.*;
//
public class ProgramaPrincipal {
	public static void main(String[] args) {
		Contato contatos = new Contato();
		System.out.println(contatos.getContatos());

		// PESSOA 1
		Pessoa p1 = new Pessoa(1, "Gabriel", "de Freitas", 996228117);

		contatos.adicionarContato(p1);

		// PESSOA 2
		Pessoa p2 = new Pessoa(2, "Hellen", "Lima Araujo", 999842818);

		contatos.adicionarContato(p2);

		// PESSOA 3
		Pessoa p3 = new Pessoa(3, "Júlia", "Araújo", 956546556);

		contatos.adicionarContato(p3);

		// PESSOA 4
		Pessoa p4 = new Pessoa();
		contatos.adicionarContato(p4);

		System.out.println(contatos.getContatos());

		contatos.editarContato(0, p4, "Alguém", null, 215445665);

		System.out.println(contatos.getContatos());

		contatos.removerContato(p4);

		System.out.println(contatos.getContatos());
	}
}
