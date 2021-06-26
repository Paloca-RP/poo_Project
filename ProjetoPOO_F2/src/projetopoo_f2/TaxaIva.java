/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

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
