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
            opcao=scanner.nextInt();
            switch(opcao){
                case 1:restaurante.registarProduto();break;
                case 2:System.out.println(restaurante.toStringProdutos());break;
                case 3:System.out.println(restaurante.solicitarMesa());break;
                case 4:System.out.println(restaurante.toStringMesas());break;
                case 5:System.out.println(restaurante.adicionarItemPedido());break;
                case 6:System.out.println(restaurante.servirPedido());break;
                case 7:System.out.println(restaurante.fecharPedido());break;
                case 8:break;
                case 9:break;
                case 0:System.out.println("Vai sair!");break;
            }
        }while(opcao!=0);
    }
    
}
