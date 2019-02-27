/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.ArrayList;

/**
 *
 * @author Bianca
 */
public class Pizza 
{
    private int preco;
    private final ArrayList<EnumSabores> sabores;
    private String tipoBorda;
    private String tamanho;
    private final ArrayList<EnumAdicional> adicionais;
    private String observacoes;
    
    private static Pizza instancia;
    
    public static Pizza getInstance()
    {
        if(instancia == null)
            instancia = new Pizza();
        
        return instancia;
    }
    
    private Pizza()
    {
        this.sabores = new ArrayList<>();
        this.adicionais = new ArrayList<>();
    }
    
    
    public void somaPreco()
    {

    }
    public int getPreco()
    {
        return this.preco;
    }
    
    public int calculaPreco()
    {
        int total = 0;
        for(int i = 0; i < sabores.size(); i++)
        {
            total += sabores.get(i).getPreco();
        }
        
        this.preco = (int)(total/sabores.size());
        return this.preco;
    }
    
    public ArrayList<EnumSabores> getSabores()
    {
        return this.sabores;
    }
    
    public String getTipoBorda()
    {
        return this.tipoBorda;
    }
    public String getTamanho()
    {
        return this.tamanho;
    }
    
    public void setTamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }
    
    public ArrayList<EnumAdicional> getAdicionais()
    {
        return this.adicionais;
    }
            
    public void setPreco(int preco)
    {
        this.preco = preco;
    }

    /**
     * @param tipoBorda the tipoBorda to set
     */
    public void setTipoBorda(String tipoBorda) {
        this.tipoBorda = tipoBorda;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
}
