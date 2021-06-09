package projetopoo;

import java.util.Scanner;

public class GestaoRestaurante {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //MENU
        System.out.println("Insira o numero de mesas do restaurante(Min 4)-> ");
        int numMesas=scanner.nextInt();
        Restaurante restaurante=new Restaurante(numMesas);
        restaurante.prepararRestaurante();
        System.out.println(restaurante.solicitarMesa());
        System.out.println(restaurante.adicionarItemPedido(1,"Kebab Prato"));
        System.out.println(restaurante.adicionarItemPedido(1,"Kebab Prato"));
        System.out.println(restaurante.adicionarItemPedido(1,"Imperial"));
        System.out.println(restaurante.servirPedido(1));
        System.out.println(restaurante.fecharPedido(1));
        System.out.println(restaurante.apresentarRecibo(1));
    }
    
}
