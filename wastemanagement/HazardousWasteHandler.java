package wastemanagement;

public class HazardousWasteHandler extends AbstractWasteHandler {
    @Override
    public void handleWaste(WasteContainer container) {
        if (container.getType() == WasteType.HAZARDOUS && container.isFull()) {
            System.out.println("Hazardous Waste Handler processing container ID: " 
                               + container.getId() + " (" + container.getCurrentCapacity() 
                               + "/" + container.getMaxCapacity() + " kg)");
            System.out.println("Sending hazardous waste for special treatment...");
            container.empty();
        } else {
            passToNextHandler(container);
        }
    }
}
