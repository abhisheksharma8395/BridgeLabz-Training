import java.util.Scanner;

//Class CylinderVoulme
class CylinderVolume {

    // Main Method
    public static void main(String[] args) {
        //Object Of Scanner Class
        Scanner sc = new Scanner(System.in);

        // Taking the input of radius from user
        System.out.println("Enter radius of the cylinder:");
        double radii = sc.nextDouble();

        // Taking the input of height from user
        System.out.println("Enter height of the cylinder:");
        double height = sc.nextDouble();

        // Calculating the volume of cylinder and stroing it into volumeOfCylinder variable
        double volumeOfCylinder = Math.PI * r * r * h;
        System.out.println("Volume of the cylinder is: " + volumeOfCylinder);
    }
}