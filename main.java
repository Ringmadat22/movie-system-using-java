import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();
        
        // Creating instances of various entities
        entities.add(new Book(1, "The Alchemist", "A novel by Paulo Coelho", "Paulo Coelho", 197, "Good"));
        entities.add(new Movie(2, "Inception", "A mind-bending thriller", "Christopher Nolan", 148));
        entities.add(new Gadget(3, "Smartphone", "Latest model with high-resolution camera", 2, new Date(121, 8, 1))); // Date of purchase as example
        entities.add(new Vehicle(4, "Toyota Prius", "Eco-friendly hybrid car", 45, 20));
        entities.add(new Appliance(5, "Microwave Oven", "Compact oven for quick heating", 800, "A++"));
        entities.add(new Furniture(6, "Office Chair", "Ergonomic and adjustable", "Leather", "0.6x0.6x1.2 meters"));
        entities.add(new Clothing(7, "Jacket", "Winter coat with insulation", "Polyester", "Large"));

        // Process entities polymorphically
        EntityProcessor.processEntities(entities);
    }
}