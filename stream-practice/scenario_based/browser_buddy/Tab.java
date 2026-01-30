package browser_buddy;

// Tab class
public class Tab {

    String tabName;                                     // Stores the tab name
    HistoryNode first;                                 // Stores the first website of the tab
    HistoryNode last;                                  // Stores the last website of the tab
    HistoryNode current;                               // Store the current website of the tab

    // Constructor of Tab class
    public Tab(String tabName) {
        this.tabName = tabName;
        this.first = null;
        this.current = null;
        this.last = null;
    }

    // This method is used to go to another website
    public void visit(String url) {
        HistoryNode website = new HistoryNode(url);
        if (this.current == null) {
            this.first = this.current = this.last = website;
        } else {
            if (this.current != this.last) {
                // Making last equals to current page and deleting forward history
                this.last = this.current;
                this.last.next.prev = null;
                this.last.next = null;
            }
            this.last.next = website;
            website.prev = this.last;
            this.last = website;
            this.current = website;
        }
    }

    // This method is used to move back
    public void back() {
        if (this.current != null && this.current.prev != null) {
            current = current.prev;
            System.out.println("Back to website with url "+this.current.url);
        } else {
            System.out.println("No Previous history!");
        }
    }

    // This method is used to move back
    public void forward() {
        if (this.current != null && this.current.next != null) {
            current = current.next;
            System.out.println("Back to website with url "+this.current.url);
        } else {
            System.out.println("No forward history!");
        }
    }

    // This method is used to show the current website url
    public void getCurrent() {
        if (this.current != null) {
            System.out.println("Current Website Url : " + this.current.url);
        } else {
            System.out.println("No history!");
        }
    }

    // this method is used to display the website that is currently reachable in this tab
    public void display(){
        if(this.first == null) System.out.println("No website opened currently in "+this.tabName);
        else {
            System.out.println("The URL of websites that is opened in this tab");
            HistoryNode temp = this.first;
            while (temp != null) {
                System.out.println("Url : " + temp.url);
                temp = temp.next;
            }
        }
    }

}
