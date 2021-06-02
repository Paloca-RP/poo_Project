package projetopoo;

public class Bebida extends Produto{
    private String capacidade;
    private boolean alcoolica;
    
    public Bebida(String nome, double preco, int iva, String capacidade, boolean alcoolica) {
        super(nome, preco, iva);
        this.capacidade=validarCapacidade(capacidade);
        this.alcoolica=validarAlcoolica(alcoolica);
        
    }
    
    public String validarCapacidade(String capacidade){
        if(capacidade=="Pequeno"||capacidade=="Médio"||capacidade=="Grande")
            return capacidade;
        else
            return "";
    }
    
    public boolean validarAlcoolica(boolean alcoolica){
        if(alcoolica==true||alcoolica==false)
            return alcoolica;
        else
            return false;
    }
    
}
