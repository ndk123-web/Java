// Create a class Transaction with attributes transactionId, transactionDate, and amount.
// Implement a Comparator<Transaction> to sort transactions first by transactionDate and then by amount in descending order.
// Test the sorting using Collections.sort() with the Comparator object.

import java.util.*;

class Transaction {

    int tid;
    String date;
    float amount;

    public Transaction(int tid, String date, float amount) {
        this.tid = tid;
        this.date = date;
        this.amount = amount;
    }

    public String toString() {
        return "Transaction [tid=" + tid + ", date=" + date + ", amount=" + amount + "]";
    }

}

public class Problem_3 {
    public static void main(String[] args) {

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction(123, "18102004", 78992));
        transactions.add(new Transaction(123, "20102004", 6899));
        transactions.add(new Transaction(123, "10102004", 8899));
        transactions.add(new Transaction(123, "21102004", 1899));

        Comparator<Transaction> com = (i, j) -> {
            int res = i.date.compareTo(j.date);
            if (res != 0)
                return res;

            return Float.compare(j.amount, i.amount);
        };

        Collections.sort(transactions, com);

        for (Transaction t : transactions)
            System.out.println(t);

    }
}
