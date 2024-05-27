class Car {
    private String brand;
    private String model;
    private int year;

    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }
    public void displayDetails() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
}    
public class Constructor{
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Toyota", "ciaz", 2021);
        c1.displayDetails();
        c2.displayDetails();
    }
}