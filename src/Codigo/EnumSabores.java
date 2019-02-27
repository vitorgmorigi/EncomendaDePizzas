/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author Vitor
 */
public enum EnumSabores {
    
    QUATROQUEIJOS("Quatro Queijos", 35, "Tradicional"),
    CALABRESA("Calabresa", 35, "Tradicional"),
    FRANGO("Frango", 35, "Tradicional"),
    PORTUGUESA("Portuguesa", 35, "Tradicional"),
    CATUPERU("Catuperu", 40,"Intermediária"),
    PEPPERONI("Pepperoni", 40, "Intermediária"),
    ATUM("Atum", 40, "Intermediária"),
    FILEMIGNON("Filé Mignon", 48, "Especial"),
    STROGONOFF("Strogonoff", 48, "Especial"),
    CAMARAO("Camarão", 48, "Especial");
    
    private final int preco;
    private final String nome;
    private final String classificacao;
    
    
    EnumSabores(String nome, int preco, String classificacao)
    {
        this.preco = preco;
        this.nome = nome;
        this.classificacao = classificacao;
    }
    
    public int getPreco()
    {
        return preco;
    }
    
    public String getNome()
    {
        return nome;
    }
            
}
