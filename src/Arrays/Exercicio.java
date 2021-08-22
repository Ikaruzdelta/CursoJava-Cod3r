package Arrays;

import java.util.Arrays;
/**
 *
 * @author Ikaruz
 */
public class Exercicio {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        
        //Arrays.toString(notasAlunoA) = para mostrar todos os valores
        System.out.println(Arrays.toString(notasAlunoA));
        
        double total = 0;
        
        //para percorrer o array
        for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        
        //Mostrar a média
        System.out.println("A média do aluno é: " + total/notasAlunoA.length);
    }
    
}
