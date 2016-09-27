public class Pronóstico {

    private Atmósfera atmósfera;
    private PronósticoExtendido pronósticoExtendido;
    private Localidad localidad;
    private Viento viento;

    public Pronóstico(Atmósfera atmósfera, PronósticoExtendido pronósticoExtendido, Localidad localidad, Viento viento) {
        this.atmósfera = atmósfera;
        this.pronósticoExtendido = pronósticoExtendido;
        this.localidad = localidad;
        this.viento = viento;
    }
    
    public void setAtmósfera(Atmósfera atmósfera) {
        this.atmósfera = atmósfera;
    }

    public void setPronósticoExtendido(PronósticoExtendido pronósticoExtendido) {
        this.pronósticoExtendido = pronósticoExtendido;
    }
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public void setViento(Viento viento) {
        this.viento = viento;
    }
    
    public Atmósfera getAtmósfera() {
        return atmósfera;
    }

    public PronósticoExtendido getPronósticoExtendido() {
        return pronósticoExtendido;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public Viento getViento() {
        return viento;
    }

    public String toString(){
        return "Pronóstico: "+atmósfera.toString()+
                "\nPronóstico Extendido: "+pronósticoExtendido.toString()+
                "\nLocalidad: "+localidad.toString()+
                "\nViento: "+viento.toString();
    }
}