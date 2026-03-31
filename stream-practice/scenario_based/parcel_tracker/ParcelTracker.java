package parcel_tracker;

class ParcelTracker {
    private ParcelStage head;  // Start of the delivery chain

    // Initialize with basic delivery stages
    public void initializeDefaultStages() {
        head = new ParcelStage("Packed");
        ParcelStage shipped = new ParcelStage("Shipped");
        ParcelStage inTransit = new ParcelStage("In Transit");
        ParcelStage delivered = new ParcelStage("Delivered");

        // Linking the stages
        head.next = shipped;
        shipped.next = inTransit;
        inTransit.next = delivered;
    }

    // Add custom checkpoint after a given stage
    public void addCheckpoint(String afterStage, String newCheckpoint) {
        ParcelStage current = head;

        while (current != null && !current.stageName.equals(afterStage)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Stage '" + afterStage + "' not found. Cannot add checkpoint.");
            return;
        }

        ParcelStage newStage = new ParcelStage(newCheckpoint);
        newStage.next = current.next;
        current.next = newStage;
        System.out.println("Checkpoint '" + newCheckpoint + "' added after '" + afterStage + "'");
    }

    // Simulate parcel lost by breaking the chain after a given stage
    public void simulateParcelLost(String afterStage) {
        ParcelStage current = head;

        while (current != null && !current.stageName.equals(afterStage)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Cannot simulate parcel lost after '" + afterStage + "'");
            return;
        }

        current.next = null;
        System.out.println("Parcel tracking lost after '" + afterStage + "'");
    }

    // Display the full tracking history
    public void displayTracking() {
        if (head == null) {
            System.out.println("No tracking info available.");
            return;
        }

        ParcelStage current = head;
        System.out.println("Parcel Tracking Path:");
        while (current != null) {
            System.out.print(current.stageName);
            if (current.next != null)
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }
}

