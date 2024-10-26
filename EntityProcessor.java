import java.util.List;

// Step 3: Polymorphic Behavior
class EntityProcessor {
    public static void processEntities(List<Entity> entities) {
        System.out.println("\nProcessing Entities:");
        for (Entity entity : entities) {
            System.out.println("----- Processing Entity -----");
            entity.displayInfo();
            entity.uniqueOperation();

            if (entity instanceof Gadget) {
                ((Gadget) entity).checkWarrantyStatus();
            } else if (entity instanceof Vehicle) {
                ((Vehicle) entity).calculateRange(10);
            } else if (entity instanceof Book) {
                ((Book) entity).checkAvailability(7);
            } else if (entity instanceof Movie) {
                ((Movie) entity).recommend("Sci-Fi", 8);
            } else if (entity instanceof Appliance) {
                ((Appliance) entity).checkEnergyEfficiency();
            } else if (entity instanceof Furniture) {
                ((Furniture) entity).checkIfFits("4x4 meters");
            } else if (entity instanceof Clothing) {
                ((Clothing) entity).checkFabricCareInstructions();
            }
        }
    }
}
