package projetos.Hospital.lib;
public class Paciente {
  private String nome;
  private String rg;
  private String cpf;
  private String telefone;

public String getNome() {
    return this.nome;
}

public String getRg() {
    return this.rg;
}

public String getCpf() {
    return this.cpf;
}

public String getTelefone() {
    return this.telefone;
}

//set
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
}
