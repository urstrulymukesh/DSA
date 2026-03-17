1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3
4
5        //  int n = nums.length;
6        // int maxFreq = 0;
7
8        // // Find maximum frequency
9        // for (int i = 0; i < n; i++) {
10        //     int freq = 0;
11        //     for (int j = 0; j < n; j++) {
12        //         if (nums[i] == nums[j]) {
13        //             freq++;
14        //         }
15        //     }
16        //     maxFreq = Math.max(maxFreq, freq);
17        // }
18
19        // // Count total elements having max frequency
20        // int ans = 0;
21        // for (int i = 0; i < n; i++) {
22        //     int freq = 0;
23        //     for (int j = 0; j < n; j++) {
24        //         if (nums[i] == nums[j]) {
25        //             freq++;
26        //         }
27        //     }
28        //     if (freq == maxFreq) {
29        //         ans++;
30        //     }
31        // }
32
33
34
35
36        HashMap<Integer,Integer> hm=new HashMap<>();
37        int n=nums.length;
38        for(int i=0;i<n;i++){
39            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
40        }
41        int max=0;
42
43        for(int i:hm.keySet()){
44            if(max<hm.get(i)){
45                max=hm.get(i);
46            }          
47        }
48        int count=0;
49        for(int i:hm.keySet()){
50            if(hm.get(i)==max){
51                count+=max;
52            }
53        }
54
55return count;
56        
57    }
58}