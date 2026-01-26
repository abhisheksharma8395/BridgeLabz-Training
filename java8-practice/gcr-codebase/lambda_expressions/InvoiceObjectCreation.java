package lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("TXN1001", "TXN1002", "TXN1003");
        List<Invoice> ans = list.stream().map(Invoice::new).collect(Collectors.toList());
        ans.stream().forEach(System.out::println);
    }
}

class Invoice{
    String transactionId;                                          // Stores the transaction ID

    // Constructor of Invoice class to initialize the instance variable
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    // toString method to represent Invoice class object as String
    @Override
    public String toString() {
        return "Invoice for Txn: " + transactionId;
    }
}
