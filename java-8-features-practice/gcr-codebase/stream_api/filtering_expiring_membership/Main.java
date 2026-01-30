package stream_api.filtering_expiring_membership;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GymMember member1  = new GymMember("Virat Kohli",     LocalDate.of(2026, 2, 3));
        GymMember member2  = new GymMember("Rohit Sharma",     LocalDate.of(2026, 2, 10));
        GymMember member3  = new GymMember("KL Rahul",         LocalDate.of(2026, 2, 18));
        GymMember member4  = new GymMember("Hardik Pandya",    LocalDate.of(2026, 2, 24));
        GymMember member5  = new GymMember("Ravindra Jadeja",  LocalDate.of(2026, 2, 27));
        GymMember member6  = new GymMember("Jasprit Bumrah",   LocalDate.of(2026, 3, 5));
        GymMember member7  = new GymMember("Shubman Gill",     LocalDate.of(2026, 3, 14));
        GymMember member8  = new GymMember("Rishabh Pant",     LocalDate.of(2026, 4, 2));
        GymMember member9  = new GymMember("Mohammed Shami",   LocalDate.of(2026, 4, 18));
        GymMember member10 = new GymMember("Ishan Kishan",     LocalDate.of(2026, 5, 7));
        GymMember member11 = new GymMember("Suryakumar Yadav", LocalDate.of(2026, 5, 21));
        GymMember member12 = new GymMember("Axar Patel",       LocalDate.of(2026, 6, 6));
        GymMember member13 = new GymMember("Sachin Singh",     LocalDate.of(2026, 6, 25));
        GymMember member14 = new GymMember("Kuldeep Yadav",    LocalDate.of(2026, 7, 3));
        GymMember member15 = new GymMember("Sanju Samson",     LocalDate.of(2026, 7, 19));
        GymMember member16 = new GymMember("Deepak Chahar",    LocalDate.of(2026, 8, 8));
        GymMember member17 = new GymMember("Shreyas Iyer",     LocalDate.of(2026, 8, 26));
        GymMember member18 = new GymMember("Prithvi Shaw",     LocalDate.of(2026, 9, 10));
        GymMember member19 = new GymMember("Washington Sundar",LocalDate.of(2026, 10, 4));
        GymMember member20 = new GymMember("Arshdeep Singh",   LocalDate.of(2026, 11, 15));
        LocalDate today = LocalDate.now();
        System.out.println("Members whose membership expires within the next 30 days.");
        GymMember.members.stream().filter((GymMember member) -> ChronoUnit.DAYS.between(today,member.memberShipExpireDate) <= 30).toList().forEach(System.out::println);


    }
}
