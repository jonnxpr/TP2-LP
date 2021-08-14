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
public class Cliente extends Usuario implements Serializable{

    public Cliente(String nickname, String telefone, String email, String endereco, String senha, String nome, String Cpf) {
        super(nickname, telefone, email, endereco, senha, 2, nome, Cpf);
    }
}
