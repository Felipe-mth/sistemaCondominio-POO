package Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="Id")
@Table(name = "TransacaoMoradores")
public class TransacaoMoradores extends Transacao{

    @ManyToOne
    Morador morador;

    public TransacaoMoradores() {
        super();
    }

    public TransacaoMoradores(double valor, String descricao, Morador morador) {
        super(valor, descricao);
        this.morador = morador;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }
}
