package projetopoo;

import java.util.Scanner;

public class GestaoRestaurante {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        //BEBIDAS
        Bebida Imperial=new Bebida("Imperial",1.40,TaxaIva.VINTETRES,Tamanho.GRANDE,true);
        Bebida Refrigerante=new Bebida("Refrigerante",1.40,TaxaIva.VINTETRES,Tamanho.MEDIO,false);
        Bebida AguaPeq=new Bebida("Água Pequena",0.80,TaxaIva.SEIS,Tamanho.PEQUENO,false);
        Bebida AguaMed=new Bebida("Água Média",1,TaxaIva.SEIS,Tamanho.MEDIO,false);
        Bebida AguaGra=new Bebida("Água Grande",1.10,TaxaIva.SEIS,Tamanho.GRANDE,false);
        
        //DOCES
        Doce Mousse=new Doce("Mousse",1.50,TaxaIva.VINTETRES,"Mousse de Chocolate",true);
        Doce Pudim=new Doce("Pudim",1.50,TaxaIva.VINTETRES,"Pudim Flan",false);
        
        //PRATOS
        Prato KebabPrato=new Prato("Kebab Prato",4.99,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Arroz, Salada e Molho.");
        Prato SaladaPrato=new Prato("Salada Prato",3.5,TaxaIva.VINTETRES,"Alface, Cebola, Milho, Cenoura, Tomate e Couve Roxa");
        Prato DonerKebab=new Prato("Doner Kebab",3.3,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Salada e Molho.");
        Prato DurumKebab=new Prato("Durum Kebab",3.8,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Salada e Molho.");
        Prato Baguete=new Prato("Baguete",2.99,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Salada e Molho.");
        Prato DonerEspecial=new Prato("Doner Especial",4.49,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Salada e Molho.");
        Prato DonerBox=new Prato("Doner Box",4.4,TaxaIva.VINTETRES,"Vaca, Frango ou Mix. Batatas e Molho.");
        Prato DurumFalafel=new Prato("Durum Falafel",3.8,TaxaIva.VINTETRES,"Falafel. Salada e Molho. 100%Vegetariano.");
        Prato DonerFalafel=new Prato("Doner Falafel",3.3,TaxaIva.VINTETRES,"Falafel. Salada e Molho. 100%Vegetariano.");
        Prato DouradinhosPrato=new Prato("Douradinhos Prato",4.99,TaxaIva.VINTETRES,"Arroz ou Batatas, Salada e Molho.");
        Prato FalafelPrato=new Prato("Falafel Prato",4.99,TaxaIva.VINTETRES,"Arroz ou Batatas, Salada e Molho. 100%Vegetariano.");
        
        //SNACKS
        Snack BatataFritaPeq=new Snack("Batatas Fritas Pequena",1.2,TaxaIva.VINTETRES,Tamanho.PEQUENO,false);
        Snack BatataFritaMed=new Snack("Batatas Fritas Média",1.2,TaxaIva.VINTETRES,Tamanho.PEQUENO,false);
        Snack BatataFritaGra=new Snack("Batatas Fritas Grande",1.2,TaxaIva.VINTETRES,Tamanho.PEQUENO,false);
        
        //MESAS

        
        //MENU
        System.out.println("Insira o numero de mesas do restaurante(Min 4)-> ");
        int numMesas=scanner.nextInt();
        Restaurante restaurante=new Restaurante(numMesas);
        restaurante.prepararRestaurante();
        System.out.println(restaurante.solicitarMesa());
        System.out.println(restaurante.solicitarMesa());
        
        
    }
    
}
