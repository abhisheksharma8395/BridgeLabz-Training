package future_logistics;

public abstract class GoodsTransport {
    private String transportId;                             // Store the transport id for goods
    private String transportDate;                           // Stores the transport date
    private String transportRating;                         // Stores the rating

    // Constructor of GoodsTransport abstract class to initialize the instance variable
    public GoodsTransport(String transportId, String transportDate , String transportRating){
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    // Abstract methods
    public abstract String vehicleSelection();
    public abstract float calculateTotalCharge();

    // Getter and Setter methods for transportId , transportDate , transportRating
    public String getTransportId(){
        return this.transportId;
    }
    public void setTransportId(String transportId){
        this.transportId = transportId;
        System.out.println("Transport Id set to "+this.transportId);
    }
    public String getTransportDate(){
        return this.transportDate;
    }
    public void setTransportDate(String transportDate){
        this.transportDate = transportDate;
        System.out.println("Transport Date set to "+this.transportDate);
    }
    public String getTransportRating(){
        return this.transportRating;
    }
    public void setTransportRating(String transportRating){
        this.transportRating = transportRating;
        System.out.println("Transport Rating set to "+this.transportRating);
    }
}
