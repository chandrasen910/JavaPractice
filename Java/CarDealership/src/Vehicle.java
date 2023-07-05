package Assignment;

public class Vehicle {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
   
    public void setModel(String model) {
        this.model = model;
    }
    
    public Vehicle(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    public String toString() {
        return "Vehicle [name=" + name + ", model=" + model + ", price=" + price + "]";
    }
    private String name;
    private String model;
    private double price;
    
}
