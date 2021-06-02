package projetopoo;

public enum Estado{
    Aberto,Preparacao,Servido,Fechado;

    public String toString(){
        if(this==Aberto)
            return "Aberto";
        if(this==Preparacao)
            return "Preparacao";
        if(this==Servido)
            return "Servido";
        if(this==Fechado)
            return "Fechado";
        return "";
    }
}
