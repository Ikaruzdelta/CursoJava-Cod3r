package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<String>();
        
        // Offer e Add -> Adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        
        fila.add("Ana"); //Retorna false
        fila.offer("Bia"); // Lança uma exeção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        
        //Diferença é o comportamento ocorre
        //quando a fila está vazia
        
        System.out.println(fila.peek()); // Retorna false se a fila tiver vazia
        System.out.println(fila.element()); // Lança uma exeção
        
        //fila.size();
        //fila.clear(); // limpar fila
        //fila.isEmpty(); // saber se a fila está ou não vazia
        
        System.out.println(fila.poll()); //pega o primeiro elemento da fila
                                         //já eliminando
        
        
    }
}
