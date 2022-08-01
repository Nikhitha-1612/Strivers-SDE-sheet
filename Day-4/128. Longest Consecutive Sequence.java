class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int longstreak=1;
        int currstreak=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                if(nums[i-1]+1==nums[i]){
                    currstreak++;
            }
            else
            {
                longstreak=Math.max(currstreak,longstreak);
                currstreak=1;
            }
        }
       }
        return Math.max(longstreak,currstreak);
    }
}
//Time complexity:O(nlogn)

//Solution-2
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set = new HashSet<Integer>();
        for(int num : nums){
            num_set.add(num);
        }
        int longeststreak=0;
        
        for(int num : num_set){
            if(!num_set.contains(num-1)){
                int currentNum = num;
                int currentstreak = 1;
                
                while(num_set.contains(currentNum+1)){
                    currentNum+=1;
                    currentstreak+=1;
                }
                longeststreak = Math.max(longeststreak,currentstreak);
            }
        }
        return longeststreak;
    }
}
//Time complexity:O(n)
