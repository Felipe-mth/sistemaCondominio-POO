package Model;

import javafx.scene.chart.PieChart.Data;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Espaco")
public class Espaco {
    @Id
    private int idmorador;

    private Data data;

    public Espaco(Data data, int idmorador) {
        this.data = data;
        this.idmorador = idmorador;
    }

    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }

    public int getIdmorador() {
        return idmorador;
    }
    public void setIdmorador(int idmorador) {
        this.idmorador = idmorador;
    }
}
