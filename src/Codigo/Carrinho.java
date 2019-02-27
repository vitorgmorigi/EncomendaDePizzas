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
public class Carrinho {
    
    private int precoTotal;
    private String pagamento;
    private final ArrayList<Pizza> pizzas;
    private final ArrayList<Bebida> bebidas;
    private Cliente cliente;
    
    private static Carrinho instancia;
    
    public static Carrinho getInstance()
    {
        if(instancia == null)
            instancia = new Carrinho();
        
        return instancia;
    }
    
    private Carrinho()
    {
        this.pizzas = new ArrayList<>();
        this.bebidas = new ArrayList<>();
    }
    
    public void somaPreco()
    {
        
    }
    public ArrayList<Pizza> getPizzas()
    {
        return this.pizzas;
    }
    
    public int getPrecoTotal()
    {
        return this.precoTotal;
    }
    public ArrayList<Bebida> getBebidas()
    {
        return this.bebidas;
    }

    /**
     * @param precoTotal the precoTotal to set
     */
    public void setPrecoTotal(int precoTotal) {
        this.precoTotal = precoTotal;
    }

    /**
     * @return the pagamento
     */
    public String getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
}
