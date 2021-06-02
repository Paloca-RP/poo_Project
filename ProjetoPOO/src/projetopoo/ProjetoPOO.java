package projetopoo;

public class ProjetoPOO {
    
    public static void main(String[] args) {
        //BEBIDAS
        Bebida Imperial=new Bebida("Imperial",1.40,TaxaIva.VINTETRES,Tamanho.GRANDE,true);
        Bebida Refrigerante=new Bebida("Refrigerante",1.40,TaxaIva.VINTETRES,Tamanho.MEDIO,false);
        Bebida AguaPeq=new Bebida("Água",0.80,TaxaIva.SEIS,Tamanho.PEQUENO,false);
        Bebida AguaMed=new Bebida("Água",1,TaxaIva.SEIS,Tamanho.MEDIO,false);
        Bebida AguaGran=new Bebida("Água",1.10,TaxaIva.SEIS,Tamanho.GRANDE,false);
        
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
        
        System.out.println(Imperial.toString());
        System.out.println(Cola.toString());
        System.out.println(Agua.toString());
    }
    
}
