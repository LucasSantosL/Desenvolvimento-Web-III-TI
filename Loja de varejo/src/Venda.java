import java.time.LocalDate;

public class Venda {

    private LocalDate Data;
    private String Hora;
    private String Comprador;

    public Venda(LocalDate Data, String Hora, String Comprador){
        this.Data = Data;
        this.Hora = Hora;
        this.Comprador = Comprador;
    }

    //Getters
    public LocalDate getData() {
        return this.Data;
    }
    public String getHora() {
        return this.Hora;
    }
    public String getComprador() {
        return this.Comprador;
    }
    //Setters
    public void setComprador(String Comprador){
        this.Comprador = Comprador;
    }
    
}
