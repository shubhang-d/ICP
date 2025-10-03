import java.util.Arrays;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int j = 0;
        int count=0;
        for(int i =1;i<intervals.length;i++){
            if(intervals[j][1]>intervals[i][0]){
                count++;
            }else {
                j = i;
            }
        }
        return count;
    }
}