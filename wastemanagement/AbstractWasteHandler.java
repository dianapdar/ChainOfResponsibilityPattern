package wastemanagement;

public abstract class AbstractWasteHandler implements WasteHandler {
    private WasteHandler nextHandler;

    @Override
    public void setNext(WasteHandler handler) {
        this.nextHandler = handler;
    }

    protected void passToNextHandler(WasteContainer container) {
        if (nextHandler != null) {
            nextHandler.handleWaste(container);
        } else {
            System.out.println("End of chain reached. No suitable handler for container ID: " 
                               + container.getId() + " (" + container.getType() + ")");
        }
    }
}
