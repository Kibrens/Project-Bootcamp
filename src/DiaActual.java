import java.time.DayOfWeek;
import java.util.Date;

public class DiaActual {
	
    private DayOfWeek d�a;
    private Date fecha;
    private float m�xima;
    private float m�nima;
    private String descripcion;

    public void Currentd�a(DayOfWeek d�a, Date fecha, float m�xima, float m�nima, String descripcion) {
        this.d�a = d�a;
        this.fecha = fecha;
        this.m�xima = m�xima;
        this.m�nima = m�nima;
        this.descripcion = descripcion;
    }

    public void setM�xima(float m�xima) {
        this.m�xima = m�xima;
    }
    
    public void setM�nima(float m�nima) {
        this.m�nima = m�nima;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setD�a(DayOfWeek d�a) {
        this.d�a = d�a;
    }

    public float getM�xima() {
        return m�xima;
    }

    public float getM�nima() {
        return m�nima;
    }

    public DayOfWeek getD�a() {
        return d�a;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String toString(){
        return "d�a: "+d�a.toString()+
                "\nfecha: "+fecha.toString()+
                "\nMax Temperatura: "+m�xima+
                "\nMin Temperatura: "+m�nima+
                "\nDescripcion: "+descripcion;
    }
}