import java.awt.*;

public class Pron�sticoExtendido {

    private List ListaPron�sticoExtendido;

    public Pron�sticoExtendido(List ListaPron�sticoExtendido) {
        this.ListaPron�sticoExtendido = ListaPron�sticoExtendido;
    }

    public void setPron�sticoExtendido(List ListaPron�sticoExtendido) {
        this.ListaPron�sticoExtendido = ListaPron�sticoExtendido;
    }

    public List getPron�sticoExtendido() {
        return ListaPron�sticoExtendido;
    }

    public String toString(){
        return "Pron�stico extendido: "+ListaPron�sticoExtendido.toString();
    }
	//select * from weather.forecast where woeid in (select woeid from geo.places(1) where text="CITY, STATE")
}
