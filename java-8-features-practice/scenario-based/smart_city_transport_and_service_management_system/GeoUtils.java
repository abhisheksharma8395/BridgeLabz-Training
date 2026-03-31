package smart_city_transport_and_service_management_system;

public interface GeoUtils {
    static double calculateDistance(Pair p1, Pair p2){
        double distance = Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2));
        return distance;
    }
}
