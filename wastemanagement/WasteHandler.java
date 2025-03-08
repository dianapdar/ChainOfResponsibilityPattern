package wastemanagement;

public interface WasteHandler {
    void setNext(WasteHandler handler);
    void handleWaste(WasteContainer container);
}
