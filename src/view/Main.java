package view;

import model.AgendaTelefonica;
import model.Contato;

public class Main {

    public static void main(String[] args) {

        Contato c1 = new Contato();
        Contato c2 = new Contato();
        Contato c3 = new Contato();
        AgendaTelefonica t = new AgendaTelefonica();
        c1.setNome("Claudio");
        c1.setTelefone("11954783215");
        c1.setEmail("claudio35@gmail.com");

        c2.setNome("Gabriel");
        c2.setTelefone("11921453234");
        c2.setEmail("gabriel17@gmail.com");

        c3.setNome("Maria");
        c3.setTelefone("11965129685");
        c3.setEmail("maria301@gmail.com");

        t.addContato(c1);
        t.addContato(c2);
        t.addContato(c3);

        System.out.println(t.getContato("Gabriel"));

        System.out.println(t.getContato("Claudio"));
        t.removeContato("Claudio");
        System.out.println(t.getContato("Claudio"));
        t.addContato(c1);
        System.out.println(t.getContato("Claudio"));
    }
}
