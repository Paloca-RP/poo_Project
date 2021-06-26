/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurante{
    
    private ArrayList<Produto> produtos;
    private Mesa[] mesas;
    private ArrayList<String> historicoPedidos;
    
    public Restaurante(int numMesas){
        if(numMesas<4)
            mesas=new Mesa[4];
        else
            mesas=new Mesa[numMesas];
        produtos=new ArrayList<Produto>();
        historicoPedidos=importarHistorico();
    }
    
    public void prepararRestaurante(){
        try{
            for(int i=0;i<mesas.length;i++){
                mesas[i]=new Mesa(i+1);
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
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
        }
    }
    
    public void apresentarMenu(){
        System.out.println("-------------------Menu-------------------");
        System.out.println("1 - Criar Produto");
        System.out.println("2 - Ver Lista de Produtos");
        System.out.println("3 - Solicitar Mesa");
        System.out.println("4 - Ver Lista de Mesas");
        System.out.println("5 - Adicionar Items a Pedido");
        System.out.println("6 - Atualizar Pedido para Servido");
        System.out.println("7 - Fechar Pedido/Apresentar Recibo");
        System.out.println("8 - Consultar Histórico de Pedidos");
        System.out.println("9 - Exportar Histórico de Pedidos");
        System.out.println("0-Sair");
        System.out.println("------------------------------------------");
        System.out.println("Insira a sua opção-> ");
    }
    
    public String registarProduto(){
        try{
            int tipoProduto=0;
            int escolhaIva=0;
            int escolhaTamanho=0;
            TaxaIva taxaProduto=null;
            Tamanho tamanhoBebida=null;
            Tamanho quantidadeSnack=null;
            Scanner scanner=new Scanner(System.in);
            System.out.println("----------Registar Produto----------");
            //ESCOLHER TIPO DE PRODUTO
            do{
                System.out.println("------Tipo de Produto------");
                System.out.println("1 - Bebida");
                System.out.println("2 - Doce");
                System.out.println("3 - Prato");
                System.out.println("4 - Snack");
                System.out.println("0 - Cancelar");
                System.out.println("---------------------------");
                System.out.println("Insira o tipo de Produto-> ");
                tipoProduto=scanner.nextInt();
                scanner.nextLine();
                if(tipoProduto<0||tipoProduto>4)
                    System.out.println("Insira uma opção válida!\n");
                if(tipoProduto==0)
                    return "Operação cancelada";
            }while(tipoProduto<0||tipoProduto>4);
            //NOME DO PRODUTO
            System.out.println("Insira o nome do Produto-> ");
            String nomeProduto=scanner.nextLine();
            scanner.nextLine();
            //VERIFICAR SE JÁ EXISTE
            for(int i=0;i<produtos.size();i++){
                if(produtos.get(i).getNome().contentEquals(nomeProduto))
                    return "O produto " + nomeProduto + " já está inserido.\n";
            }
            //PREÇO DO PRODUTO
            double precoProduto=0;
            try{
                System.out.println("Insira o preço do Produto(xx,xx)-> ");
                precoProduto=scanner.nextDouble();
                
            }catch(InputMismatchException e){
                System.out.println("Erro, inseriu o preço com '.'\n");
            }catch(Exception e){
                System.out.println("Ocorreu um erro.\n");
            }
            scanner.nextLine();
            //TAXA DE IVA DO PRODUTO
            do{
                System.out.println("------Taxa de IVA------");
                System.out.println("6  - 6%");
                System.out.println("13 - 13%");
                System.out.println("23 - 23%");
                System.out.println("---------------------------");
                System.out.println("Insira a taxa de iva do Produto-> ");
                escolhaIva=scanner.nextInt();
                scanner.nextLine();
                if(escolhaIva!=6&&escolhaIva!=13&&escolhaIva!=23){
                    System.out.println("Insira uma opção válida!\n");
                }
            }while(escolhaIva!=6&&escolhaIva!=13&&escolhaIva!=23);
            switch(escolhaIva){
                case 6:taxaProduto=TaxaIva.SEIS;break;
                case 13:taxaProduto=TaxaIva.TREZE;break;
                case 23:taxaProduto=TaxaIva.VINTETRES;break;
            }
            //PEDIDOS ESPECIAIS PARA CADA TIPO DE PRODUTO
            switch(tipoProduto){
                case 1:{//BEBIDA
                    //TAMANHO
                    do{
                        System.out.println("----------Tamanho----------");
                        System.out.println("1 - Pequeno");
                        System.out.println("2 - Médio");
                        System.out.println("3 - Grande");
                        System.out.println("---------------------------");
                        System.out.println("Insira o tamanho da Bebida-> ");
                        escolhaTamanho=scanner.nextInt();
                        scanner.nextLine();
                        if(escolhaTamanho!=1&&escolhaTamanho!=2&&escolhaTamanho!=3){
                            System.out.println("Insira uma opção válida!\n");
                        }
                    }while(escolhaTamanho!=1&&escolhaTamanho!=2&&escolhaTamanho!=3);
                    switch(escolhaTamanho){
                        case 1:tamanhoBebida=Tamanho.PEQUENO;break;
                        case 2:tamanhoBebida=Tamanho.MEDIO;break;
                        case 3:tamanhoBebida=Tamanho.GRANDE;break;
                    }
                    //ALCOOLICA
                    System.out.println("A Bebida é alcoólica?(true/false)-> ");
                    boolean alcoolicaBebida=scanner.hasNextBoolean();
                    scanner.nextLine();
                    //ADICIONA BEBIDA
                    produtos.add(new Bebida(nomeProduto,precoProduto,taxaProduto,tamanhoBebida,alcoolicaBebida));
                    break;
                }
                case 2:{//DOCE
                    //DESCRIÇÃO
                    System.out.println("Insira a descrição do Doce-> ");
                    String descricaoDoce=scanner.nextLine();
                    scanner.nextLine();
                    //CASEIRO
                    System.out.println("A Sobremesa é caseira?(true/false)-> ");
                    boolean caseiraDoce=scanner.hasNextBoolean();
                    scanner.nextLine();
                    //ADICIONAR DOCE
                    produtos.add(new Doce(nomeProduto,precoProduto,taxaProduto,descricaoDoce,caseiraDoce));
                    break;
                }
                case 3:{//PRATO
                    //DESCRIÇÃO
                    System.out.println("Insira a descrição do Prato-> ");
                    String descricaoPrato=scanner.nextLine();
                    scanner.nextLine();
                    //ADICIONAR PRATO
                    produtos.add(new Prato(nomeProduto,precoProduto,taxaProduto,descricaoPrato));
                    break;
                }
                case 4:{//SNACK
                    //TAMANHO
                    do{
                        System.out.println("----------Tamanho----------");
                        System.out.println("1 - Pequeno");
                        System.out.println("2 - Médio");
                        System.out.println("3 - Grande");
                        System.out.println("---------------------------");
                        System.out.println("Insira o tamanho do Snack-> ");
                        escolhaTamanho=scanner.nextInt();
                        scanner.nextLine();
                        if(escolhaTamanho!=1&&escolhaTamanho!=2&&escolhaTamanho!=3){
                            System.out.println("Insira uma opção válida!\n");
                        }
                    }while(escolhaTamanho!=1&&escolhaTamanho!=2&&escolhaTamanho!=3);
                    switch(escolhaTamanho){
                        case 1:quantidadeSnack=Tamanho.PEQUENO;break;
                        case 2:quantidadeSnack=Tamanho.MEDIO;break;
                        case 3:quantidadeSnack=Tamanho.GRANDE;break;
                    }
                    //PICANTE
                    System.out.println("O Snack é picante?(true/false)-> ");
                    boolean picanteSnack=scanner.hasNextBoolean();
                    scanner.nextLine();
                    //ADICIONAR SNACK
                    produtos.add(new Snack(nomeProduto,precoProduto,taxaProduto,quantidadeSnack,picanteSnack));
                    break;
                }
            }   
            return "O produto " + nomeProduto + " foi adicionado.\n";
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
            e.printStackTrace();
        }
        return null;
    }
    
    public String solicitarMesa(){
        try{
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
            scanner.nextLine();
            for(int i=0;i<mesasLivres.size();i++){
                if(opcaoMesa==mesasLivres.get(i)){
                    mesas[opcaoMesa-1].getPedidoAtual().setAbertoHora(LocalDateTime.now());
                    mesas[opcaoMesa-1].getPedidoAtual().setEstado(Estado.ABERTO);
                    mesas[opcaoMesa-1].setDisponivel(false);
                    return "A mesa " + mesas[opcaoMesa-1].getNumero() + " está pronta!\n";
                }
            }
            return "Não inseriu uma mesa livre.\n";
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
        }
        return null;
    }
    
    public String adicionarItemPedido(){
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("----------Adicionar Item----------");
            System.out.println("Insira o numero da mesa-> ");
            int numMesa=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Insira o nome do produto-> ");
            String nomeProduto=scanner.nextLine();
            scanner.nextLine();
            for(int i=0;i<mesas.length;i++){
                if(mesas[i].getNumero()==numMesa){
                    if(mesas[i].verDisponivel()==false){
                        for(int j=0;j<produtos.size();j++){
                            if(produtos.get(j).getNome().contentEquals(nomeProduto)){
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
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
        }
        return null;
    }
    
    public String servirPedido(){
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Insira o numero da mesa-> ");
            int numMesa=scanner.nextInt();
            scanner.nextLine();
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
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
        }
        return null;
    }
    
    public String fecharPedido(){
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Insira o numero da mesa-> ");
            int numMesa=scanner.nextInt();
            scanner.nextLine();
            for(int i=0;i<mesas.length;i++){
                if(mesas[i].getNumero()==numMesa){
                    if(mesas[i].verDisponivel()==false){
                        if(mesas[i].getPedidoAtual().getEstado()==Estado.SERVIDO||mesas[i].getPedidoAtual().getEstado()==Estado.ABERTO){
                            mesas[i].getPedidoAtual().setEstado(Estado.FECHADO);
                            mesas[i].getPedidoAtual().setFechadoHora(LocalDateTime.now());
                            String output = "\nO estado do pedido foi alterado para " + mesas[i].getPedidoAtual().getEstado() + "!\n" + apresentarRecibo(numMesa);
                            historicoPedidos.add(0,mesas[i].getPedidoAtual().toString());
                            mesas[i].setDisponivel(true);
                            mesas[i].getPedidoAtual().setEstado(null);
                            mesas[i].getPedidoAtual().setFechadoHora(null);
                            mesas[i].getPedidoAtual().setAbertoHora(null);
                            mesas[i].getPedidoAtual().limparProdutos();
                            return output;
                        }
                        else if(mesas[i].getPedidoAtual().getEstado()==Estado.PREPARACAO)
                            return "\nO pedido tem produtos em preparação.\n";
                        else if(mesas[i].getPedidoAtual().getEstado()==Estado.FECHADO)
                            return "\nO pedido já está fechado.\n";
                    }
                    return "\nA mesa " + mesas[i].getNumero() + " está vazia.\n";
                }
            }
            return "\nNão foi possivel encontrar a mesa " + numMesa + ".\n";
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
            e.printStackTrace();
        }
        return null;
    }
    
    public String apresentarRecibo(int numMesa){
        try{
            String output = "";
            float total=0;
            int produtosAdicionados=0;
            DecimalFormat duasCasas = new DecimalFormat("0.00");
            for(int i=0;i<mesas.length;i++){
                if(mesas[i].getNumero()==numMesa){
                    output += "\n------------------Recibo------------------\n";
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
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
        }
        return null;
    }
    
    public void exportarHistorico(){
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("historicoPedidos.bin"));
            oos.writeObject(this.historicoPedidos);
            oos.flush();
            oos.close();
            System.out.println("Histórico de Pedidos exportado.\n");
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> importarHistorico(){
        ArrayList<String> auxiliar;
        try{ 
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("historicoPedidos.bin"));
            auxiliar=(ArrayList<String>) ois.readObject();
            ois.close();
        }catch(FileNotFoundException e){
            System.out.println("O sistema não conseguiu localizar o ficheiro especificado.\n");
            auxiliar=new ArrayList<String>();
        }
        catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
            e.printStackTrace();
            auxiliar=new ArrayList<String>();
        }
        return auxiliar;
    }
    
    public String toStringMesas(){
        try{
            String output = "";
            output += "\n\n----------Lista de Mesas----------\n";
            for(int i=0;i<mesas.length;i++){
                output += mesas[i].toString();
            }        
            return output;
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
        }
        return null;
    }
    
    public String toStringProdutos(){
        try{
            String output = "";
            output += "\n\n--------Lista de Produtos---------\n";
            for(int i=0;i<produtos.size();i++){
                output += produtos.get(i).toString();
            }        
            return output;
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
        }
        return null;
    }
    
    public String toStringHistoricoPedidos(){
        try{
            String output = "";
            output += "\n\n---------Lista de Pedidos---------\n";
            for(int i=0;i<historicoPedidos.size();i++){
                output += historicoPedidos.get(i).toString();
            }
            return output;
        }catch(Exception e){
            System.out.println("Ocorreu um erro.\n");
        }
        return null;
    }
}
