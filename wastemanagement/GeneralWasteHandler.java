package wastemanagement;

public class GeneralWasteHandler extends AbstractWasteHandler {
    @Override
    public void handleWaste(WasteContainer container) {
        if (container.getType() == WasteType.GENERAL && container.isFull()) {
            System.out.println("General Waste Handler processing container ID: " 
                               + container.getId() + " (" + container.getCurrentCapacity() 
                               + "/" + container.getMaxCapacity() + " kg)");
            System.out.println("Sending general waste to landfill...");
            container.empty();
        } else {
            passToNextHandler(container);
        }
    }
}
