import java.time.LocalDate;

public class App{
    public static void main(String[] args) {

        Vendedor jose = new Vendedor("José vasconselo", 1500.00f, "zé.vasconselo@gmail.com", LocalDate.of(2000, 9, 11));

        //jose.nome = "José vasconselo";
        jose.setEmail ("zé.vasconselo@gmail.com");
        //jose.dataDeNascimento = LocalDate.of(2000, 9, 11);
        //jose.salario = 1500.00f;

        Cliente david = new Cliente("David Andersen", 999888777, "davi.andersen@gmail.com", LocalDate.of(1999, 7, 2));

        //david.nome = "David Andersen";
        david.setEmail("davi.andersen@gmail.com");
        //david.dataDeNascimento = LocalDate.of(1999, 7, 2);
        david.setNumero (999888777); 

        Fornecedor jacadilo = new Fornecedor("Jacadilo", 111222333, "jaca.dilo@gmail.com", "São Leopoldo, Rio Branco");

        //jacadilo.nome = "Jacadilo";
        jacadilo.setEmail ("jaca.dilo@gmail.com");
        jacadilo.setEndereco ("São Leopoldo, Rio Branco");
        jacadilo.setNumero (111222333);

        Produto cabelo_Especial = new Produto("Cabelo Especial", "Capivara Atômica", 3000.00, 400.000);

        //cabelo_Especial.nome = "Cabelo Especial";
        //cabelo_Especial.marca = "Capivara Atômica";
        cabelo_Especial.setQuantidade (400.000);
        cabelo_Especial.setPreco (3000.00);

        Venda venda1 = new Venda(LocalDate.of(2009, 3, 16), "14:00", "David");

        venda1.setComprador ("David");
        //venda1.Data = LocalDate.of(2009, 3, 16);
        //venda1.Hora = "14:00";

        Transportadora transportadoraC = new Transportadora("Transportadora Caiou", 565656565, "caiou.transportadora@gmail.com", "Porto Alegre, Mariomario");

        //transportadoraC.nome = "Transportadora Caiou";
        transportadoraC.setEndereco ("Porto Alegre, Mariomario");
        transportadoraC.setEmail ("caiou.transportadora@gmail.com");
        transportadoraC.setNumero (565656565);

        System.out.println(cabelo_Especial.getQuantidade());

    } 
}
