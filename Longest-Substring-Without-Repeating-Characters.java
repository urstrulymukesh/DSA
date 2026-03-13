1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3               int ans=0,l=0;
4    HashSet<Character> hs=new HashSet<>();
5
6for(int r=0;r<s.length();r++){
7    char ch=s.charAt(r);
8    if(!hs.contains(ch)){
9        hs.add(ch);
10    }
11    else{
12        while(hs.contains(ch)){
13            
14            hs.remove(s.charAt(l));
15            l++;
16        }
17        hs.add(ch);
18    }
19    ans=Math.max(ans,r-l+1);
20}
21return ans;
22        
23    }
24}