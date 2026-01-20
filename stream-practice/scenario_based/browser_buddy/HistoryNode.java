package scenario_based.browser_buddy;

// HistoryNode class
public class HistoryNode {
    String url;                                   // Stores the url of the website
    HistoryNode prev;                             //  Stores the next node reference
    HistoryNode next;                             // Stores the previous node reference

    // Constructor of HistoryNode class
    public HistoryNode(String url){
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
