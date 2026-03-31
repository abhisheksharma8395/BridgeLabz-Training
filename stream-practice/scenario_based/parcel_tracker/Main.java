package parcel_tracker;

public class Main {
    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();

        // Initialize with default stages
        tracker.initializeDefaultStages();
        tracker.displayTracking();

        // Add a custom checkpoint after "Shipped"
        tracker.addCheckpoint("Shipped", "At Local Hub");
        tracker.displayTracking();

        // Simulate parcel lost after "In Transit"
        tracker.simulateParcelLost("In Transit");
        tracker.displayTracking();
    }
}