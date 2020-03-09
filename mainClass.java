

public class mainClass {

    
    public static void main(final String[] args) {

        // TODO code application logic here
        final City city = new City();

        city.setCityName("Lahore");
        city.setCountryName("Pakistan");
        city.setCityLatitudeAndLongitude("31.5204° N, 74.3587° E");
        city.setCityPopulation("11.13 million");
        System.out.println(city.toString());
    }
    
}