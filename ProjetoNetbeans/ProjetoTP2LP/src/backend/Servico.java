/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import atores.Profissional;
import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class Servico {
    private int identificador;
    private String nome;
    private double valor;
    private boolean isAtivo;
    private boolean isExecutado;
    private boolean isRecusado;
    private ArrayList<Profissional> prestadores;

    public Servico(int identificador, String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.isAtivo = false;
        this.isExecutado = false;
        this.isRecusado = false;
        this.prestadores = new ArrayList<Profissional>();
    }   
}
