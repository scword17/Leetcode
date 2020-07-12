package main.java.question53;

class Solution {
    public int maxSubArray(int[] nums) {
        int tmp_sum=0;
        int i=0;
        int ans=Integer.MIN_VALUE;
        for(i=0;i<nums.length;i++){
            if(tmp_sum+nums[i]<0){
                tmp_sum=0;
                if(nums[i]>ans){
                    ans=nums[i];
                }
            } else {
                tmp_sum+=nums[i];
                if(tmp_sum>ans){
                    ans=tmp_sum;
                }
            }
        }
        return ans;
    }
}
public class Q53 {
    public static void main(String []args) {
        System.out.println("hello");
    }
}
