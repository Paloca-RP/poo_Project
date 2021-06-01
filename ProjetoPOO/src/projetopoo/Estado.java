package projetopoo;

public enum Estado{
        Aberto,Preparacao,Servido,Fechado;
        
        public String toString(){
            if(this==Aberto)
                return "Aberto\n";
            if(this==Preparacao)
                return "Preparacao\n";
            if(this==Servido)
                return "Servido\n";
            if(this==Fechado)
                return "Fechado\n";
            return "";
        }
}
