package stream_api.email_notification;
import java.util.Arrays;
import java.util.List;

public class EmailNotification {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("abc@gmail.com","xyz@gmail.com","def@gmail.com","pqrs@gmail.com","tuv@gmail.com","mno@gmail.com","ghi@gmail.com","jkl@gmail.com","virat@gmail.com","modi@gmail.com");
        emails.forEach(email -> sendEmailNotification(email));
    }
    public static void sendEmailNotification(String email){
        System.out.println(email+" : Sale is live on myntra");
    }
}
