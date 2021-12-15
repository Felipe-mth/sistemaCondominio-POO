package processos;
import Entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Almoxarifado {
    private Funcionario funcionario;
    private String telefone;
    private String email;
    private ArrayList<Produtos> produtos;
    private Scanner scan = new Scanner(System.in);

    public Almoxarifado(Funcionario funcionario, String telefone, String email) {
        this.funcionario = funcionario;
        this.telefone = telefone;
        this.email = email;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void verificaEstoque() {
        System.out.println("----- LISTA DE PRODUTOS ----");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("########################");
            System.out.println("PRODUTO " + (i + 1));
            System.out.println("ID: " + this.produtos.get(i).getId());
            System.out.println("Nome: " + this.produtos.get(i).getNome());
            System.out.println("Quantidade em estoque: " + this.produtos.get(i).getQuantidade());
            System.out.println("Quantidade mínima: " + this.produtos.get(i).getQuantidadeMinima());
            System.out.println("Fornecedor: " + this.produtos.get(i).getFornecedor());
            System.out.println("Preço: " + this.produtos.get(i).getPreco());
            System.out.println("########################");
        }
    }

    public void reabastecer() {
        System.out.println("Selecione o produto que será reabastecido: ");
        for (Produtos prod : produtos) {
            System.out.println("Nome: " + prod.getNome());
        }
        String nomeProduto = scan.nextLine();

        for (Produtos prod : produtos) {
            if (prod.getNome() == nomeProduto) {
                System.out.println("Digite a quantidade a ser abastecida: ");
                int abastecimento = scan.nextInt();
                prod.setQuantidade((prod.getQuantidade() + abastecimento));
                System.out.println("Produto abastecido com sucesso!");
            }
        }

        scan.close();
    }

    public void trocarFuncionario(Funcionario novoFuncionario) {
        System.out.println("Trocando funcionário " + this.funcionario + "pelo funcionário " + novoFuncionario);
        this.funcionario = novoFuncionario;
        System.out.println("Troca realizada com sucesso!");
    }
}