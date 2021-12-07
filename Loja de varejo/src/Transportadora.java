public class Transportadora {

    private String nome;
    private String email; 
    private int numero;
    private String endereco;

    public Transportadora(String nome, int numero, String email, String endereco){
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.endereco = endereco;
    }

    //Getters
    public String getNome() {
        return this.nome;
    }
    public String getEmail() {
        return this.email;
    }
    public int getNumero() {
        return this.numero;
    }
    public String getEndereco() {
        return this.endereco;
    }
    //Setters 
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
}
