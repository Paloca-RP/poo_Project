package projetopoo;

public enum Estado{
    ABERTO,PREPARACAO,SERVIDO,FECHADO;

    public String toString(){
        if(this==ABERTO)
            return "Aberto";
        if(this==PREPARACAO)
            return "Em preparação";
        if(this==SERVIDO)
            return "Servido";
        if(this==FECHADO)
            return "Fechado";
        return "";
    }
}
