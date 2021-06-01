package projetopoo;

public class Bebida extends Produto{
    private String capacidade;
    private boolean alcoolica;
    
    public Bebida(String nome, double preco, int iva, String capacidade, boolean alcoolica) {
        super(nome, preco, iva);
        if(capacidade=="Pequeno"||capacidade=="Médio"||capacidade=="Grande")
            this.capacidade=capacidade;
        else
            this.capacidade="Indefinido";
        if(alcoolica==true||alcoolica==false)
            this.alcoolica=alcoolica;
        else
            this.alcoolica=false;
        
    }
    
}
