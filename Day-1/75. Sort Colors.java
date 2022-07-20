class Solution {
    public void sortColors(int[] nums) {
        int one=0,two=0,zero=0,f=0;
        for(int i:nums){
            if(i==0) zero++;
            else if(i==1) one++;
            else if(i==2) two++;
        }
        int k=0;
        while(zero>0){
            nums[k++]=0;
            zero--;
        }
        while(one>0){
            nums[k++]=1;
            one--;
        }
        while(two>0){
            nums[k++]=2;
            two--;
        }
    }
}
