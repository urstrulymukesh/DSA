1class Solution {
2    public int maxProfit(int[] prices) {
3        int n=prices.length;
4        int count=0;
5        for(int i=1;i<n;i++){
6            if(prices[i]>prices[i-1]){
7                count+=prices[i]-prices[i-1];
8            }
9        }
10        return count;
11   
12        
13    }
14}