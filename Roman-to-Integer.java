1class Solution {
2    public int romanToInt(String s) {
3        int n=s.length();
4        int sum=0;
5        HashMap<Character,Integer> hm=new HashMap<>();
6        hm.put('I',1);
7         hm.put('V',5);
8          hm.put('X',10);
9           hm.put('L',50);
10            hm.put('C',100);
11             hm.put('D',500);
12              hm.put('M',1000);
13
14        for(int r=0;r<n;r++){
15        
16            int curr=hm.get(s.charAt(r));
17          
18            if(r <n-1 && curr<hm.get(s.charAt(r+1))){
19                sum-=curr;
20               
21            }else{
22                sum+=curr;
23               
24            }
25          
26        }
27        return sum;
28        
29    }
30}