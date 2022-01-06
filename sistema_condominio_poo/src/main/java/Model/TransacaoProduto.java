package Model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.*;

@Entity
@PrimaryKeyJoinColumn(name="Id")
@Table(name = "TransacaoProduto")
public class TransacaoProduto extends Transacao{

    @ManyToMany
    List<Produtos> produtos = new ArrayList<>();

    public TransacaoProduto() {
        super();
    }

    public TransacaoProduto(double valor, String descricao, ArrayList<Produtos> produtos) {
        super(valor, descricao);
        this.produtos = produtos;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
}
