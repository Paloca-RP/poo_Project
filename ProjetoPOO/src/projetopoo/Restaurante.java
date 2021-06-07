package projetopoo;

import java.util.ArrayList;

public class Restaurante {
    
    private ArrayList<Produto> produtos=new ArrayList<Produto>();
    private ArrayList<Mesa> mesas=new ArrayList<Mesa>();
    private ArrayList<Pedido> pedidosFechados=new ArrayList<Pedido>();
    
    public void registarProduto(Produto novoProduto){
        for(int i=0;i<produtos.size();i++){
            if(produtos.get(i).getNome()==novoProduto.getNome()){
                System.out.println("O produto " + novoProduto.getNome() + " já está inserido.\n");
                return;
            }   
        }
        produtos.add(novoProduto);
        System.out.println("O produto " + novoProduto.getNome() + " foi adicionado.\n");
    }
    
    
    
}
