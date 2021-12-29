package Model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "TransacaoProduto")
public class TransacaoProduto extends Transacao{

    @ManyToMany
    ArrayList<Produtos> produtos = new ArrayList<>();

    public TransacaoProduto() {
        super();
    }

    public TransacaoProduto(double valor, String descricao, ArrayList<Produtos> produtos) {
        super(valor, descricao);
        this.produtos = produtos;
    }

    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produtos> produtos) {
        this.produtos = produtos;
    }
}
