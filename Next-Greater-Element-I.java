1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4     
5
6        int ans[]=new int[n];
7        for(int i=0;i<n;i++){
8              int x=nums1[i];
9              boolean found=false;
10            for(int j=0;j<nums2.length;j++){
11                if(nums1[i]==nums2[j]){
12                  
13                    for(int k=j+1;k<nums2.length;k++){
14                        if(nums2[k]>x){
15                            ans[i]=nums2[k];
16                            found=true;
17                            break;
18                        }
19                    }
20                    if(!found){
21                        ans[i]=-1;
22                    }
23                    break;
24                }
25            }
26        }
27        return ans;
28        
29    }
30}