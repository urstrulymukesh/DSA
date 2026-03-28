1class Solution {
2    public int myAtoi(String s) {
3        int n=s.length();
4        int num=0,i=0;
5        boolean neg=false;
6       
7    
8        while(i<n && s.charAt(i)==' '){
9           i++;
10            
11        }
12        if(i==n){
13            return 0;
14        }
15        if(s.charAt(i)=='-'){
16            neg=true;
17            i++;
18        }
19        else if(s.charAt(i)=='+'){
20            i++;
21        }
22    
23    
24        while(i<n){
25           char ch=s.charAt(i);
26         
27          
28            if(ch<'0' || ch>'9'){
29                break;
30            }
31           int digit=ch-'0';
32                       if (num > (Integer.MAX_VALUE - digit) / 10) {
33                if (neg) {
34                    return Integer.MIN_VALUE;
35                } else {
36                    return Integer.MAX_VALUE;
37                }
38            }
39
40            num = num * 10 + digit;
41            i++;
42        }
43
44            
45        
46        if(neg){
47        return -num;
48        }
49        return num;
50        
51
52        
53    }
54}