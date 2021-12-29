package Model;

import javax.persistence.*;

@Entity
@Table(name = "Transacao")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Transacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private double valor;
    private String descricao;

    public Transacao() {

    }

    public Transacao(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
