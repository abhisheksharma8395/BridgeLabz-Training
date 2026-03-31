package future_logistics;

public class TimberTransport extends GoodsTransport {
    private float timberLength;                              // Stores the length of one timber
    private float timberRadius;                            // Store the radius of one timber
    private String timberType;                             // Store the type of timber
    private float timberPrice;                            // Store the price of timber per kg

    // Constructor of TimberTransport to initialize the instance variable
    public TimberTransport(String transportId, String transportDate, String transportRating, float timberLength, float timberRadius, String timberType,float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    @Override
    public String vehicleSelection() {
        float area = 2 * 3.147f * this.timberRadius * this.timberLength;
        if (area < 250) {
            return "Truck";
        } else if (area >= 250 && area <= 400) {
            return "Lorry";
        } else if (area > 400) {
            return "MonsterLorry";
        }
        return " ";
    }

    @Override
    public float calculateTotalCharge() {
        float volume = 3.147f * this.timberRadius * this.timberRadius * this.timberLength;
        float timberTypeRate = this.timberType.equals("Premium") ? 0.25f : 0.15f;
        float price = volume * this.timberPrice * timberTypeRate;
        int vehiclePrice = 0;
        switch (this.vehicleSelection()) {
            case "Truck":
                vehiclePrice = 1000;
                break;
            case "Lory":
                vehiclePrice = 1700;
                break;
            case "MosnsterLorry":
                vehiclePrice = 3000;
                break;
        }
        float tax = price * 0.30f;
        float discountPercentage = 0.0f;
        float ratings = Float.parseFloat(super.getTransportRating());
        if (ratings == 5.0) {
            discountPercentage = 0.20f;
        } else if (ratings > 4.0 && ratings < 5.0) {
            discountPercentage = 0.15f;
        } else if (ratings >= 3.0 && ratings <= 4.0){
            discountPercentage = 0.10f;
        } else if(ratings >= 2.0 && ratings < 3.0){
            discountPercentage = 0.05f;
        }else{
            discountPercentage = 0.0f;
        }
        float discount = price * discountPercentage;
        float totalCharge = price + vehiclePrice + tax - discount;
        return totalCharge;
    }

    // Getter and Setter method for brickSize , brickQuantity and brickPrice
    public float getTimberLength() {
        return this.timberLength;
    }

    public void setTimberLength(float timberLength) {
        this.timberLength = timberLength;
        System.out.printf("\nTimber Length set to %.2f", this.timberLength);
    }

    public float getTimberRadius() {
        return this.timberRadius;
    }

    public void setTimberRadius(float timberRadius) {
        this.timberRadius = timberRadius;
        System.out.printf("Timber Quantity set to " + this.timberRadius);
    }

    public String getTimberType() {
        return this.timberType;
    }

    public void setTimberType(String timberType) {
        this.timberType = timberType;
        System.out.println("Timber Type set to " + this.timberType);
    }

    public float getTimberPrice() {
        return this.timberPrice;
    }

    public void setTimberPrice(float timberPrice) {
        this.timberPrice = timberPrice;
        System.out.println("Timber price set to " + this.timberPrice);
    }

    public void display(){
        System.out.println("Transporter id : "+super.getTransportId());
        System.out.println("Date of transport : "+super.getTransportDate());
        System.out.println("Rating of the transport : "+super.getTransportRating());
        System.out.println("Type of the timber : "+this.getTimberType());
        System.out.printf("Timber Price per kilo : %.2f\n",this.getTimberPrice());
        System.out.println("Vehicle for transport : "+this.vehicleSelection());
        System.out.printf("Total charge : %.2f",this.calculateTotalCharge());
    }
}

