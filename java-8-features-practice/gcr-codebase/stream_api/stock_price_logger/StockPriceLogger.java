package stream_api.stock_price_logger;
import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockerPrice = Arrays.asList(102.5, 103.2, 101.8, 104.1, 105.0);
        stockerPrice.forEach((Double price) -> System.out.println("Stock Price : "+price));
    }
}
