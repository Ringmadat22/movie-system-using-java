import java.util.Date;
// import java.util.List;

// Step 1: Common Abstract Entity
abstract class Entity {
    protected int id;
    protected String name;
    protected String description;

    public Entity(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public abstract void displayInfo();
    public abstract void uniqueOperation();
}

// Step 2: Specialized Entities

class Book extends Entity {
    private String author;
    private String condition;

    public Book(int id, String name, String description, String author, int pages, String condition) {
        super(id, name, description);
        this.author = author;
        this.condition = condition;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book [ID: " + id + ", Title: " + name + ", Author: " + author + ", Condition: " + condition + "]");
    }

    @Override
    public void uniqueOperation() {
        System.out.println("Reading \"" + name + "\" by " + author + ".");
    }

    public void checkAvailability(int daysLoaned) {
        if (daysLoaned > 14) {
            System.out.println("Overdue!");
        } else {
            System.out.println("Available for loan.");
        }
    }
}


class Appliance extends Entity {
    private int powerRating; // in watts
    private String energyClass;

    public Appliance(int id, String name, String description, int powerRating, String energyClass) {
        super(id, name, description);
        this.powerRating = powerRating;
        this.energyClass = energyClass;
    }

    @Override
    public void displayInfo() {
        System.out.println("Appliance [ID: " + id + ", Name: " + name + ", Power: " + powerRating + "W, Energy Class: " + energyClass + "]");
    }

    @Override
    public void uniqueOperation() {
        System.out.println("Using the appliance: " + name + " with power rating of " + powerRating + "W.");
    }

    public void checkEnergyEfficiency() {
        System.out.println("Energy efficiency class is " + energyClass + ".");
    }
}

class Furniture extends Entity {
    private String material;
    private String dimensions; // example format: "2x1x1 meters"

    public Furniture(int id, String name, String description, String material, String dimensions) {
        super(id, name, description);
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture [ID: " + id + ", Name: " + name + ", Material: " + material + ", Dimensions: " + dimensions + "]");
    }

    @Override
    public void uniqueOperation() {
        System.out.println("Placing furniture: " + name + " made of " + material + ".");
    }

    public void checkIfFits(String roomSize) {
        System.out.println("Checking if dimensions " + dimensions + " fit in room size " + roomSize + ".");
    }
}

class Clothing extends Entity {
    private String fabricType;
    private String size;

    public Clothing(int id, String name, String description, String fabricType, String size) {
        super(id, name, description);
        this.fabricType = fabricType;
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Clothing [ID: " + id + ", Name: " + name + ", Fabric: " + fabricType + ", Size: " + size + "]");
    }

    @Override
    public void uniqueOperation() {
        System.out.println("Wearing the clothing item: " + name + " in size " + size + ".");
    }

    public void checkFabricCareInstructions() {
        System.out.println("Care instructions for " + fabricType + " fabric.");
    }
}

class Movie extends Entity {
    private String director;
    private int duration; // in minutes

    public Movie(int id, String name, String description, String director, int duration) {
        super(id, name, description);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Movie [ID: " + id + ", Title: " + name + ", Director: " + director + ", Duration: " + duration + " mins]");
    }

    @Override
    public void uniqueOperation() {
        System.out.println("Playing \"" + name + "\" directed by " + director + ".");
    }

    public void recommend(String genre, int rating) {
        System.out.println("Recommended if you enjoy " + genre + " movies with a rating above " + rating + ".");
    }
}

class Gadget extends Entity {
    private int warrantyPeriod; // in years
    private Date purchaseDate;

    public Gadget(int id, String name, String description, int warrantyPeriod, Date purchaseDate) {
        super(id, name, description);
        this.warrantyPeriod = warrantyPeriod;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Gadget [ID: " + id + ", Name: " + name + ", Warranty: " + warrantyPeriod + " years]");
    }

    @Override
    public void uniqueOperation() {
        System.out.println("Using the gadget: " + name + ".");
    }

    public void checkWarrantyStatus() {
        long yearsUsed = (new Date().getTime() - purchaseDate.getTime()) / (1000L * 60 * 60 * 24 * 365);
        if (yearsUsed < warrantyPeriod) {
            System.out.println("Warranty active.");
        } else {
            System.out.println("Warranty expired.");
        }
    }
}

class Vehicle extends Entity {
    private int fuelCapacity; // in liters
    private double mileage; // in km per liter

    public Vehicle(int id, String name, String description, int fuelCapacity, double mileage) {
        super(id, name, description);
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vehicle [ID: " + id + ", Model: " + name + ", Fuel Capacity: " + fuelCapacity + "L, Mileage: " + mileage + " km/L]");
    }

    @Override
    public void uniqueOperation() {
        System.out.println("Driving the vehicle: " + name + ".");
    }

    public void calculateRange(int fuelLevel) {
        double rangeKm = fuelLevel * mileage;
        System.out.println("Estimated range with current fuel: " + rangeKm + " km.");
    }
}
