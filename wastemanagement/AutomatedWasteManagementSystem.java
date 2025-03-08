package wastemanagement;

public class AutomatedWasteManagementSystem {
    public static void main(String[] args) {
        WasteManagementSystem system = new WasteManagementSystem();

        WasteContainer organic1 = new WasteContainer("ORG-001", WasteType.ORGANIC, 100.0);
        WasteContainer recyclable1 = new WasteContainer("REC-001", WasteType.RECYCLABLE, 150.0);
        WasteContainer hazardous1 = new WasteContainer("HAZ-001", WasteType.HAZARDOUS, 50.0);
        WasteContainer general1 = new WasteContainer("GEN-001", WasteType.GENERAL, 200.0);

        organic1.addWaste(85.0);
        recyclable1.addWaste(120.0);
        hazardous1.addWaste(25.0);
        general1.addWaste(170.0);

        system.collectWaste(organic1);
        system.collectWaste(recyclable1);
        system.collectWaste(hazardous1); 

        hazardous1.addWaste(30.0);
        system.collectWaste(hazardous1);

        system.collectWaste(general1);
    }
}
