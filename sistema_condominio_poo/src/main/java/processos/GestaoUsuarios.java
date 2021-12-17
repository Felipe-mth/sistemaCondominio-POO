package processos;

import Entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoUsuarios {
  ArrayList<Funcionario> funcionario;
  ArrayList<Morador> moradores;
  Scanner scan = new Scanner(System.in);

  public void pesquisarMorador() {
    int opcao;

    System.out.println("Como você deseja buscar o morador?");
    System.out.println("(1) - CPF");
    System.out.println("(2) - Nome");
    opcao = scan.nextInt();

    switch (opcao) {
      case 1:
        String cpf;

        System.out.println("Digite o CPF que você deseja buscar: ");
        cpf = scan.nextLine();

        for (Morador pessoa : moradores) {
          if (cpf == pessoa.getCPF()) {
            System.out.println("Nome: " + pessoa.getNome());
            //System.out.println("ID: " + pessoa.getID()); //id foi retirado, para deixar apenas o cpf como indentificador sentral
            System.out.println("CPF: " + pessoa.getCPF());
            System.out.println("Telefone: " + pessoa.getTelefone());
          }
        }
        scan.close();
        break;
      case 2:
        String nome;

        System.out.println("Digite o nome que você deseja buscar: ");
        nome = scan.nextLine();

        for (Morador pessoa : moradores) {
          if (nome == pessoa.getNome()) {
            System.out.println("Nome: " + pessoa.getNome());
            //System.out.println("ID: " + pessoa.getID()); //id foi retirado, para deixar apenas o cpf como indentificador sentral
            System.out.println("CPF: " + pessoa.getCPF());
            System.out.println("Telefone: " + pessoa.getTelefone());
          }
        }

        scan.close();
        break;
      default:
        break;
    }
  }

  public void adicionarMorador() {
    String nome, cpf, telefone;

    System.out.println("Digite o nome do morador:");
    nome = scan.nextLine();
    System.out.println("Digite o cpf do morador:");
    cpf = scan.nextLine();
    System.out.println("Digite o telefone do morador:");
    telefone = scan.nextLine();

    Morador morador = new Morador(cpf, telefone, nome);

    moradores.add(morador);
  }

  public void deletarMorador() {
    String nome;

    System.out.println("Digite o nome do morador que você deseja excluir: ");
    nome = scan.nextLine();

    for (Morador pessoa : moradores) {
      if (pessoa.getNome() == nome) {
        moradores.remove(pessoa);
      }
    }

    scan.close();
  }

  public void atualizarMorador() {
    String nome;

    System.out.println("Digite o nome do morador que você deseja atualizar: ");
    nome = scan.nextLine();

    for (Morador pessoa : moradores) {
      if (pessoa.getNome() == nome) {
        String telefone;

        System.out.println("Digite o novo telefone do morador: ");
        telefone = scan.nextLine();
        pessoa.setTelefone(telefone);

        System.out.println("Morador atualizado com sucesso!");
      }
    }

    scan.close();
  }
}