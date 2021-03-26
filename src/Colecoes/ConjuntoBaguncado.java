package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Este metodo começa a se levar para a lista

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        
        //Set<String> ListaAprovados = new HashSet(); // Não fica em ordem
        TreeSet<String> ListaAprovados = new TreeSet(); // -> Deixa em ordem
        
        ListaAprovados.add("Ana");
        ListaAprovados.add("Carlos");
        ListaAprovados.add("Lucas");
        ListaAprovados.add("Pedro");
        
        for(String candidato: ListaAprovados){
            System.out.println(candidato);
        }
    }
}
