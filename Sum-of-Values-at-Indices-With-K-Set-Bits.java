1class Solution {
2    public static int setbits(int num){
3        int c=0;
4        while(num!=0){
5            
6            num=num&(num-1);
7            c++;
8        }
9        return c;
10
11    }
12    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
13        int ans=0;
14        for(int i=0;i<nums.size();i++){
15            int temp=setbits(i);
16            if(temp==k){
17                ans+=nums.get(i);
18                    }
19
20        
21    }
22    return ans;
23}
24}