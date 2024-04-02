package cofrinho;

import java.util.ArrayList;

public class Lista {
    ArrayList<Moeda> lista = new ArrayList<Moeda>();

    public void adicionar(Moeda m) {
        lista.add(m);
    }

    public void remover(Moeda m) {
        lista.remove(m);
    }

    public void listar() {
        for (Moeda m : lista) {
            System.out.println(m);
        }
    }

}
