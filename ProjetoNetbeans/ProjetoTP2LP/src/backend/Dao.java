/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import atores.Usuario;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan
 */
public class Dao {
    private void salvarUsuarios(ArrayList<Usuario> usuarios){
        String nomeArq = "usuarios.bin";
        FileOutputStream arqOs;
        try {
            arqOs = new FileOutputStream(nomeArq, false);
            ObjectOutputStream os = new ObjectOutputStream(arqOs);
            os.writeObject(usuarios);
            os.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    private void salvarServicos(ArrayList<Servico> servicos){
        String nomeArq = "servicos.bin";
        FileOutputStream arqOs;
        try {
            arqOs = new FileOutputStream(nomeArq, false);
            ObjectOutputStream os = new ObjectOutputStream(arqOs);
            os.writeObject(servicos);
            os.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void salvarOrcamentos(ArrayList<Orcamento> orcamentos){
        String nomeArq = "orcamentos.bin";
        FileOutputStream arqOs;
        try {
            arqOs = new FileOutputStream(nomeArq, false);
            ObjectOutputStream os = new ObjectOutputStream(arqOs);
            os.writeObject(orcamentos);
            os.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void salvarDados(ArrayList<Usuario> usuarios, ArrayList<Servico> servicos, ArrayList<Orcamento> orcamentos) {
        salvarUsuarios(usuarios);
        salvarServicos(servicos);
        salvarOrcamentos(orcamentos);
    }
       
    public ArrayList<Usuario> recuperarUsuarios(){
        String nomeArq = "usuarios.bin";
        try{
            FileInputStream arqIs = new FileInputStream(nomeArq);
            ObjectInputStream is = new ObjectInputStream(arqIs);
            ArrayList<Usuario> usuarios = (ArrayList<Usuario>) is.readObject();
            arqIs.close();
            return usuarios;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }

    ArrayList<Servico> recuperarServicos() {
        String nomeArq = "servicos.bin";
        try{
            FileInputStream arqIs = new FileInputStream(nomeArq);
            ObjectInputStream is = new ObjectInputStream(arqIs);
            ArrayList<Servico> servicos = (ArrayList<Servico>) is.readObject();
            arqIs.close();
            return servicos;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    ArrayList<Orcamento> recuperarOrcamentos() {
        String nomeArq = "orcamentos.bin";
        try{
            FileInputStream arqIs = new FileInputStream(nomeArq);
            ObjectInputStream is = new ObjectInputStream(arqIs);
            ArrayList<Orcamento> orcamentos = (ArrayList<Orcamento>) is.readObject();
            arqIs.close();
            return orcamentos;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
