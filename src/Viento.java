/*public class Viento {	
	int velocidad;
	String direccion;	
	String source="https://query.yahooapis.com/v1/public/yql?q=select wind from weather.forecast where woeid in (select woeid from geo.places(1) where text='chicago, il')&format=json&callback=callbackFunction";	
	
	var callbackFunction = function(data) {
		var wind = data.query.results.channel.wind;
	    alert(wind.chill);
	}
	
	select wind from weather.forecast where woeid in (select woeid from geo.places(1) where text="chicago, il");
}*/
