//optimized solution
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int sum = 0-nums[i];
                int low = i+1;
                int high = nums.length-1;
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                    res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    while(low<high && nums[low]==nums[low+1])low++;
                    while(low<high  && nums[high]==nums[high-1])high--;
                    low++;
                    high--;
                    }
                    else if(nums[low]+nums[high]>sum)
                        high--;
                    else
                        low++;
                }
                
            }
        }
        return res;
    }
}

//Brute Force Solution
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                     ArrayList<Integer> res = new ArrayList<Integer>();
                    if(nums[i]+nums[k]+nums[j]==0)
                    {
                       
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[k]);
                        
                    }
                    if(res.size()!=0)
                        list.add(res);
                }
            }
        }
        return list;
    }
}
