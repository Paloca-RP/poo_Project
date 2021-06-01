package projetopoo;

public class Doce extends Produto{
    private String descricao;
    private boolean caseiro;
    
    public Doce(String nome, double preco, int iva, String descricao, boolean caseiro) {
        super(nome, preco, iva);
        if(descricao!=null)
            this.descricao=descricao;
        else
            this.descricao="";
        if(caseiro==true||caseiro==false)
            this.caseiro=caseiro;
        else
            this.caseiro=false;
    }
    
}
