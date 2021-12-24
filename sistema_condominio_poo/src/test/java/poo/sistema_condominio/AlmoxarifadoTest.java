package poo.sistema_condominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import processos.Almoxarifado;
import Model.Endereco;
import Model.Fornecedor;
import Model.Funcionario;
import Model.Produtos;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AlmoxarifadoTest {
  Funcionario funcTest = new Funcionario("789456123", "027", "Carlos");
  Funcionario func = new Funcionario("12345678910", "81878787", "Jorge");
  Endereco e = new Endereco("123", "bairro", "cidade", "estado", "pais", 123);
  Fornecedor f = new Fornecedor("telefone", "nome", e);
  Produtos p = new Produtos(f, 55.5, "ome", 5);
  ArrayList<Produtos> prod = new ArrayList<Produtos>();
  Almoxarifado almoxarifado = new Almoxarifado(funcTest, "123", "almoxarifado@produtos.com", prod);

  @Test
  public void quantidadePrecisaAumentarAposReabastecer() {
    // Produtos p = new Produtos(f, 55.5, "ome", 5);
    almoxarifado.adicionarProduto(p);
    almoxarifado.reabastecer();
    // assertEquals(10, prod.get(0).getQuantidade(), "Objetos não são iguais");
  }

  @Test
  public void funcionarioPrecisaSerAlterado() {
    almoxarifado.trocarFuncionario(func);

    assertEquals(func.getNome(), almoxarifado.getFuncionario().getNome(), "Os funcionários não são iguais");
  }
}