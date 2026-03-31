1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> hs=new HashSet<>();
4        
5        int k=0;
6        for(int i=0;i<nums1.length;i++){
7            for(int j=0;j<nums2.length;j++){
8                if(nums1[i]==nums2[j]){
9                    hs.add(nums2[j]);
10                }
11            }
12        }
13        int[] arr=new int[hs.size()];
14        for(int i:hs){
15            arr[k++]=i;
16        }
17        return arr;
18        
19    }
20}