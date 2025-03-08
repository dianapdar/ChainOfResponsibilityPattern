package wastemanagement;

public class RecyclableWasteHandler extends AbstractWasteHandler {
    @Override
    public void handleWaste(WasteContainer container) {
        if (container.getType() == WasteType.RECYCLABLE && container.isFull()) {
            System.out.println("Recyclable Waste Handler processing container ID: " 
                               + container.getId() + " (" + container.getCurrentCapacity() 
                               + "/" + container.getMaxCapacity() + " kg)");
            System.out.println("Sending recyclable waste for sorting...");
            container.empty();
        } else {
            passToNextHandler(container);
        }
    }
}
