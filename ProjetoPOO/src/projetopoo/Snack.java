package projetopoo;

public class Snack extends Produto{
    private String quantidade;
    private boolean picante;
    
    public Snack(String nome, double preco, int iva) {
        super(nome, preco, iva);
        if(quantidade=="Pequeno"||quantidade=="Médio"||quantidade=="Grande")
            this.quantidade=quantidade;
        else
            this.quantidade="Indefinido";
        if(picante==true||picante==false)
            this.picante=picante;
        else
            this.picante=false;
    }
    
}
