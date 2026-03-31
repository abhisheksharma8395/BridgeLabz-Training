package stream_buzz;

public class CreatorStats {
    public String creatorName;                      // Stores the name of creator
    public double[] weeklyLikes;                    // Stores the  likes count weekly

    public CreatorStats(String creatorName, double[] weeklyLikes) {
        this.creatorName = creatorName;
        this.weeklyLikes = weeklyLikes;
    }
}
