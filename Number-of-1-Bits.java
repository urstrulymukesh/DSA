1class Solution {
2    public int hammingWeight(int n) {
3
4        // String ans="";
5        // int c=0;
6        
7        // while(n!=0){
8        //     int rem=n%2;
9        //     ans=rem+ans;
10        //     n=n/2;
11        // }
12        // System.out.println(ans);
13        // int len=String.valueOf(ans).length();
14        // for(int i=0;i<len;i++){
15        //     if(ans.charAt(i)=='1'){
16        //         c++;
17        //     }
18        // }
19        // return c;
20        int c=0;
21        while(n!=0){
22             if((n&1)==1){
23                c++;
24             }
25             n=n>>1;
26        }
27        return c;
28
29        
30    }
31}