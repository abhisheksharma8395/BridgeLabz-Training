package stream_buzz;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while(!flag) {
            System.out.println("1. Register Creator \n2. Show Top Posts \n3. Calculate Average Likes \n4. Exit \nEnter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter The Creator Name : \n");
                    String creatorName = scanner.nextLine();
                    double[] weeklyLikes = new double[4];
                    for (int i = 0; i < 4; i++) {
                        System.out.print("Enter the total likes count of week " + (i + 1) + "\n");
                        weeklyLikes[i] = scanner.nextDouble();
                    }
                    CreatorStats creator = new CreatorStats(creatorName, weeklyLikes);
                    program.registerCreator(creator);
                    System.out.println("Creator registered successfullly");
                    break;

                case 2:
                    System.out.println("Enter Like threshold : ");
                    double likeThreshold = scanner.nextDouble();
                    Map<String, Integer> map = program.getTopPostCounts(Program.EngagementBoard, likeThreshold);
                    if (map == null || map.isEmpty()) {
                        System.out.println("No Top-performing posts this week");
                    } else {
                        for (String key : map.keySet()) {
                            System.out.println(key + " -> " + map.get(key));
                        }
                    }
                    break;
                case 3:
                    System.out.printf("\n Overall average weekly likes : \n" + program.CalculateAverageLikes());
                    break;
                case 4:
                    System.out.println("Logging off — Keep Creating with StreamBuzz!");
                    flag = true;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
