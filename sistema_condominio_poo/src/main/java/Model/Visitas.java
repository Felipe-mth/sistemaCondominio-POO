package Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "Visitas")
public class Visitas extends Pessoa {
    private int horarioVisita;
    private int periodoVisita;
    private int dataVisita;
    @OneToOne
    private Morador moradorVisitado;
    
    public Visitas(String cpfCNPJ, String telefone, String nome, Endereco endereco) {
        super(cpfCNPJ, telefone, nome, endereco);
    }

    public Visitas() {

    }

    public int getHorarioVisita() {
        return horarioVisita;
    }

    public void setHorarioVisita(int horarioVisita) {
        this.horarioVisita = horarioVisita;
    }

    public int getPeriodoVisita() {
        return periodoVisita;
    }

    public void setPeriodoVisita(int periodoVisita) {
        this.periodoVisita = periodoVisita;
    }

    public int getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(int dataVisita) {
        this.dataVisita = dataVisita;
    }

    public Morador getMoradorVisitado() {
        return this.moradorVisitado;
    }

    public void setMoradorVisitado(Morador moradorVisitado) {
        this.moradorVisitado = moradorVisitado;
    }
}