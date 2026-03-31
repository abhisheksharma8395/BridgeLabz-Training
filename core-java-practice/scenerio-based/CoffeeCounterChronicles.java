import java.util.Scanner;

public class CoffeeCounterChronicles {
    static final double GST = 0.18;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome To Our Cafe");
            System.out.println(" _________________________________________________________________________________________________________");
            System.out.println("|    S. no      |    Coffee Type    |    Description                                  |       Price      |");
            System.out.println("|_______________|___________________|_________________________________________________|__________________|");
            System.out.println("|     1.        |    Americano      |  Espresso + hot water (like black coffee)       |       200₹       |");
            System.out.println("|     2.        |    Cappuccino     |  Espresso + steamed milk + foam                 |       250₹       |");
            System.out.println("|     3.        |    Black Coffee   |  Brewed coffee without milk                     |       145₹       |");
            System.out.println("|     4.        |    Espresso       |  Pure, concentrated shot of coffee              |       170₹       |");
            System.out.println("|     5.        |    Macchiato      |  Espresso “stained” with a bit of milk foam     |       190₹       |");
            System.out.println("|_______________|___________________|_________________________________________________|__________________|");
            System.out.println("");
            System.out.println("Please Enter the Coffee type (e.g. 1 for Americano , 2 for Cappuccino , 3 for Black Coffee , 4 for Espresso , 5 for Macchiato , 6 for exit.) : ");
            int coffeeType = sc.nextInt();
            if(coffeeType == 6){
                exit = true;
                System.out.println("Thanks for visiting our cafe Please visit Again ");
            }
            else {
                System.out.println("Enter the Total Quantity of coffee You want : ");
                int quantity = sc.nextInt();
                switch (coffeeType) {
                    case 1:
                        System.out.println(" Your Bill is ");
                        System.out.println(" _________________________________________________________________________________________________________");
                        System.out.println("|    Coffee Type             |       Price      |     Quantity      |     Total price (Including GST)     |");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        System.out.printf("|          Amricano          |       200₹       |        %d         |             %.2f                   |", quantity, (quantity * 200) + ((quantity * 200) * GST));
                        System.out.println("");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        break;
                    case 2:
                        System.out.println(" Your Bill is ");
                        System.out.println(" _________________________________________________________________________________________________________");
                        System.out.println("|    Coffee Type             |       Price      |     Quantity      |     Total price (Including GST)     |");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        System.out.printf("|          Cappuccino        |       250₹       |        %d          |             %.2f                   |", quantity, (quantity * 250) + ((quantity * 250) * GST));
                        System.out.println("");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        break;
                    case 3:
                        System.out.println(" Your Bill is ");
                        System.out.println(" _________________________________________________________________________________________________________");
                        System.out.println("|    Coffee Type             |       Price      |     Quantity      |     Total price (Including GST)     |");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        System.out.printf("|          Black Coffee      |       145₹       |        %d          |             %.2f                   |", quantity, (quantity * 145) + ((quantity * 145) * GST));
                        System.out.println("");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        break;
                    case 4:
                        System.out.println(" Your Bill is ");
                        System.out.println(" _________________________________________________________________________________________________________");
                        System.out.println("|    Coffee Type             |       Price      |     Quantity      |     Total price (Including GST)     |");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        System.out.printf("|          Espresso          |       170₹       |        %d          |             %.2f                   |", quantity, (quantity * 170) + ((quantity * 170) * GST));
                        System.out.println("");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        break;
                    case 5:
                        System.out.println(" Your Bill is ");
                        System.out.println(" _________________________________________________________________________________________________________");
                        System.out.println("|    Coffee Type             |       Price      |     Quantity      |     Total price (Including GST)     |");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        System.out.printf("|          Macchiato         |       190₹       |        %d          |             %.2f                   |", quantity, (quantity * 190) + ((quantity * 190) * GST));
                        System.out.println("");
                        System.out.println("|____________________________|__________________|___________________|_____________________________________|");
                        break;

                    default:
                        System.out.println("Invalid Choice Please Try Again.");


                }
            }
        }
    }
}