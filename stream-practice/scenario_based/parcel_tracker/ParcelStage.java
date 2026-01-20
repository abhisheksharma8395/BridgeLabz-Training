package scenario_based.parcel_tracker;

class ParcelStage {
    String stageName;       // Name of the stage (e.g., Packed, Shipped, etc.)
    ParcelStage next;       // Pointer to the next stage

    // Constructor
    public ParcelStage(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}