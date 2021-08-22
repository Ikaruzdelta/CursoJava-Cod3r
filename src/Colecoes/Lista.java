package Colecoes;

import java.util.ArrayList;

public class Lista {
    
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
       
        Usuario u1 = new Usuario("Ana"); //Criando Objeto
        lista.add(u1); //Add na lista
        
        lista.add(new Usuario("Carlos")); // add diretamente
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        
        System.out.println(lista.get(3));// Acesso pelo indice
        lista.remove(1);
        
        for(Usuario u: lista){
            System.out.println(u.nome);
        }
        
        //Rever essa aula com mais calma!
    }
}