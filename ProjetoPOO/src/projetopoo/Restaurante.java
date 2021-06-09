package projetopoo;

import java.util.ArrayList;

public class Restaurante {
    
    private ArrayList<Produto> produtos=new ArrayList<Produto>();
    private ArrayList<Mesa> mesas=new ArrayList<Mesa>();
    private ArrayList<Pedido> pedidosFechados=new ArrayList<Pedido>();
    
    public void registarProduto(Produto novoProduto){
        int inserido=0;
        for(int i=0;i<produtos.size();i++){
            if(produtos.get(i).getNome()==novoProduto.getNome())
                inserido++;
        }
        if(inserido==0){
            produtos.add(novoProduto);
            System.out.println("O produto " + novoProduto.getNome() + " foi adicionado.\n");
        }else
            System.out.println("O produto " + novoProduto.getNome() + " já está inserido.\n");
    }
    
    public Mesa solicitarMesa(){
        
        return
    }
    
    
    
    
    
}
