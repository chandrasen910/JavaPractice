package Assignment;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", "123 cyberonics blvd", 12000);

        Vehicle vehicle1 = new Vehicle("Toyota", "Carolla",13000);

        Employee employee1 = new Employee();
        employee1.setName("Danny");

        cust1.purchaseCar(vehicle1, employee1, true);

    }
    
}
