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
public class Sabor 
{
    private int preco;
    private String nome;
    private String classificacao;
    
    public Sabor()
    {
        
    }
    
    public Sabor(String nome, int preco, String classificacao)
    {
        this.nome = nome;
        this.preco = preco;
        this.classificacao = classificacao;
    }

    public Sabor(EnumSabores enumSabores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getPreco()
    {
        return this.preco;
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getClassificacao()
    {
        return this.classificacao;
    }
    
}
