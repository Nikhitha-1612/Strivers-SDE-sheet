//Kadane’s Algorithm 
class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi)
                maxi=sum;
            if(sum<0)
                sum=0;
        }
        return maxi;
    }
}
//Time Complexity:O(n)
class Solution {
    public static int maxSubArray(int[] nums, ArrayList < Integer > subarray) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < nums.length; j++) {
                curr_sum += nums[j];
                if (curr_sum > max_sum) {
                    subarray.clear();
                    max_sum = curr_sum;
                    subarray.add(i);
                    subarray.add(j);
                }
            }
        }
        return max_sum;
    }
}
//Time complexity:O(n^2)
