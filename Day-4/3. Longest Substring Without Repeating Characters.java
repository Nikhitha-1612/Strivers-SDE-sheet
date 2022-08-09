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
