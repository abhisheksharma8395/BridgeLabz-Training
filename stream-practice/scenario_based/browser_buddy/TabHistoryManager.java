package scenario_based.browser_buddy;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TabHistoryManager {
    List<Tab> openTabs;                                  // Stores the list of open tabs
    Tab currentTab;                                      // Stores the current tab reference
    Stack<Tab> closedTabs;                               // Stores the closed tab
    int tabOpened;                                       // Stores the number of total tabs opened

    // Constructor of TabHistoryManager
    public TabHistoryManager() {
        this.tabOpened = 0;
        this.openTabs = new ArrayList<>();
        this.closedTabs = new Stack<>();
    }

    // This method is used to add new Tab in your browser
    public void newTab() {
        Tab tab = new Tab("Tab" + (this.tabOpened) + 1);
        this.openTabs.add(tab);
        currentTab = tab;
        this.tabOpened++;
        System.out.println("Successfully opened the new tab");
    }

    // This method is used to display the open tabs
    public void display() {
        System.out.println("===================================  Details of Open Tabs ======================================");
        for (Tab tab : this.openTabs) {
            System.out.println("================================ " + tab.tabName + " ==========================================");
            tab.display();
        }
    }

    // This method is used to open the closed tabs
    public void openClosedTabs() {
        if (this.closedTabs == null) {
            System.out.println("No closed tab are present please try again");
            return;
        }
        Tab tab = closedTabs.pop();
        this.openTabs.add(tab);
        this.currentTab = tab;
    }

    // This method is used to switch the tab
    public void openTab(String tabName) {
        for (Tab tab : this.openTabs) {
            if (tab.tabName.equals(tabName)) {
                currentTab = tab;
                System.out.println("Switched to tab with name " + tab.tabName);
                return;
            }
        }
        System.out.println("No Tab Found with the name " + tabName);
    }

    // This tab is used to do current tab operations
    public void currentTabOperation() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("=======================================================================");
            System.out.println("Select 1. For visiting another website in current tab");
            System.out.println("Select 2. For visiting previous website in current tab");
            System.out.println("Select 3. For visiting forward website in current tab");
            System.out.println("Select 4. For getting the url of current website");
            System.out.println("Select 5. For displaying the websites that is opened in current Tab");
            System.out.println("Select 6. For closing the current tab ");
            System.out.println("Select 7. For exiting");
            System.out.println("=======================================================================");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter the url of website you want to visit : ");
                    String url = scanner.next();
                    String regex = "^(https://)?(www\\.)?[a-zA-Z0-9_]{2,}\\.[a-zA-Z]{2,}";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(url);
                    if (matcher.matches()) {
                        this.currentTab.visit(url);
                        System.out.println("Successfully Visited to website with url " + url);
                    } else {
                        System.out.println("It is not a correct url please try again!");
                    }
                    break;
                case 2:
                    this.currentTab.back();
                    break;
                case 3:
                    this.currentTab.forward();
                    break;
                case 4:
                    this.currentTab.getCurrent();
                    break;
                case 5:
                    this.currentTab.display();
                    break;
                case 6:
                    if (this.currentTab == null) {
                        System.out.println("There is no tab that is currently open");
                        return;
                    }
                    this.closedTabs.push(currentTab);
                    // Removing the currentTab from openTabs list
                    for (int i = 0; i < this.openTabs.size(); i++) {
                        if (this.openTabs.get(i) == currentTab) {
                            this.openTabs.remove(i);
                        }
                    }
                    if (openTabs.isEmpty()) currentTab = null;
                        // Opening any random tab as currentTab after removing currentTab
                    else {
                        Random random = new Random();
                        currentTab = openTabs.get(random.nextInt(openTabs.size()));
                    }
                case 7:
                    flag = false;
                    System.out.println("Successfully Exited from the current tab operation");
                    break;
                default:
                    System.out.println("Invalid Input! please try again");
            }
        }
    }


}
