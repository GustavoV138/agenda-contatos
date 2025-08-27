package com.agenda.entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> listaContatos = new ArrayList<>();

    public Agenda() {}

    public Agenda(List<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

    public List<Contato> getListaContatos() {
        return listaContatos;
    }

}
