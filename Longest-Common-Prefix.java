1class Solution {
2    // static String prefix(String s1,String s2){
3    //     int i=0;
4        
5       
6    //     String s="";
7    //     while(i<s1.length() && i<s2.length()){
8    //         if(s1.charAt(i)!=s2.charAt(i)){
9    //             break;
10    //         }else{
11    //             s+=s1.charAt(i);
12    //         }
13    //         i++;
14            
15    //     }
16    //     return s;
17
18
19    // }
20
21    public String longestCommonPrefix(String[] strs) {
22        int n=strs.length;
23        // String ans=strs[0];
24        // for(int i=1;i<n;i++){
25           
26        //     ans=prefix(ans,strs[i]);
27        //     if(ans.equals("")){
28        //         return "";
29        //     }
30
31        // }
32        // return ans;
33        
34        Arrays.sort(strs);
35        StringBuilder ans=new StringBuilder();
36        String first=strs[0];
37        String last=strs[n-1];
38      for(int i=0;i<Math.min(first.length(),last.length());i++){
39        if(first.charAt(i)!=last.charAt(i)){
40            return ans.toString();
41        }
42        ans.append(first.charAt(i));
43
44      }
45        
46         return ans.toString();
47    }
48}