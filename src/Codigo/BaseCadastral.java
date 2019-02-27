/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.ArrayList;

/**
 *
 * @author 55489
 */
public class BaseCadastral {
    
    private ArrayList<Cliente> cadastros;
    private String ultimoLogin;
    
    private static BaseCadastral instancia;
    
    public static BaseCadastral getInstance()
    {
        if(instancia == null)
            instancia = new BaseCadastral();
        
        return instancia;
    }
    
    private BaseCadastral()
    {
        this.cadastros = new ArrayList<>();
    }
    
    
    public void adicionaCadastro(Cliente cliente)
    {
        this.getCadastros().add(cliente);
    }
    
    public boolean verificaCadastro(String login, String senha)
    {
        
        for(Cliente c : this.cadastros)
        {
            if(c.getLogin().equals(login) && c.getSenha().equals(senha))
                return true;
                
        }
        
        return false;
    }

    /**
     * @return the cadastros
     */
    public ArrayList<Cliente> getCadastros() {
        return cadastros;
    }

    /**
     * @return the ultimoLogin
     */
    public String getUltimoLogin() {
        return ultimoLogin;
    }

    /**
     * @param ultimoLogin the ultimoLogin to set
     */
    public void setUltimoLogin(String ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }
    
}
