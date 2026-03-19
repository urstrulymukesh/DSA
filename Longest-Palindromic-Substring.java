1class Solution {
2    // boolean ispalindrome(String s){
3    //     int n=s.length();
4    //     int l=0,r=n-1;
5    //     while(l<r){
6    //         if(s.charAt(l)!=s.charAt(r)){
7    //             return false;
8    //         }
9    //         l++;
10    //         r--;
11    //     }
12    //     return true;
13    // }
14    public String longestPalindrome(String s) {
15        // int n=s.length();
16        // int max=Integer.MIN_VALUE;
17        // String ans="";
18        // for(int i=0;i<n;i++){
19        //     StringBuilder sb=new StringBuilder();
20        // for(int r=i;r<n;r++){
21        //     char ch=s.charAt(r);
22        //     sb.append(ch);
23        //     int a=sb.toString().length();
24        //     if(ispalindrome(sb.toString())){
25        //         if(max<a){
26        //             max=a;
27        //         ans=sb.toString();
28        //         }
29        //     }
30
31        // }
32        // }
33        // return ans;
34
35
36
37        int n = s.length();
38        int st = 0, en = 0;
39
40        for(int i = 0; i < n; i++){
41            int len1 = expand(s, i, i);       // odd length
42            int len2 = expand(s, i, i + 1);   // even length
43
44            int len = Math.max(len1, len2);
45
46            if(len > en - st + 1){
47                st = i - (len - 1) / 2;
48                en = i + len / 2;
49            }
50        }
51
52        return s.substring(st, en + 1);
53    }
54     int expand(String s, int l, int r){
55        int n = s.length();
56
57        while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
58            l--;
59            r++;
60        }
61
62        return r - l - 1;
63    }
64}