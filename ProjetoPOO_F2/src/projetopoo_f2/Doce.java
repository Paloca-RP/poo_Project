/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

public class Doce extends Produto{
    private String descricao;
    private boolean caseiro;
    
    public Doce(String nome, double preco, TaxaIva iva, String descricao, boolean caseiro) {
        super(nome, preco, iva);
        this.descricao=validarDescricao(descricao);
        this.caseiro=validarCaseiro(caseiro);
    }
    
    public String validarDescricao(String descricao){
        if(descricao!=null)
            return descricao;
        else
            return "";
    }
    
    public boolean validarCaseiro(boolean caseiro){
        if(caseiro==true||caseiro==false)
            return caseiro;
        else
            return false;
    }
}
