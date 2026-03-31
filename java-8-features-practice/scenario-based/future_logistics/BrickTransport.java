package future_logistics;

public class BrickTransport extends GoodsTransport {
    private float brickSize;                              // Stores the size of one brick size
    private int brickQuantity;                            // Store the quantity of brick
    private float brickPrice;                             // Store the price of brick

    // Constructor of BrickTransport to initialize the instance variable
    public BrickTransport(String transportId, String transportDate, String transportRating, float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    @Override
    public String vehicleSelection() {
        if (this.brickQuantity < 300) {
            return "Truck";
        } else if (this.brickQuantity >= 300 && this.brickQuantity <= 500) {
            return "Lorry";
        } else if (this.brickQuantity > 500) {
            return "MonsterLorry";
        }
        return " ";
    }

    @Override
    public float calculateTotalCharge() {
        float totalBrickCost = this.brickPrice * this.brickQuantity;
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
        float tax = totalBrickCost * 0.30f;
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
        float discount = totalBrickCost * discountPercentage;
        float totalCharge = totalBrickCost + vehiclePrice + tax - discount;
        return totalCharge;
    }

    // Getter and Setter method for brickSize , brickQuantity and brickPrice
    public float getBrickSize() {
        return this.brickSize;
    }

    public void setBrickSize(float brickSize) {
        this.brickSize = brickSize;
        System.out.printf("\nBrick Size set to %.2f", this.brickSize);
    }

    public int getBrickQuantity() {
        return this.brickQuantity;
    }

    public void setBrickQuantity(int brickQuantity) {
        this.brickQuantity = brickQuantity;
        System.out.printf("Brick Quantity set to " + this.brickQuantity);
    }

    public float getBrickPrice() {
        return this.brickPrice;
    }

    public void setBrickPrice(int brickPrice) {
        this.brickPrice = brickPrice;
        System.out.println("Brick Price set to " + this.brickPrice);
    }

    public void display(){
        System.out.println("Transporter id : "+super.getTransportId());
        System.out.println("Date of transport : "+super.getTransportDate());
        System.out.println("Rating of the transport : "+super.getTransportRating());
        System.out.println("Quantity of bricks : "+this.getBrickQuantity());
        System.out.printf("Price of Brick : %.2f\n",this.getBrickPrice());
        System.out.println("Vehicle for transport : "+this.vehicleSelection());
        System.out.printf("Total charge : %.2f",this.calculateTotalCharge());
    }
}
