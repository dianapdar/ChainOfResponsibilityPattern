package wastemanagement;

public class OrganicWasteHandler extends AbstractWasteHandler {
    @Override
    public void handleWaste(WasteContainer container) {
        if (container.getType() == WasteType.ORGANIC && container.isFull()) {
            System.out.println("Organic Waste Handler processing container ID: " 
                               + container.getId() + " (" + container.getCurrentCapacity() 
                               + "/" + container.getMaxCapacity() + " kg)");
            System.out.println("Sending organic waste for composting...");
            container.empty();
        } else {
            passToNextHandler(container);
        }
    }
}
