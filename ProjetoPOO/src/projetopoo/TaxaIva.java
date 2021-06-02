package projetopoo;

public enum TaxaIva {
    seis,treze,vinteTres;

    public String toString(){
        if(this==seis)
            return "6";
        if(this==treze)
            return "13";
        if(this==vinteTres)
            return "23";
        return "";
    }
}
