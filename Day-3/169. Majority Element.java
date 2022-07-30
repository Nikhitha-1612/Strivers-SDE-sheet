class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
        for(int num:nums){
            if(list.containsKey(num))
                list.put(num,list.get(num)+1);
            else
                list.put(num,1);
        }    
        for(Map.Entry<Integer,Integer> pair :list.entrySet())
        {
            if(pair.getValue()>nums.length/2){
                return pair.getKey();
            }
        }
        return 0;
    }
}
