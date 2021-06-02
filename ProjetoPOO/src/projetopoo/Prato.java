package projetopoo;

public class Prato extends Produto{
    private String descricao;
    
    public Prato(String nome, double preco, int iva, String descricao) {
        super(nome, preco, iva);
        this.descricao=validardescricao(descricao);
    }
    
    public String validardescricao(String descricao){
        if(descricao!=null)
            return descricao;
        else
            return "";
    }
    
}
