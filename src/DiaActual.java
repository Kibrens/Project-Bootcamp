import java.time.DayOfWeek;
import java.util.Date;

public class DiaActual {
	
    private DayOfWeek día;
    private Date fecha;
    private float máxima;
    private float mínima;
    private String descripcion;

    public void Currentdía(DayOfWeek día, Date fecha, float máxima, float mínima, String descripcion) {
        this.día = día;
        this.fecha = fecha;
        this.máxima = máxima;
        this.mínima = mínima;
        this.descripcion = descripcion;
    }

    public void setMáxima(float máxima) {
        this.máxima = máxima;
    }
    
    public void setMínima(float mínima) {
        this.mínima = mínima;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setDía(DayOfWeek día) {
        this.día = día;
    }

    public float getMáxima() {
        return máxima;
    }

    public float getMínima() {
        return mínima;
    }

    public DayOfWeek getDía() {
        return día;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String toString(){
        return "día: "+día.toString()+
                "\nfecha: "+fecha.toString()+
                "\nMax Temperatura: "+máxima+
                "\nMin Temperatura: "+mínima+
                "\nDescripcion: "+descripcion;
    }
}