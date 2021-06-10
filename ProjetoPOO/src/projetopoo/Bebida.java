package projetopoo;

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
