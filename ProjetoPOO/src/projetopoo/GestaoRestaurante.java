package projetopoo;

import java.util.Scanner;

public class GestaoRestaurante {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insira o numero de mesas do restaurante(Min 4)-> ");
        int numMesas=scanner.nextInt();
        Restaurante restaurante=new Restaurante(numMesas);
        restaurante.prepararRestaurante();
        System.out.println("\n\n\n-------------Kebabs do Norte--------------");
        //MENU
        int opcao=0;
        do{
            System.out.println("-------------------Menu-------------------");
            System.out.println("1 - Criar Produto");
            System.out.println("2 - Solicitar Mesa");
            System.out.println("3 - Adicionar Items a Pedido");
            System.out.println("4 - Atualizar Pedido para Servido");
            System.out.println("5 - Fechar Pedido/Apresentar Recibo");
            System.out.println("6 - Consultar Histórico de Pedidos");
            System.out.println("7 - Exportar Histórico de Pedidos");
            System.out.println("0-Sair");
            System.out.println("------------------------------------------");
            System.out.println("Insira o numero de mesas do restaurante(Min 4)-> ");
            opcao=scanner.nextInt();
            switch(opcao){
                case 1:restaurante.registarProduto();break;
                case 2:restaurante.solicitarMesa();break;
                case 3:restaurante.adicionarItemPedido();break;
                case 4:break;
                case 5:break;
                case 6:break;
                case 7:break;
                case 0:break;
                
            }
            
            
            
        }while(opcao!=0);
        System.out.println(restaurante.solicitarMesa());
        System.out.println(restaurante.adicionarItemPedido(1,"Kebab Prato"));
        System.out.println(restaurante.adicionarItemPedido(1,"Kebab Prato"));
        System.out.println(restaurante.adicionarItemPedido(1,"Imperial"));
        System.out.println(restaurante.servirPedido(1));
        System.out.println(restaurante.fecharPedido(1));
        System.out.println(restaurante.apresentarRecibo(1));
        System.out.println(restaurante.solicitarMesa());
    }
    
}
