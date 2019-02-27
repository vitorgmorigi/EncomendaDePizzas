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
public class Cliente 
{

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the numeroCasa
     */
    public int getNumeroCasa() {
        return numeroCasa;
    }

    /**
     * @param numeroCasa the numeroCasa to set
     */
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the fone1
     */
    public String getFone1() {
        return fone1;
    }

    /**
     * @param fone1 the fone1 to set
     */
    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    /**
     * @return the fone2
     */
    public String getFone2() {
        return fone2;
    }

    /**
     * @param fone2 the fone2 to set
     */
    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }
    private String rua;
    private String bairro;
    private String cidade;
    private int numeroCasa;
    private String complemento;
    private String nome;
    private String fone1;
    private String fone2;
    private final String login;
    private final String senha;
    private final String confSenha;
    
    
    
    public Cliente (String nome, String fone1, String bairro, String rua, int numeroCasa, String cidade, String login, String senha, String confSenha) // fone2 e complemento NULOS
    {
        this.nome = nome;
        this.fone1 = fone1;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.login = login;
        this.senha = senha;
        this.confSenha = confSenha;
    }
    
    public Cliente (String nome, String fone1, String fone2, String bairro, String rua, int numeroCasa, String cidade, String complemento, String login, String senha, String confSenha) // todos os dados preenchidos
    {
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.complemento = complemento;
        this.login = login;
        this.senha = senha;
        this.confSenha = confSenha;
    }
    
    public Cliente (String nome, String fone1, String bairro, String rua, int numeroCasa, String cidade, String complemento, String login, String senha, String confSenha) // apenas fone2 NULO
    {
        this.nome = nome;
        this.fone1 = fone1;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.complemento = complemento;
        this.login = login;
        this.senha = senha;
        this.confSenha = confSenha;
    }
    
    public Cliente (String nome, String fone1, String fone2, String bairro, String rua, int numeroCasa, String cidade, String login, String senha, String confSenha) // apenas complemento NULO
    {
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.login = login;
        this.senha = senha;
        this.confSenha = confSenha;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @return the confSenha
     */
    public String getConfSenha() {
        return confSenha;
    }
    
   
    
}
