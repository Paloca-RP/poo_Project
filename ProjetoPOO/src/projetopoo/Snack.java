package projetopoo;

public class Snack extends Produto{
    private String quantidade;
    private boolean picante;
    
    public Snack(String nome, double preco, int iva) {
        super(nome, preco, iva);
        this.quantidade=validarQuantidade(quantidade);
        this.picante=validarCaseiro(picante);
    }
    
    public String validarQuantidade(String quantidade){
        if(quantidade!=null)
            return quantidade;
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
