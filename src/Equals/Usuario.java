/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equals;

/**
 *
 * @author Ikaruz
 */
public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {

            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
            
    }
}
