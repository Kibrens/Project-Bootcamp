public class Atm�sfera {
	private float humedad;
    private float presi�n;
    private float visibilidad;

    public Atm�sfera(float humedad, float presi�n, float visibilidad) {
        this.humedad = humedad;
        this.presi�n = presi�n;
        this.visibilidad = visibilidad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }
    
    public void setPresi�n(float presi�n) {
        this.presi�n = presi�n;
    }
    
    public void setVisibilidad(float visibilidad) {
        this.visibilidad = visibilidad;
    }
    
    public float getHumedad() {
        return humedad;
    }

    public float getPresi�n() {
        return presi�n;
    }

    public float getVisibilidad() {
        return visibilidad;
    }

    public String toString(){
        return "";
    }

}
