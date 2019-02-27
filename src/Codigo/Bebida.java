/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author Bianca
 */
public class Bebida 
{
    private String nome;
    private int preco;
    
    private static Bebida instancia;
    
    public static Bebida getInstance()
    {
        if(instancia == null)
            instancia = new Bebida();
        
        return instancia;
    }
    
    private Bebida()
    {
        
    }
    
    public String getNome()
    {
        return this.nome;
    }
    public int getPreco()
    {
        return this.preco;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setPreco(int preco)
    {
        this.preco = preco;
    }
    
    
    
}
