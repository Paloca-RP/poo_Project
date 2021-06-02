package projetopoo;

public class Bebida extends Produto{
    private Tamanho capacidade;
    private boolean alcoolica;
    
    public Bebida(String nome, double preco, TaxaIva iva, Tamanho capacidade, boolean alcoolica) {
        super(nome, preco, iva);
        this.capacidade=validarCapacidade(capacidade);
        this.alcoolica=validarAlcoolica(alcoolica);
        
    }
    
    public Tamanho validarCapacidade(Tamanho capacidade){
        if(capacidade!=null)
            return capacidade;
        else
            return null;
    }
    
    public boolean validarAlcoolica(boolean alcoolica){
        if(alcoolica==true||alcoolica==false)
            return alcoolica;
        else
            return false;
    }
    
    public String toString(){
        return "Bebida: " + this.nome + "\nCapacidade: " + this.capacidade + "\nPreço: " + this.preco + "\nIVA: " + this.iva + "%\nAlcoolica: " + this.alcoolica + "\n";
    }
    
}
