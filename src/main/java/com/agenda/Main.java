package com.agenda;

import com.agenda.entities.Agenda;
import com.agenda.entities.Contato;
import com.agenda.entities.Endereco;

public class Main {
    public static void main(String[] args) {


        Contato contato = new Contato();
        Endereco endereco = new Endereco("56166", 234, "Jhon People", "PB");
        contato.setEndereco(endereco);
        contato.setNome("Gustavo");
        contato.setTelefone("65496865");
        contato.setEmail("asdalskd@email.com");

        Contato contato2 = new Contato();
        Endereco endereco2 = new Endereco("56166", 234, "Jhon People", "PB");
        contato2.setEndereco(endereco2);
        contato2.setNome("Joao");
        contato2.setTelefone("123456");
        contato2.setEmail("asdalskd@email.com");

        Contato contato3 = new Contato();
        Endereco endereco3 = new Endereco("112233", 11, "Lorem ipsum", "SC");
        contato3.setEndereco(endereco3);
        contato3.setNome("Gustavo");
        contato3.setTelefone("987654");
        contato3.setEmail("jooji235@email.com");

        Agenda agenda = new Agenda();
        System.out.println("\nAdicionando contatos:");
        agenda.adicionarContato(contato);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        //System.out.println("\nRemovendo contatos: ");
        //agenda.removerContato("Joao", "123456");

        System.out.println("");
        System.out.println(agenda);


        System.out.println("\nContatos por nome:");
        agenda.buscarPorNome("Gustavo");


    }
}