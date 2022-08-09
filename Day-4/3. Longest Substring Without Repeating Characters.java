//Brute Force
class Solution {
    public int lengthOfLongestSubstring(String str) {
      if(str.length()==0)
          return 0;
        int maxi =0;
        for(int i=0;i<str.length();i++){
            HashSet<Character> hs = new HashSet<Character>();
            for(int j=i;j<str.length();j++){
                if(hs.contains(str.charAt(j))){
                 maxi = Math.max(maxi, j-i);
                break;
                }
               hs.add(str.charAt(j));
            }
        }
        return maxi;
    }
}
//Time complexity : O(n^2)
//Space Complexity : O(n)

//optmized solution
class Solution {
    public int lengthOfLongestSubstring(String str) {
      if(str.length()==0)
          return 0;
      int maxi = Integer.MIN_VALUE;
      int l =0;
        HashSet<Character> hs = new HashSet<>();
      for(int r =0;r<str.length();r++){
          if(hs.contains(str.charAt(r))){
              while(l<r && hs.contains(str.charAt(r))){
                  hs.remove(str.charAt(l));
                  l++;
              }
          }
          hs.add(str.charAt(r));
          maxi = Math.max(maxi,r-l+1);
      }
        return maxi;
    }
}
//Time Complexity : O(2N)
//Space Complexity : O(N)
