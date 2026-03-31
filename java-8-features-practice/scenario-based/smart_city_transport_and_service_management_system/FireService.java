package smart_city_transport_and_service_management_system;


public class FireService implements EmergencyService {
        String numberPlate;
        double totalWater;

        public FireService(String numberPlate,double totalWater){
            this.numberPlate = numberPlate;
            this.totalWater = totalWater;
        }

        public void display(){
            System.out.println("Fire Car Number Plate : "+this.numberPlate+" , Total Water present "+this.totalWater);
        }

}
