package projetopoo;

public class Item{
    private Produto produto;
    private int quantidade;
    
    public Item(Produto produto, int quantidade){
        this.produto=validarProduto(produto);
        this.quantidade=validarQuantidade(quantidade);
    }
    
    public Produto validarProduto(Produto produto){
        if(produto!=null)
            return produto;
        else
            return null;
    }
    
    public int validarQuantidade(int quantidade){
        if(quantidade>=0)
            return quantidade;
        else
            return 0;
    }
}
