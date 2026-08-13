package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
            List<int[]> result=new ArrayList<>();
            int start=intervals[0][0];
            int end=intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                int nextstart=intervals[i][0];
                int nextend=intervals[i][1];
                if(nextstart<=end){
                    end=Math.max(end, nextend);
                }
                else{
                    result.add(new int[]{start,end});
                    start=nextstart;
                    end=nextend;
                }

            }
            result.add(new int[]{start,end});
            return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        //System.out.println(MergeIntervals.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));
    }
}
