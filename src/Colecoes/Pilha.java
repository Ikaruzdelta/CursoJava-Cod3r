package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<>();
        //Pilha -> O ultimo a entrar é o primeiro a sair,
        //diferente de fila!
        
        livros.add("O pequeno Principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");
        
        System.out.println(livros.peek());
        
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
    }
}
