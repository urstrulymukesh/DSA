1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        int n=nums.length;
4        List<List<Integer>> ans=new ArrayList<>();
5        int subset=1<<n;
6        for(int i=0;i<subset;i++){
7            ArrayList<Integer> li=new ArrayList<>();
8            for(int j=0;j<n;j++){
9                if((i&(1<<j))!=0){
10                    li.add(nums[j]);
11                }
12            }
13            ans.add(li);
14        }
15        return ans;
16        
17    }
18}