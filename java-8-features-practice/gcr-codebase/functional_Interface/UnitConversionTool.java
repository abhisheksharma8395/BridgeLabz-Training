package functional_interface;

public class UnitConversionTool {
    public static void main(String[] args) {
        double distanceInKm = 12.4;
        double weightInKg = 82.7;
        ConversionUtils.kmToMiles(distanceInKm);
        ConversionUtils.kgToLbs(weightInKg);
    }
}
interface ConversionUtils{
    static void kmToMiles(double km){
        System.out.printf("%.2f kilometer is equals to %.2f miles",km,(km*(0.621371)));
    }
    static void kgToLbs(double kg){
        System.out.printf("\n%.2f kilogram is equals to %.2f lbs",kg,(kg*(2.20462)));
    }
}
