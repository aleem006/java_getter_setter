

class City{

    private String cityName; //"private" means access to this is restricted
    private String countryName;
    private String cityPopulation;
    private String cityLatitudeAndLongitude;

    

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(String cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public String getCityLatitudeAndLongitude() {
        return cityLatitudeAndLongitude;
    }

    public void setCityLatitudeAndLongitude(String cityLatitudeAndLongitude) {
        this.cityLatitudeAndLongitude = cityLatitudeAndLongitude;
    }

    //constructor
    public City(String cityName, String countryName, String cityPopulation, String cityLatitudeAndLongitude) { 
        this.cityName = cityName;
        this.countryName = countryName;
        this.cityPopulation = cityPopulation;
        this.cityLatitudeAndLongitude = cityLatitudeAndLongitude;
    }

    

    @Override
    public String toString() {
        return cityName + " (" + countryName +") [" + cityLatitudeAndLongitude +  "]: " + cityPopulation;

     //System.out.print(cityName + " (" + countryName +") [" + cityLatitudeAndLongitude +  "]: " + cityPopulation);

       // return "print";
    }

    //constructor
    public City() {
    }

    
    

}




