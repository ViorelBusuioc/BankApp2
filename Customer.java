import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public void makeTransaction(double amount) {
        transactions.add(amount);
    }

    public void total() {
        double sum = 0;
        for (double i : transactions) {
            sum += i;
        }
        System.out.println("Total amount: " + sum);
    }

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
