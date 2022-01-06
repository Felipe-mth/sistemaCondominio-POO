package Model;

import javafx.scene.chart.PieChart.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Espaco")
public class Espaco {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Morador morador;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Espaco(Date data, Morador morador) {
        this.data = data;
        this.morador = morador;
    }

    public Espaco() {

    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
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
