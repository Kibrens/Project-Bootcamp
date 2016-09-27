public class Atmósfera {
	private float humedad;
    private float presión;
    private float visibilidad;

    public Atmósfera(float humedad, float presión, float visibilidad) {
        this.humedad = humedad;
        this.presión = presión;
        this.visibilidad = visibilidad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }
    
    public void setPresión(float presión) {
        this.presión = presión;
    }
    
    public void setVisibilidad(float visibilidad) {
        this.visibilidad = visibilidad;
    }
    
    public float getHumedad() {
        return humedad;
    }

    public float getPresión() {
        return presión;
    }

    public float getVisibilidad() {
        return visibilidad;
    }

    public String toString(){
        return "";
    }

}
