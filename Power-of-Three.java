1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n<=0){
4            return false;
5        }
6        while(n%3==0){
7
8            n=n/3;
9        }
10        return n==1;
11        
12    }
13}