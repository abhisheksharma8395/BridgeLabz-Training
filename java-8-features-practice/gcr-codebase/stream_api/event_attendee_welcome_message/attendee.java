package stream_api.event_attendee_welcome_message;

import java.util.ArrayList;
import java.util.List;

public class attendee {
    public static void main(String[] args) {
        List<String> attendeeName = new ArrayList<>();
        attendeeName.add("Virat Kohli");
        attendeeName.add("Rohit Sharma");
        attendeeName.add("KL Rahul");
        attendeeName.add("Hardik Pandya");
        attendeeName.add("Ravindra Jadeja");
        attendeeName.add("Jasprit Bumrah");
        attendeeName.add("Shubman Gill");
        attendeeName.add("Rishabh Pant");
        attendeeName.add("Suryakumar Yadav");
        attendeeName.add("Sanju Samson");
        attendeeName.forEach((String name) -> System.out.println("Welcome "+name));
    }
}
