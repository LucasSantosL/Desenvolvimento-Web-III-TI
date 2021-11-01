import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {

        // Classe Cliente
        cliente maria = new cliente();
        maria.nome = "Maria Eduarda";
        maria.sobrenome = "Pereira";
        maria.telefone = 519876543;
        maria.dataDeNascimento = LocalDate.of(1987, Month.DECEMBER, 14);
        maria.cpf = 574638;
        maria.email = "maria.eduarda@gmail.com.br";
        maria.endereco = "Rua fantasia 123";
        
        // Classe Fornecedor
        fornecedor mrl = new fornecedor();
        mrl.nome = "MRL-FORNECIMENTO";
        mrl.cnpj = 7584736;
        mrl.razaoSocial = "Mrl Fornecimento";
        
        // Classe Produto
        produto refrigerante = new produto();
        refrigerante.nomeProduto = "Coca Cola";
        refrigerante.codProduto = "#64747";
        refrigerante.valorProduto = 5.00;
        refrigerante.cupomProduto = 0.5;
        refrigerante.descriscaoProduto = "Coca Cola 2L";
        
        // Classe Transportadora
        transportadora express = new transportadora();
        express.nomeTransportadora = "Express Entregas";
        express.cnpj = 75846;
        express.nomeMotorista = "Jorge Silva";
        express.enderecoEntrega = "Rua mentira, 5436";
        express.codEntrega = "#64732";
        
        // Classe Vendedor
        vendedor cleiton = new vendedor();
        cleiton.nome = "Cleiton Zenker";
        cleiton.nascimento = LocalDate.of(1990, Month.JANUARY, 12);
        cleiton.cpf = "758396768-00";
        cleiton.salario = 2.000;
        cleiton.endereco = "Rua chinelada, 5647";
        
        
        
        
        
        

    }
}
