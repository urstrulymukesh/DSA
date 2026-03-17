1class Solution {
2    public int[] frequencySort(int[] nums) {
3        HashMap<Integer,Integer> hm=new HashMap<>();
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
7        }
8         PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
9            if(hm.get(a)==hm.get(b)){
10                return b-a;
11            }
12            else{
13                return hm.get(a)-hm.get(b);
14            }
15         });
16
17    for(int i:hm.keySet()){
18        pq.add(i);
19    }
20    int ans[]=new int[n];
21    int k=0;
22    while(!pq.isEmpty()){
23        int x=pq.poll();
24        for(int i=0;i<hm.get(x);i++){
25            ans[k++]=x;
26        }
27    }
28    return ans;
29    }
30}