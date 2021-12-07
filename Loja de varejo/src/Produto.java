public class Produto {

    private String nome;
    private String marca;
    private Double preco;
    private Double quantidade;

    public Produto(String nome, String marca, Double preco, Double quantidade){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters
    public String getNome() {
        return this.nome;
    }
    public String getMarca() {
        return this.marca;
    }
    public Double getPreco() {
        return this.preco;
    }
    public Double getQuantidade() {
        return this.quantidade;
    }
    //Setters
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setQuantidade(Double quantidade){
        this.quantidade = quantidade;
    }
    
}
