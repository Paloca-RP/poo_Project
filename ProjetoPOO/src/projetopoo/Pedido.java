package projetopoo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private ArrayList <Item> items;
    private LocalDateTime abertoHora;
    private LocalDateTime fechadoHora;
    private Estado estado;
            
    public Pedido(){
        this.items=new ArrayList<Item>();
        this.abertoHora=LocalDateTime.now();
        this.fechadoHora=null;
        this.estado=Estado.ABERTO;
    }
}
