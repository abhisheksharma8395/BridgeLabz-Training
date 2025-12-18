//This programme calculates the volume of Earth in cubic kilometers and cubic miles.
public class EarthVolume {

    //Main method
    public static void main(String[] args) {

        // Radius of Earth in Kilometer = 6378 Kilometers
        double radiusOfEarthInKm = 6378;

        // Taking the value of pi
        double pi = Math.PI;

        // Calculating volume of Earth in cubic Kilometers
        double volumeInKm = (4.0 / 3.0) * pi * Math.pow(radiusOfEarthInKm, 3);

        // Converting cubic kilometers to cubic miles (1 km^3 ≈ 0.239913 mi^3)
        double volumeInMiles = volumeInKm * 0.239913;

        // Printing the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + 
                         " and cubic miles is " + volumeInMiles);
    }
}