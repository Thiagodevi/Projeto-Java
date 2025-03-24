public class Conta {
    
    private int numero;
    private String corretista;
    private float valor;
    
    public Conta(){
        
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }

    public String getCorretista() {
        return corretista;
    }

    public void setCorretista(String corretista) {
        this.corretista = corretista;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
