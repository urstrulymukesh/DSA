1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int n=nums.length;
4        int l=0,count=0;  
5        long prod=1;
6        if(k<=1) return 0;
7        for(int r=0;r<n;r++){
8            prod=prod*nums[r];
9
10            while(prod>=k){
11                prod=prod/nums[l];
12                l++;
13            }
14           count+=(r-l+1);
15            
16        }
17        return count;
18        
19    }
20}