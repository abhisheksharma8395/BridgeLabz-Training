package future_logistics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

    // TransportId:TransportDate:TransportRating:TransportType: -> these are main and other input depend on transport type
    public GoodsTransport parseDetails(String input){
        String[] details = input.split(":");
        // TransportId:TransportDate:TransportRating:BrickTransport:brickSize:brickQuantity:brickPrice
        if(details[3].equals("BrickTransport")){
            if(this.validateTransportId(details[0])) {
                BrickTransport brickTransport = new BrickTransport(details[0], details[1], details[2], Float.parseFloat(details[4]), Integer.parseInt(details[5]), Float.parseFloat(details[6]));
                return brickTransport;
            }
        }
        else if(details[3].equals("TimberTransport")){
            if(this.validateTransportId(details[0])) {
                TimberTransport timberTransport = new TimberTransport(details[0], details[1], details[2], Float.parseFloat(details[4]), Integer.parseInt(details[5]), details[6], Float.parseFloat(details[7]));
                return timberTransport;
            }
        }
        return null;
    }

    public String findObjectType(GoodsTransport goodsTransport){
        if(goodsTransport instanceof TimberTransport){
            return "TimberTransport";
        }
        else if(goodsTransport instanceof BrickTransport){
            return "BrickTransport";
        }
        return " ";
    }



    // This method is used to validate the transportId
    public boolean validateTransportId(String transportId){
        Pattern pattern = Pattern.compile("^(RTS)[0-9]{3}[A-Z]{1}");
        Matcher matcher = pattern.matcher(transportId);
        if(matcher.matches()) return true;
        else{
            System.out.println("Transport id "+transportId+" is invalid");
            System.out.println("Please provide a valid record");
            return false;
        }
    }
}
