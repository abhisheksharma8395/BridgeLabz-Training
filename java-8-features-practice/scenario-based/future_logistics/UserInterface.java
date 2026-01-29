package future_logistics;

import java.util.Scanner;

public class UserInterface {
    // TransportId:TransportDate:TransportRating:BrickTransport:brickSize:brickQuantity:brickPrice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utility utility = new Utility();
        System.out.println("Enter the Details : ");
        String input = scanner.nextLine();
        GoodsTransport goodsTransport = utility.parseDetails(input);
        if(utility.findObjectType(goodsTransport).equals("BrickTransport")){
            BrickTransport brickTransport = (BrickTransport) goodsTransport;
            brickTransport.display();
        }
        else if(utility.findObjectType(goodsTransport).equals("TimberTransport")){
            // Down casting
            TimberTransport timberTransport = (TimberTransport) goodsTransport;
            timberTransport.display();
        }
    }
}
