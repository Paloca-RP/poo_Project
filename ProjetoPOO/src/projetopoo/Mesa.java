package projetopoo;

public class Mesa {
    
    private int numero;
    private boolean disponivel;
    private Pedido pedidoAtual;
    
    public Mesa(int numero){
        this.numero=validarNumero(numero);
        this.disponivel=true;
        this.pedidoAtual=new Pedido();
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
    
    public Pedido validarPedidoAtual(Pedido pedidoAtual){
        if(pedidoAtual!=null)
            return pedidoAtual;
        else
            return null;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero=validarNumero(numero);
    }

    public boolean verDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel=validarDisponivel(disponivel);
    }

    public Pedido getPedidoAtual(){
        return pedidoAtual;
    }

    public void setPedidoAtual(Pedido pedidoAtual){
        this.pedidoAtual=validarPedidoAtual(pedidoAtual);
    }
    
    public String toString(){
        return "Mesa: " + this.numero + "\nDisponivel: " + this.disponivel + "\nPedido Atual:\n" + this.pedidoAtual.toString() + "\n";
    }
}
