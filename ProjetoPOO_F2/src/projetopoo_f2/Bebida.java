/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

public class Bebida extends Produto{
    private Tamanho tamanho;
    private boolean alcoolica;
    
    public Bebida(String nome, double preco, TaxaIva iva, Tamanho tamanho, boolean alcoolica) {
        super(nome, preco, iva);
        this.tamanho=validarTamanho(tamanho);
        this.alcoolica=validarAlcoolica(alcoolica);        
    }
    
    public Tamanho validarTamanho(Tamanho tamanho){
        if(tamanho!=null)
            return tamanho;
        else
            return null;
    }
    
    public boolean validarAlcoolica(boolean alcoolica){
        if(alcoolica==true||alcoolica==false)
            return alcoolica;
        else
            return false;
    }    
}
