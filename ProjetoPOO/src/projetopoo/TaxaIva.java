package projetopoo;

public enum TaxaIva {
    SEIS,TREZE,VINTETRES;

    public int toInt(){
        if(this==SEIS)
            return 6;
        if(this==TREZE)
            return 13;
        if(this==VINTETRES)
            return 23;
        return 0;
    }
}
