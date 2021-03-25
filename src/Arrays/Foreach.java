/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Ikaruz
 */
public class Foreach {

    public static void main(String[] args) {
        double[] notas = { 9.9, 8.7, 7.2, 9.4};
        
        //usando o laço ficaria:
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i] + " ");
        }
        
        //O foreach faz com que não se preocupe em fazer laço:
        for(double nota: notas){
            System.out.println(nota + "  ");
        }
    }

}