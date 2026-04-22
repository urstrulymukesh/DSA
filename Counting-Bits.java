1class Solution {
2    public static int ones(int num){
3        int count=0;
4        while(num!=0){
5            if((num&1)!=0){
6                count++;
7            }
8            num=num>>1;
9        }
10        return count;
11    }
12    public int[] countBits(int n) {
13        int[] ans=new int[n+1];
14        for(int i=0;i<=n;i++){
15            int temp=ones(i);
16            ans[i]=temp;
17
18        }
19return ans;
20        
21    }
22}