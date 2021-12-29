package Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TransacaoMorador")
public class TransacaoMorador extends Transacao{

    @ManyToOne
    Morador morador;

    public TransacaoMorador() {
        super();
    }

    public TransacaoMorador(double valor, String descricao, Morador morador) {
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
