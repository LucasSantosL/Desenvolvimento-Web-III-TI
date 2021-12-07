package model;
import java.time.LocalDate;

public class Cliente {

    private String nome;
    private LocalDate dataDeNascimento; 
    private String email;
    private int numero;
    private int id;

    public Cliente(String nome, int numero, String email, LocalDate dataDeNascimento, int id){
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.id = id;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }
    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    public String getEmail() {
        return this.email;
    }
    public int getNumero() {
        return this.numero;
    }
    public int getId(){
        return this.id;
    }
    // Setters
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
}
