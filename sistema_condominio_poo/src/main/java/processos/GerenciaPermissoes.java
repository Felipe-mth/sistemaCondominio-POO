package processos;

import Model.*;

public class GerenciaPermissoes {

    private int horarioVisita;
    private int periodoVisita;
    private int dataVisita;
    private Pessoa pessoa;
    private Apartamentos apartamento;

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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Apartamentos getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamentos apartamento) {
        this.apartamento = apartamento;
    }

}