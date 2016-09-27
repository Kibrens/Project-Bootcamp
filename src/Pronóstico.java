public class Pron�stico {

    private Atm�sfera atm�sfera;
    private Pron�sticoExtendido pron�sticoExtendido;
    private Localidad localidad;
    private Viento viento;

    public Pron�stico(Atm�sfera atm�sfera, Pron�sticoExtendido pron�sticoExtendido, Localidad localidad, Viento viento) {
        this.atm�sfera = atm�sfera;
        this.pron�sticoExtendido = pron�sticoExtendido;
        this.localidad = localidad;
        this.viento = viento;
    }
    
    public void setAtm�sfera(Atm�sfera atm�sfera) {
        this.atm�sfera = atm�sfera;
    }

    public void setPron�sticoExtendido(Pron�sticoExtendido pron�sticoExtendido) {
        this.pron�sticoExtendido = pron�sticoExtendido;
    }
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public void setViento(Viento viento) {
        this.viento = viento;
    }
    
    public Atm�sfera getAtm�sfera() {
        return atm�sfera;
    }

    public Pron�sticoExtendido getPron�sticoExtendido() {
        return pron�sticoExtendido;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public Viento getViento() {
        return viento;
    }

    public String toString(){
        return "Pron�stico: "+atm�sfera.toString()+
                "\nPron�stico Extendido: "+pron�sticoExtendido.toString()+
                "\nLocalidad: "+localidad.toString()+
                "\nViento: "+viento.toString();
    }
}