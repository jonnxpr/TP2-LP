/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import atores.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class EstruturaDeDados {
    private static EstruturaDeDados instancia;
    private final Dao dao;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Servico> servicos;
    private ArrayList<Orcamento> orcamentos;
    
    public EstruturaDeDados() {
        this.dao = new Dao();
        //usuarios = new ArrayList<Usuario>();
        //servicos = new ArrayList<Servico>();
        //orcamentos = new ArrayList<Orcamento>();
        //salvarDados();
        recuperarDados();
    }

    public static synchronized EstruturaDeDados getInstance(){
        if (instancia == null){
            instancia = new EstruturaDeDados();
        }
        return instancia;
    } 

    public void salvarDados(){
        dao.salvarDados(usuarios,servicos,orcamentos);
    }
    
    private void recuperarDados(){
        this.usuarios = (dao.recuperarUsuarios() == null) ? new ArrayList<Usuario>() : dao.recuperarUsuarios();
        this.servicos = (dao.recuperarServicos() == null) ? new ArrayList<Servico>() : dao.recuperarServicos();
        this.orcamentos = (dao.recuperarOrcamentos() == null) ? new ArrayList<Orcamento>() : dao.recuperarOrcamentos();
    }
    
    public boolean isLoginOk(String nickname, String senha){
        for (Usuario us : usuarios){
            if (us.getNickname().equals(nickname) && us.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
    
    public int getPermissaoUsuario(String nickname){
        for (Usuario us : usuarios){
            if (us.getNickname().equals(nickname)){
                return us.getPermissao();
            }
        }
        return -1;
    }
    public void cadastrarUsuario(Usuario usuario){
        usuarios.add(usuario);
        salvarDados();
    }

    public void cadastrarServico(Servico servico){
        servicos.add(servico);
    }

    public void cadastrarOrcamento(Orcamento orcamento){
        orcamentos.add(orcamento);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }

    public ArrayList<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(ArrayList<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    public boolean checaNomeUsuario(String usuario) {
      
        for (Usuario us : usuarios){
            if (us.getNickname().equals(usuario)){
                return true;
            }
        }
        
        return false;
    }
}
