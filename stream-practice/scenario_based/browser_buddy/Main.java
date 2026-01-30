package browser_buddy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TabHistoryManager historyManager = new TabHistoryManager();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("=======================================================================");
            System.out.println("Select A. For opening new Tab");
            System.out.println("Select B. For Displaying the tab opened");
            System.out.println("Select C. For opening the previously closed tab");
            System.out.println("Select D. For switching the tab");
            System.out.println("Select E. For doing operation on current tab");
            System.out.println("Select G. For exiting");
            System.out.println("=======================================================================");
            char choice = scanner.next().charAt(0);
            switch(choice){
                case 'A' :
                    historyManager.newTab();
                    break;
                case 'B':
                    historyManager.display();
                    break;
                case 'C':
                    historyManager.openClosedTabs();
                    break;
                case 'D':
                    System.out.println("Enter the Tab Name ");
                    String tabName = scanner.next();
                    historyManager.openTab(tabName);
                    break;
                case 'E':
                    historyManager.currentTabOperation();
                    break;
                case 'G':
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input! please try again");
            }
        }
    }
}
