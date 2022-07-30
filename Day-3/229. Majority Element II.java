class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list2 = new ArrayList<>();
        HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
        for(int num:nums){
            if(list.containsKey(num))
                list.put(num,list.get(num)+1);
            else
                list.put(num,1);
        }
        for(Map.Entry<Integer,Integer> pair: list.entrySet()){
            if(pair.getValue()>nums.length/3)
              list2.add(pair.getKey());
        }
        return list2;
    }
}
