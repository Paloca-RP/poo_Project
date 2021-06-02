package projetopoo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private ArrayList <Produto> produtos;
    private LocalDateTime abertoHora;
    private LocalDateTime fechadoHora;
    private Estado estado;
            
    public Pedido(){
        this.produtos=new ArrayList<Produto>();
        this.abertoHora=LocalDateTime.now();
        this.fechadoHora=null;
        this.estado=Estado.ABERTO;
    }
}
