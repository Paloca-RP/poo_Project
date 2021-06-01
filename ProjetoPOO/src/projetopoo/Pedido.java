package projetopoo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private ArrayList <Item> items;
    private LocalDate aberto;
    private LocalDate fechado;
    private Estado estado;
            
    public Pedido(){
        items=new ArrayList<Item>();
    }
}
