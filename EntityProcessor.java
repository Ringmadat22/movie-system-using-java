import java.util.List;

// Step 3: Polymorphic Behavior
class EntityProcessor {
    public static void processEntities(List<Entity> entities) {
        System.out.println("\nProcessing Entities:");
        for (Entity entity : entities) {
            entity.displayInfo();
            entity.uniqueOperation();

            if (entity instanceof Gadget) {
                ((Gadget) entity).checkWarrantyStatus();
            } else if (entity instanceof Vehicle) {
                ((Vehicle) entity).calculateRange(10); // Example fuel level
            } else if (entity instanceof Book) {
                ((Book) entity).checkAvailability(7); // Example days loaned
            } else if (entity instanceof Movie) {
                ((Movie) entity).recommend("Sci-Fi", 8); // Example recommendation
            }
        }
    }
}
