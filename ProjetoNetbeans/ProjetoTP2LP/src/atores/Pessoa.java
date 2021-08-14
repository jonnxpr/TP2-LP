/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atores;

import java.io.Serializable;

/**
 *
 * @author Jonathan
 */
abstract public class Pessoa implements Serializable {
    private String nome;
    private String Cpf;
    
    public Pessoa(String nome, String Cpf){
        this.nome = nome;
        this.Cpf = Cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }  
}
