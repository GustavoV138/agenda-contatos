package com.agenda.entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> listaContatos = new ArrayList<>();

    public Agenda() {}

    public Agenda(List<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

    public void adicionarContato(Contato contato) {
        try {
            if(contato.getNome().isEmpty() || contato.getTelefone().isEmpty()){
                System.out.println("Campos obrigatórios não foram preenchidos.");
                return;
            }
            for (Contato c: listaContatos){
                if(contato.getTelefone().equals(c.getTelefone())){
                    System.out.println(contato);
                    System.out.println("Contato com número de telefone já registrado. Tente com outro.\n");
                    return;
                }
            }
            listaContatos.add(contato);
            System.out.println("Contato adicionado com sucesso!");
        }
        catch (NullPointerException e) {
            System.out.println("Alguma informação não foi passsada.");
        }

    }

    public void removerContato(String nome, String tel) {
        if (nome.isEmpty() || tel.isEmpty()) {
            System.out.println("Informações obrigatórias não foram inseridas.");
            return;
        }

        for(Contato c : listaContatos) {
            if(c.getNome().equals(nome) && c.getTelefone().equals(tel)) {
                listaContatos.remove(c);
                System.out.println("Usuário removido com sucesso.");
                return;
            }
        }
        System.out.println("Contato não encontrado com as informações fornecidas.");
    }

    public void buscarPorNome(String nome) {
        List<Contato> listaPorNome = new ArrayList<>();

        if(nome.isEmpty()){
            System.out.println("O campo não foi preenchido.");
            return;
        }

        listaPorNome = listaContatos.stream()
                                        .filter(c -> c.getNome().equals(nome))
                                        .toList();
        if(!listaPorNome.isEmpty()) {
            System.out.println(listaPorNome);
            return;
        }

        System.out.println("Nenhum contato com este nome.");
    }

    public void atualizarContato(String tel, Contato contato) {

        if(tel.isEmpty()){
            System.out.println("O campo não foi preenchido.");
            return;
        }

        for(Contato c : listaContatos) {
            if (c.getTelefone().equals(tel)) {
                c.setNome(contato.getNome());
                c.setEmail(contato.getEmail());
                c.setEndereco(contato.getEndereco());

                System.out.println("Contato atualizado");
                return;
            }
        }

        System.out.println("Contato não encontrado.");
    }

    public List<Contato> listarContatos() {
        return listaContatos;
    }

    public List<Contato> getListaContatos() {
        return listaContatos;
    }

}
