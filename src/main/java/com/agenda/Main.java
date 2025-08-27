package com.agenda;

import com.agenda.entities.Contato;
import com.agenda.entities.Endereco;
import com.agenda.services.AgendaService;

public class Main {
    public static void main(String[] args) {

        // Objetos
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
        contato2.setTelefone("");
        contato2.setEmail("asdalskd@email.com");

        Contato contato3 = new Contato();
        Endereco endereco3 = new Endereco("112233", 11, "Lorem ipsum", "SC");
        contato3.setEndereco(endereco3);
        contato3.setNome("Gustavo");
        contato3.setTelefone("65496865");
        contato3.setEmail("jooji235@email.com");


        // Adicionar novos contatos
        AgendaService agenda = new AgendaService();
        System.out.println("\nAdicionando contatos:");
        agenda.adicionarContato(contato);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        // Remover contatos por nome/telefone
        System.out.println("\nRemovendo contatos: ");
        agenda.removerContato("Joao", "123456");

        System.out.println("");
        System.out.println(agenda.listarContatos());

        // Filtrar por NOME
        System.out.println("\nContatos por nome:");
        agenda.buscarPorNome("Gustavo");

        // Atualizar contatos
        Contato contato4 = new Contato();
        Endereco endereco4 = new Endereco("998550", 541, "Tal", "RO");
        contato4.setEndereco(endereco4);
        contato4.setNome("Roberval");
        contato4.setEmail("roberval35@email.com");

        System.out.println("");
        agenda.atualizarContato("987654", contato4);
        System.out.println("\nAgenda atualizada:");

        System.out.println(agenda.listarContatos());


    }
}