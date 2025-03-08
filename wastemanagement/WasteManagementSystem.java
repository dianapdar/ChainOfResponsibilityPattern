package wastemanagement;
public class WasteManagementSystem {
    private WasteHandler firstHandler;

    public WasteManagementSystem() {
        WasteHandler organicHandler = new OrganicWasteHandler();
        WasteHandler recyclableHandler = new RecyclableWasteHandler();
        WasteHandler hazardousHandler = new HazardousWasteHandler();
        WasteHandler generalHandler = new GeneralWasteHandler();

        organicHandler.setNext(recyclableHandler);
        recyclableHandler.setNext(hazardousHandler);
        hazardousHandler.setNext(generalHandler);

        firstHandler = organicHandler;
    }

    public void collectWaste(WasteContainer container) {
        System.out.println("\n--- Processing container " + container.getId() + " ---");
        firstHandler.handleWaste(container);
    }
}
