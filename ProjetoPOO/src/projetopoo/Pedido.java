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
    
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
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
        String output = "";
        output += "Aberto: " + this.abertoHora + "\nEstado: " + this.estado + "\nProdutos:\n";
        for(int i=0;i<produtos.size();i++){
            output += produtos.get(i).getNome() + "\n";
        }
        output += "Fechado: " + this.fechadoHora + "\n";
        return output;
    }
    
    
}
