package stream_api.logging_transaction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class LoggingTransaction {
    public static void main(String[] args) {
        List<String> transactionId = Arrays.asList("TXN1001","TXN1002","TXN1003","TXN1004","TXN1005","TXN1006","TXN1007","TXN1008","TXN1009","TXN1010");
        transactionId.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
