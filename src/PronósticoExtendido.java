import java.awt.*;

public class PronósticoExtendido {

    private List ListaPronósticoExtendido;

    public PronósticoExtendido(List ListaPronósticoExtendido) {
        this.ListaPronósticoExtendido = ListaPronósticoExtendido;
    }

    public void setPronósticoExtendido(List ListaPronósticoExtendido) {
        this.ListaPronósticoExtendido = ListaPronósticoExtendido;
    }

    public List getPronósticoExtendido() {
        return ListaPronósticoExtendido;
    }

    public String toString(){
        return "Pronóstico extendido: "+ListaPronósticoExtendido.toString();
    }
	//select * from weather.forecast where woeid in (select woeid from geo.places(1) where text="CITY, STATE")
}
