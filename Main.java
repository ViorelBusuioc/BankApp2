public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Vasile Geogea");
        customer1.makeTransaction(1500.55);
        customer1.makeTransaction(-100.75);
        System.out.println(customer1);
        customer1.total();

        Customer customer2 = new Customer("Gicu Constantin");
        customer2.makeTransaction(2500.41);
        System.out.println(customer2);
        customer2.total();

        Bank bank = new Bank("ING");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        System.out.println(bank);
        bank.listCustomers();
        


    }
}
