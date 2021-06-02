package projetopoo;

public class Mesa {
    
    private int numero;
    private boolean disponivel;
    private int pedidoAtual;
    
    public Mesa(int numero, boolean disponivel, int pedidoAtual){
        this.numero=validarNumero(numero);
        this.disponivel=validarDisponivel(disponivel);
        this.pedidoAtual=validarPedidoAtual(pedidoAtual);
    }
    
    public int validarNumero(int numero){
        if(numero>0)
            return numero;
        else
            return 0;
    }
    
    public boolean validarDisponivel(boolean disponivel){
        if(disponivel==true||disponivel==false)
            return disponivel;
        else
            return false;
    }
    
    public int validarPedidoAtual(int pedidoAtual){
        if(pedidoAtual>0)
            return pedidoAtual;
        else
            return 0;
    }
    
}
