package projetopoo;

public class Produto {
    
    protected String nome;
    protected double preco;
    protected int iva;

    public Produto (String nome, double preco, int iva){
        this.nome=validarNome(nome);
        this.preco=validarPreco(preco);
        this.iva=validarIva(iva);
    }

    public String validarNome(String nome){
        if(nome!=null)
            return nome;
        else
            return "";
    }

    public double validarPreco(double preco){
        if(preco>0)
            return preco;
        else
            return 0;
    }
    
    public int validarIva(int iva){
        if(iva==6||iva==13||iva==23)
            return iva;
        else
            return 0;
    }
    
    public boolean verificarProduto(){
        return true;
    }
}
