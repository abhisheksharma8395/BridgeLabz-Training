package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
        Pattern pattern = Pattern.compile(regex);

        String[] ipAddresses = new String[]{"192.168.1.1", "10.0.0.256", "01.1.1.1", "127.0.0.1", "255.255.255.255","300.1.1.1"};

        for (String ip : ipAddresses) {
            Matcher matcher = pattern.matcher(ip);
            System.out.println(ip + " is valid IP Address? : " + matcher.matches());
        }
    }
}
