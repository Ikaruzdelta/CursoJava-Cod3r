package Arrays;

import java.util.Scanner;
//Testando
public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int quantidadeNotas;
        double soma = 0;
        
        System.out.println("Quantas notas você quer informar?");
        quantidadeNotas = entrada.nextInt();
        
        double[] notasAluno = new double[quantidadeNotas];
        
        for(int i = 0; i < notasAluno.length; i++){
            System.out.println("Digite a nota " + (i+1) + ":");
            notasAluno[i] = entrada.nextDouble();
            soma += notasAluno[i];
        }
        
        System.out.println("Média do aluno: " + soma/notasAluno.length);
    }
}
