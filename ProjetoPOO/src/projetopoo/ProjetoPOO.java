package projetopoo;

public class ProjetoPOO {
    
    public static void main(String[] args) {
        Bebida b1=new Bebida("7UP",1.20,TaxaIva.VINTETRES,Tamanho.GRANDE,false);
        System.out.println(b1.toString());
    }
    
}
