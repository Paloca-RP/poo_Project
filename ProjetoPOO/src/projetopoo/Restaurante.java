package projetopoo;

import java.text.DecimalFormat;
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
        //BEBIDAS
        produtos.add(new Bebida("Imperial",1.40,TaxaIva.VINTETRES,Tamanho.GRANDE,true));
        produtos.add(new Bebida("Refrigerante",1.40,TaxaIva.VINTETRES,Tamanho.MEDIO,false));
        produtos.add(new Bebida("Água Pequena",0.80,TaxaIva.SEIS,Tamanho.PEQUENO,false));
        produtos.add(new Bebida("Água Média",1,TaxaIva.SEIS,Tamanho.MEDIO,false));
        produtos.add(new Bebida("Água Grande",1.10,TaxaIva.SEIS,Tamanho.GRANDE,false));
        
        //DOCES
        produtos.add(new Doce("Mousse",1.50,TaxaIva.VINTETRES,"Mousse de Chocolate",true));
        produtos.add(new Doce("Pudim",1.50,TaxaIva.VINTETRES,"Pudim Flan",false));
        
        //PRATOS
        produtos.add(new Prato("Kebab Prato",4.99,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Arroz, Salada e Molho."));
        produtos.add(new Prato("Salada Prato",3.5,TaxaIva.VINTETRES,"Alface, Cebola, Milho, Cenoura, Tomate e Couve Roxa"));
        produtos.add(new Prato("Doner Kebab",3.3,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Salada e Molho."));
        produtos.add(new Prato("Durum Kebab",3.8,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Salada e Molho."));
        produtos.add(new Prato("Baguete",2.99,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Salada e Molho."));
        produtos.add(new Prato("Doner Especial",4.49,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Salada e Molho."));
        produtos.add(new Prato("Doner Box",4.4,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Batatas e Molho."));
        produtos.add(new Prato("Durum Falafel",3.8,TaxaIva.VINTETRES,"Falafel. Salada e Molho. 100%Vegetariano."));
        produtos.add(new Prato("Doner Falafel",3.3,TaxaIva.VINTETRES,"Falafel. Salada e Molho. 100%Vegetariano."));
        produtos.add(new Prato("Douradinhos Prato",4.99,TaxaIva.VINTETRES,"Arroz ou Batatas, Salada e Molho."));
        produtos.add(new Prato("Falafel Prato",4.99,TaxaIva.VINTETRES,"Arroz ou Batatas, Salada e Molho. 100%Vegetariano."));
        
        //SNACKS
        produtos.add(new Snack("Batatas Fritas Pequena",1.2,TaxaIva.VINTETRES,Tamanho.PEQUENO,false));
        produtos.add(new Snack("Batatas Fritas Média",1.2,TaxaIva.VINTETRES,Tamanho.PEQUENO,false));
        produtos.add(new Snack("Batatas Fritas Grande",1.2,TaxaIva.VINTETRES,Tamanho.PEQUENO,false));
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
        System.out.println("----------Solicitar Mesa----------");
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
                return "A mesa " + mesas[opcaoMesa-1].getNumero() + " está pronta!\n";
            }
        }
        return "Não inseriu uma mesa livre.\n";
    }
    
    public String adicionarItemPedido(int numMesa,String nomeProduto){
        System.out.println("----------Adicionar Item----------");
        for(int i=0;i<mesas.length;i++){
            if(mesas[i].getNumero()==numMesa){
                if(mesas[i].verDisponivel()==false){
                    for(int j=0;j<produtos.size();j++){
                        if(produtos.get(j).getNome()==nomeProduto){
                            mesas[i].getPedidoAtual().adicionarProduto(produtos.get(j));
                            mesas[i].getPedidoAtual().setEstado(Estado.PREPARACAO);
                            return produtos.get(j).getNome() + " foi adicionado ao pedido!\n";
                        }
                    }
                    return "Não foi possivel encontrar o produto " + nomeProduto + ".\n";
                }
                return "A mesa " + mesas[i].getNumero() + " está vazia.\n";
            }
            
        }
        return "Não foi possivel encontrar a mesa " + numMesa + ".\n";
    }
    
    public String servirPedido(int numMesa){
        for(int i=0;i<mesas.length;i++){
            if(mesas[i].getNumero()==numMesa){
                if(mesas[i].verDisponivel()==false){
                    if(mesas[i].getPedidoAtual().getEstado()==Estado.PREPARACAO){
                        mesas[i].getPedidoAtual().setEstado(Estado.SERVIDO);
                        return "O estado do pedido foi alterado para " + mesas[i].getPedidoAtual().getEstado() + "!\n";
                    }
                    else if(mesas[i].getPedidoAtual().getEstado()==Estado.ABERTO||mesas[i].getPedidoAtual().getEstado()==Estado.SERVIDO)
                        return "O pedido não tem nada em preparação.\n";
                    else if(mesas[i].getPedidoAtual().getEstado()==Estado.FECHADO)
                        return "O pedido já foi encerrado.\n";
                }
                return "A mesa " + mesas[i].getNumero() + " está vazia.\n";
            }
        }
        return "Não foi possivel encontrar a mesa " + numMesa + ".\n";
    }
    
    public String fecharPedido(int numMesa){
        for(int i=0;i<mesas.length;i++){
            if(mesas[i].getNumero()==numMesa){
                if(mesas[i].verDisponivel()==false){
                    if(mesas[i].getPedidoAtual().getEstado()==Estado.SERVIDO||mesas[i].getPedidoAtual().getEstado()==Estado.ABERTO){
                        mesas[i].getPedidoAtual().setEstado(Estado.FECHADO);
                        mesas[i].setDisponivel(true);
                        return "O estado do pedido foi alterado para " + mesas[i].getPedidoAtual().getEstado() + "!\n";
                    }
                    else if(mesas[i].getPedidoAtual().getEstado()==Estado.PREPARACAO)
                        return "O pedido tem produtos em preparação.\n";
                    else if(mesas[i].getPedidoAtual().getEstado()==Estado.FECHADO)
                        return "O pedido já está fechado.\n";
                }
                return "A mesa " + mesas[i].getNumero() + " está vazia.\n";
            }
        }
        return "Não foi possivel encontrar a mesa " + numMesa + ".\n";
    }
    
    public String apresentarRecibo(int numMesa){
        String output = "";
        float total=0;
        int produtosAdicionados=0;
        DecimalFormat duasCasas = new DecimalFormat("0.00");
        for(int i=0;i<mesas.length;i++){
            if(mesas[i].getNumero()==numMesa){
                output += "------------------Recibo------------------\n";
                output += "Kebabs do Norte\n";
                output += "------------------------------------------\n";
                for(int j=0;j<mesas[i].getPedidoAtual().getProdutos().size();j++){
                    output += "Produto: " + mesas[i].getPedidoAtual().getProdutos().get(j).getNome();
                    output += "   Quantidade: 1\n";
                    output += "IVA: " + mesas[i].getPedidoAtual().getProdutos().get(j).getIva() * 100 + "%";
                    output += "   s/IVA: " + duasCasas.format(mesas[i].getPedidoAtual().getProdutos().get(j).getPreco() - mesas[i].getPedidoAtual().getProdutos().get(j).getPreco() * mesas[i].getPedidoAtual().getProdutos().get(j).getIva()) + "€";
                    output += "   c/IVA: " + duasCasas.format(mesas[i].getPedidoAtual().getProdutos().get(j).getPreco()) + "€";
                    output += "\n";
                    total += mesas[i].getPedidoAtual().getProdutos().get(j).getPreco();
                    produtosAdicionados++;
                }
                if(produtosAdicionados==0)
                    output += "Nenhum produto consumido\n";
                output += "------------------------------------------\n";
                output += "Valor final: " + duasCasas.format(total) + "€\n";
                output += "------------------------------------------\n";
                return output;
            }
        }
        output += "Não foi possivel encontrar a mesa " + numMesa + ".\n";
        return output;
    }
    
    public void verHistoricoPedidos(){
        
    }
    
    public void exportarHistorico(){
        
    }
    
    public String toStringMesas(){
        String output = "";
        output += "Mesas:\n";
        for(int i=0;i<mesas.length;i++){
            output += mesas[i].toString();
        }        
        return output;
    }
    
    
    
}
