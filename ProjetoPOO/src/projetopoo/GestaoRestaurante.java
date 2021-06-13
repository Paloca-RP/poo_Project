package projetopoo;

import java.util.Scanner;

public class GestaoRestaurante {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insira o numero de mesas do restaurante(Min 4)-> ");
        int numMesas=scanner.nextInt();
        scanner.nextLine();
        Restaurante restaurante=new Restaurante(numMesas);
        restaurante.prepararRestaurante();
        System.out.println("\n\n\n-------------Kebabs do Norte--------------");
        //MENU
        int opcao=0;
        do{
            restaurante.apresentarMenu();
            opcao=scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:System.out.println(restaurante.registarProduto());break;
                case 2:System.out.println(restaurante.toStringProdutos());break;
                case 3:System.out.println(restaurante.solicitarMesa());break;
                case 4:System.out.println(restaurante.toStringMesas());break;
                case 5:System.out.println(restaurante.adicionarItemPedido());break;
                case 6:System.out.println(restaurante.servirPedido());break;
                case 7:System.out.println(restaurante.fecharPedido());break;
                case 8:System.out.println(restaurante.toStringHistoricoPedidos());break;
                case 9:restaurante.exportarHistorico();break;
                case 0:System.out.println("Vai sair!");break;
                default:System.out.println("Insira uma opção válida.\n");
            }
        }while(opcao!=0);
        restaurante.exportarHistorico();
    }
}
