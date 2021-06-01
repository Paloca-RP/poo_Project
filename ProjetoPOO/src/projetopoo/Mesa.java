package projetopoo;

public class Mesa {
    
    private int numero;
    private boolean disponivel;
    private int pedidoAtual;
    
    public Mesa(int numero, boolean disponivel, int pedidoAtual){
        if(numero>0)
            this.numero=numero;
        else
            this.numero=0;
        if(disponivel==true||disponivel==false)
            this.disponivel=disponivel;
        else
            this.disponivel=true;
        if(disponivel==false)
            this.pedidoAtual=pedidoAtual;
        else
            this.pedidoAtual=0;
    }
    
}
