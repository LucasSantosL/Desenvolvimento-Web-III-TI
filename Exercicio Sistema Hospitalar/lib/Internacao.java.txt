package projetos.Hospital.lib;
import java.time.LocalDate;

public class Internacao {
    private LocalDate dataInternacao;
    private LocalDate dataAlta;
    private String obser;
  
  public LocalDate dataInternacao() {
      return this.dataInternacao;
  }
  
  public LocalDate dataAlta() {
      return this.dataAlta;
  }
  
  public String getObser() {
      return this.obser;
  }
  
  // set
  public void setObser(String obser) {
      this.obser = obser;
  }
  }
  
