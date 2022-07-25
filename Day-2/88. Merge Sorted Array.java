import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0;i<nums1.length;i++){
           for(int j=0;j<n;j++){
               if(i>=m){
                   nums1[i++]=nums2[j];
               }
           }
       }
        Arrays.sort(nums1);
    }
}
