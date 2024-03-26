package model;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    List<Contato> contatos;

    public AgendaTelefonica() {
        contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato getContato(String nome){
        Contato contato = null;
        for (Contato c : contatos) {
            if (c.getNome().equals(nome)) {
                contato = c;
                return contato;
            }
        }
        return contato;
    }

    public void removeContato(String nome) {
        contatos.removeIf(c -> c.getNome().equals(nome));
    }
}
