package projetopoo;

public class Item{
    private Produto produto;
    private int quantidade;
    
    public Item(Produto produto, int quantidade){
        this.produto=produto;
        if(quantidade>=0)
            this.quantidade=quantidade;
        else
            this.quantidade=0;
    }
}
