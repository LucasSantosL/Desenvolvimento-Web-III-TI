package projetos.Hospital.lib;
import java.time.LocalDate;

public class Medico {
  private String crm;
  private String nome;
  private String endereco;
  private String telefone;
  private LocalDate dataDeNascimento;


public String getCrm() {
    return this.crm;
}

public String getNome() {
    return this.nome;
}

public String getEndereco() {
    return this.endereco;
}

public String getTelefone() {
    return this.telefone;
}

public LocalDate getDataDeNacimento() {
    return this.dataDeNascimento;
}

//set
public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}
}