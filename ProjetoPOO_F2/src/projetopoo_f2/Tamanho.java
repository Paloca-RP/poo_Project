/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

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
