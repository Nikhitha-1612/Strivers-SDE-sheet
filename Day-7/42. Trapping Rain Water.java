class Solution {
    public int trap(int[] height) {
       int n= height.length;
        if(n<=2)
            return 0;
       int maxleft = height[0];
        int maxright = height[n-1];
        int left = 1;
        int right = n-2;
        int trappedwater = 0;
        while(left<=right){
            if(maxright>maxleft){
                if(height[left]>=maxleft){
                    maxleft = height[left];
                }
                else{
                    trappedwater+=maxleft - height[left];
                }
                left++;
            }
            else{
                    if(height[right]>=maxright){
                        maxright = height[right];
                    }
                    else{
                       trappedwater+=maxright - height[right];
                    }
                    right--;
            }
        }
        return trappedwater;
    }
}
