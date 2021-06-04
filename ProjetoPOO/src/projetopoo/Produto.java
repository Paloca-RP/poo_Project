package projetopoo;

public class Produto {
    
    protected String nome;
    protected double preco;
    protected int iva;

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
    
    public int validarIva(TaxaIva iva){
        switch(iva){
            case SEIS:return 6;
            case TREZE:return 13;
            case VINTETRES:return 23;
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

    public int getIva() {
        return iva;
    }

    public void setIva(TaxaIva iva) {
        this.iva=validarIva(iva);
    }
}
