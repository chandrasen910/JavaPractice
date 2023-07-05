package Assignment;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    public void HandleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
        if(finance == true){
            double sanctionedAmount = vehicle.getPrice() - customer.getCashOnHand();
            boolean approved = runCreditHistrory(customer, sanctionedAmount);
            if(approved){
            customer.setCashOnHand(customer.getCashOnHand() + sanctionedAmount);
            }
            finance = false;
            HandleCustomer(customer, finance, vehicle);
        }
        else if(vehicle.getPrice() <= customer.getCashOnHand()){
            processTransaction(customer, vehicle);
        }
        else{
            System.out.println("Can you bring more money. Thankyou.");
        }
    }

    private boolean runCreditHistrory(Customer customer, double doubleAmount) {
        if(doubleAmount > 10000){
            return false;
        }
        else {
            return true;
        }
    }

    public void processTransaction(Customer customer, Vehicle vehicle) {
        customer.setCashOnHand(customer.getCashOnHand() - vehicle.getPrice());
        System.out.println("Thankyou for the purchasing "+ vehicle +". Customers account balence is: " + customer.getCashOnHand());
    }
}
