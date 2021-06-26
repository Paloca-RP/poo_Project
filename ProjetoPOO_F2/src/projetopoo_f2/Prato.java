/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

public class Prato extends Produto{
    private String descricao;
    
    public Prato(String nome, double preco, TaxaIva iva, String descricao) {
        super(nome, preco, iva);
        this.descricao=validarDescricao(descricao);
    }
    
    public String validarDescricao(String descricao){
        if(descricao!=null)
            return descricao;
        else
            return "";
    }
}
