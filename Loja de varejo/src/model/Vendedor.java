package model;
import java.time.LocalDate;

public class Vendedor{

    private String nome;
    private LocalDate dataDeNascimento; 
    private String email;
    private Float salario;

    public Vendedor(String nome, Float salario, String email, LocalDate dataDeNascimento){
        this.nome = nome;
        this.salario = salario;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }
    //Getters
    public String getNome() {
        return this.nome;
    }
    public String getEmail() {
        return this.email;
    }
    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    public Float getSalario() {
        return this.salario;
    }
    //Setters
    public void setEmail(String email){
        this.email = email;
    }
    
}
