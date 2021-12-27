package Model;

import javafx.scene.chart.PieChart.Data;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Espaco")
public class Espaco {
    @Id
    private int id;
    private Morador morador;
    private Data data;

    public Espaco(Data data, int id, Morador morador) {
        this.data = data;
        this.id = id;
        this.morador = morador;
    }

    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Morador getMorador() {
        return this.morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }
}
