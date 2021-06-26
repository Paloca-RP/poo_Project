/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

public class Snack extends Produto{
    private Tamanho quantidade;
    private boolean picante;
    
    public Snack(String nome, double preco, TaxaIva iva, Tamanho quantidade, boolean picante) {
        super(nome, preco, iva);
        this.quantidade=validarQuantidade(quantidade);
        this.picante=validarCaseiro(picante);
    }
    
    public Tamanho validarQuantidade(Tamanho quantidade){
        if(quantidade!=null)
            return quantidade;
        else
            return null;
    }
    
    public boolean validarCaseiro(boolean caseiro){
        if(caseiro==true||caseiro==false)
            return caseiro;
        else
            return false;
    }
}
