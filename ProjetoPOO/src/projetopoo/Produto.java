package projetopoo;

public class Produto {
    
   private String nome;
   private double preco;
   private int iva;
   
   public Produto (String nome, double preco, int iva){
       if(nome!=null)
           this.nome=nome;
       else
           this.nome="";
       if(preco>=0)
           this.preco=preco;
       else
           this.preco=-1;
       if(iva==6||iva==13||iva==23)
           this.iva=iva;
       else
           this.iva=-1;
   }
}
