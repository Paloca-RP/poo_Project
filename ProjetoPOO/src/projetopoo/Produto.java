package projetopoo;

public class Produto {
    
    protected String nome;
    protected double preco;
    protected double iva;

    public Produto(String nome, double preco, TaxaIva iva){
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
    
    public double validarIva(TaxaIva iva){
        switch(iva){
            case SEIS:return 0.06;
            case TREZE:return 0.13;
            case VINTETRES:return 0.23;
            default:return 0;
        }
    }
    
    public boolean verificarProduto(){
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=validarNome(nome);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco=validarPreco(preco);
    }

    public double getIva() {
        return iva;
    }

    public void setIva(TaxaIva iva) {
        this.iva=validarIva(iva);
    }
}
