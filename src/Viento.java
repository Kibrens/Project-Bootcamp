public class Viento {
	/*int velocidad;
	String direccion;	
	String source="https://query.yahooapis.com/v1/public/yql?q=select wind from weather.forecast where woeid in (select woeid from geo.places(1) where text='chicago, il')&format=json&callback=callbackFunction";	
	
	var callbackFunction = function(data) {
		var wind = data.query.results.channel.wind;
	    alert(wind.chill);*/

    private float velocidad;
    private float direccion;

    public Viento(float velocidad, float direccion) {
        this.velocidad = velocidad;
        this.direccion = direccion;
    }

    public void setDireccion(float direccion) {
        this.direccion = direccion;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public float getDireccion() {
        return direccion;
    }

    public String toString(){
        return "Velocidad del viento: "+velocidad+"mp/h"+
                "Direccion del viento: "+direccion+"º";
    }
}


//select wind from weather.forecast where woeid in (select woeid from geo.places(1) where text="chicago, il");
