public class LogicalOperator {
    public static void main(String[] args) {
        int p = 15, q = 10, r = 5;
        System.out.println((p > q) && (p > r)); // true AND true result true
        System.out.println((p > q) && (p < r)); // true AND false result false
        System.out.println((q > r) || (q > p)); // true OR false result true
        System.out.println((p > q) || (q > r)); // true OR true result true
        System.out.println((p < q) && (q < r)); // false AND false result false
    }
}
