package projetopoo;

public class Doce extends Produto{
    private String descricao;
    private boolean caseiro;
    
    public Doce(String nome, double preco, TaxaIva iva, String descricao, boolean caseiro) {
        super(nome, preco, iva);
        this.descricao=validarDescricao(descricao);
        this.caseiro=validarCaseiro(caseiro);
    }
    
    public String validarDescricao(String descricao){
        if(descricao!=null)
            return descricao;
        else
            return "";
    }
    
    public boolean validarCaseiro(boolean caseiro){
        if(caseiro==true||caseiro==false)
            return caseiro;
        else
            return false;
    }
}
