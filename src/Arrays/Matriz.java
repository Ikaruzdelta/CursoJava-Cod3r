package Arrays;

import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.err.println("Quantos alunos?");
        int qtdAlunos = entrada.nextInt();
        
        System.err.println("Quantos notas por alunos?");
        int qtdNotas = entrada.nextInt();
        
        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
        
        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                
                System.out.println("Informe a nota " 
                        + (n+1) + " do aluno" + (a+1));
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        
        double media = total/(qtdAlunos * qtdNotas);
        System.out.println("Média da turma é: " + media);
        entrada.close();
    }
}
