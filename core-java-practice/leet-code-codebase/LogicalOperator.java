public class LogicalOperator {
    public static void main(String[] args) {
        int num1 = 15, num2 = 10, num3 = 5;
        System.out.println((num1 > num2) && (num1 > num3)); // true AND true result true
        System.out.println((num1 > num2) && (num1 < num3)); // true AND false result false
        System.out.println((num2 > num3) || (num2 > num1)); // true OR false result true
        System.out.println((num1 > num2) || (num2 > num3)); // true OR true result true
        System.out.println((num1 < num2) && (num2 < num3)); // false AND false result false
    }
}
