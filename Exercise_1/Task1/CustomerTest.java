public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        customer1.customerID = 1;
        customer2.customerID = 2;     
        
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
    }
}
