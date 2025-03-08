package wastemanagement;

public class WasteContainer {
    private String id;
    private WasteType type;
    private double maxCapacity;
    private double currentCapacity;

    public WasteContainer(String id, WasteType type, double maxCapacity) {
        this.id = id;
        this.type = type;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
    }

    public String getId() { return id; }
    public WasteType getType() { return type; }
    public double getMaxCapacity() { return maxCapacity; }
    public double getCurrentCapacity() { return currentCapacity; }
    public boolean isFull() { return currentCapacity >= 0.8 * maxCapacity; }

    public void addWaste(double amount) {
        if (currentCapacity + amount > maxCapacity) {
            System.out.println("Cannot add " + amount + " kg to container " + id + ". Exceeds capacity.");
        } else {
            currentCapacity += amount;
            System.out.println("Added " + amount + " kg to " + type + " container " + id 
                               + " (Current: " + currentCapacity + "/" + maxCapacity + " kg)");
        }
    }

    public void empty() {
        currentCapacity = 0;
        System.out.println("Container " + id + " emptied.");
    }
}
