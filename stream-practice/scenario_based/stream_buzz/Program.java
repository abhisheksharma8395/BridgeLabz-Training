package stream_buzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
    public static List<CreatorStats> EngagementBoard = new ArrayList<>();

    public void registerCreator(CreatorStats record){
        EngagementBoard.add(record);
    }

    public Map<String,Integer> getTopPostCounts(List<CreatorStats> record, double likeThreshold){
        Map<String,Integer> map = new HashMap<>();
        for(CreatorStats stats : record){
            int countWeek = 0;
            for(double likes : stats.weeklyLikes){
                if(likes >= likeThreshold){
                    countWeek++;
                }
            }
            if(countWeek > 0) map.put(stats.creatorName,countWeek);
        }
        return map;
    }
    public double CalculateAverageLikes(){
        double likesSum = 0.0;
        for(CreatorStats stats : EngagementBoard){
            for(double likes : stats.weeklyLikes){
                likesSum+=likes;
            }
        }
        return (likesSum/(4*EngagementBoard.size()));
    }
}
