public class Localidad {

    private String pais;
    private String ciudad;
    private String region;

    public Localidad(String pais, String ciudad, String region){
        this.ciudad=ciudad;
        this.pais=pais;
        this.region=region;
    }
    	
    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getRegion() {
        return region;
    }

    public String toString(){
        return "City: "+ciudad+
                "\nPais: "+pais+
                "\nRegion: "+region;
    }
}