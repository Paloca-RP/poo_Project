package projetopoo;

public enum Tamanho{
    PEQUENO,MEDIO,GRANDE;

    public String toString(){
        if(this==PEQUENO)
            return "Pequeno";
        if(this==MEDIO)
            return "Médio";
        if(this==GRANDE)
            return "Grande";
        return "";
    }
}
