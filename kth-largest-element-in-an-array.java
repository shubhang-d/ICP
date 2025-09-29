import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int a = kth_Largest_Element(nums, k);
        return a;
    }
    public static int kth_Largest_Element(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i = k;i<arr.length;i++){
            if(arr[i] > pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}