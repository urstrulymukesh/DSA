1class Solution {
2    public boolean isBalanced(String num) {
3        int n=num.length();
4        int sumeven=0,sumodd=0;
5        for(int i=0;i<n;i++){
6            char ch=num.charAt(i);
7            int a=ch-'0';
8            if(i%2==0){
9                sumeven+=a;
10            }else{
11                sumodd+=a;
12            }
13            
14        }
15        if(sumeven==sumodd){
16            return true;
17        }
18        return false;
19        
20    }
21}