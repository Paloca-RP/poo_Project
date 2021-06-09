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
        this.abertoHora=null;
        this.fechadoHora=null;
        this.estado=null;
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos){
        this.produtos=produtos;
    }

    public LocalDateTime getAbertoHora(){
        return abertoHora;
    }

    public void setAbertoHora(LocalDateTime abertoHora){
        this.abertoHora=abertoHora;
    }

    public LocalDateTime getFechadoHora(){
        return fechadoHora;
    }

    public void setFechadoHora(LocalDateTime fechadoHora){
        this.fechadoHora=fechadoHora;
    }

    public Estado getEstado(){
        return estado;
    }

    public void setEstado(Estado estado){
        this.estado=estado;
    }
    
    public String toString(){
        return "Aberto: " + this.abertoHora + "\nEstado: " + this.estado + "\nProdutos: " + this.produtos.toString() + "\nFechado: " + this.fechadoHora + "\n";
    }
    
    
}
