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
public enum EnumAdicional {
    
    
    ALHO("Alho", 2),
    CEBOLA("Cebola", 3),
    CATUPIRY("Catupiry", 4),
    BACON("Bacon", 4);
    
    
    private final String nome;
    private final int preco;
    
    
    EnumAdicional(String nome, int preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }
    
    
}
