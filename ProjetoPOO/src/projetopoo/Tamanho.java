package projetopoo;

public enum Tamanho{
    Pequeno,Medio,Grande;

    public String toString(){
        if(this==Pequeno)
            return "Pequeno";
        if(this==Medio)
            return "Médio";
        if(this==Grande)
            return "Grande";
        return "";
    }
    
}
