package projetopoo;

public class ProjetoPOO {
    
    public static void main(String[] args) {
        Bebida Imperial=new Bebida("Imperial",1.40,TaxaIva.VINTETRES,Tamanho.GRANDE,true);
        Bebida Refrigerante=new Bebida("Refrigerante",1.40,TaxaIva.VINTETRES,Tamanho.MEDIO,false);
        Bebida AguaPeq=new Bebida("Água",0.80,TaxaIva.SEIS,Tamanho.PEQUENO,false);
        Bebida AguaMed=new Bebida("Água",1,TaxaIva.SEIS,Tamanho.MEDIO,false);
        Bebida AguaGran=new Bebida("Água",1.10,TaxaIva.SEIS,Tamanho.GRANDE,false);
        
        
        Doce Mousse=new Doce("Mousse",1.50,TaxaIva.VINTETRES,"Mousse de Chocolate",true);
        Doce Pudim=new Doce("Pudim",1.50,TaxaIva.VINTETRES,"Pudim Flan",false);
        Prato KebabPrato=new Prato("Kebab Prato",4.99,TaxaIva.VINTETRES,"");
        Prato SaladaPrato=new Prato("Salada Prato",3.5,TaxaIva.VINTETRES,"");
        Prato DonerKebab=new Prato("Doner Kebab",3.3,TaxaIva.VINTETRES,"");
        Prato DurumKebab=new Prato("Durum Kebab",3.8,TaxaIva.VINTETRES,"");
        Prato Baguete=new Prato("Baguete",2.99,TaxaIva.VINTETRES,"");
        Prato DonerEspecial=new Prato("Doner Especial",4.49,TaxaIva.VINTETRES,"");
        Prato DonerBox=new Prato("Doner Box",4.4,TaxaIva.VINTETRES,"");
        Prato DurumFalafel=new Prato("Durum Falafel",3.8,TaxaIva.VINTETRES,"");
        Prato DonerFalafel=new Prato("Doner Falafel",3.3,TaxaIva.VINTETRES,"");
        Prato DouradinhosPrato=new Prato("Douradinhos Prato",4.99,TaxaIva.VINTETRES,"");
        Prato FalafelPrato=new Prato("Falafel Prato",4.99,TaxaIva.VINTETRES,"");
        System.out.println(Imperial.toString());
        System.out.println(Refrigerante.toString());
        System.out.println(AguaPec.toString());
    }
    
}
