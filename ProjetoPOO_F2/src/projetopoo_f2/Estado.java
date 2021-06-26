/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo_f2;

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
