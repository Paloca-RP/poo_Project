package projetopoo;

public class Prato extends Produto{
    private String descricao;
    
    public Prato(String nome, double preco, int iva, String descricao) {
        super(nome, preco, iva);
        if(descricao!=null)
            this.descricao=descricao;
        else
            this.descricao="";
    }
    
}
