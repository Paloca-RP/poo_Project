package projetopoo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    
    private ArrayList<Produto> produtos=new ArrayList<Produto>();
    private Mesa[] mesas;
    private ArrayList<Pedido> pedidos=new ArrayList<Pedido>();
    
    public Restaurante(int numMesas){
        if(numMesas<4)
            mesas=new Mesa[4];
        else
            mesas=new Mesa[numMesas];
    }
    
    public void prepararRestaurante(){
        for(int i=0;i<mesas.length;i++){
            mesas[i]=new Mesa(i+1);
            System.out.println(mesas[i].toString());
        }        
    }
    
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
    
    public String solicitarMesa(){
        ArrayList<Integer> mesasLivres=new ArrayList<Integer>();
        Scanner scanner=new Scanner(System.in);
        int mesaEncontrada=0;
        for(int i=0;i<mesas.length;i++){
            if(mesas[i].verDisponivel()==true){
                mesasLivres.add(mesas[i].getNumero());
            }
        }
        if(mesasLivres.size()>1)
            System.out.println("Mesas livres: " + mesasLivres.toString() + "\n");
        if(mesasLivres.size()==1)
            System.out.println("Mesa livre: " + mesasLivres.toString() + "\n");
        if(mesasLivres.size()==0)
            return "Não existe nenhuma mesa livre.\n";
        System.out.println("Insira o numero da mesa pretendida-> ");
        int opcaoMesa=scanner.nextInt();
        for(int i=0;i<mesasLivres.size();i++){
            if(opcaoMesa==mesasLivres.get(i)){
                mesas[opcaoMesa-1].getPedidoAtual().setAbertoHora(LocalDateTime.now());
                mesas[opcaoMesa-1].getPedidoAtual().setEstado(Estado.ABERTO);
                mesas[opcaoMesa-1].setDisponivel(false);
                return "A mesa " + mesas[opcaoMesa-1].getNumero() + " está pronta.\n";
            }
        }
        return "Não inseriu uma mesa livre.\n";
    }
    
    public void adicionarItensPedido(int numMesa){
        
    }
    
    public void servirPedido(){
        
    }
    
    public void fecharPedido(){
        
    }
    
    public void verHistoricoPedidos(){
        
    }
    
    
    
    
    
}
