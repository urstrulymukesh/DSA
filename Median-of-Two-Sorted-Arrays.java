1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        
4        int m=nums1.length;
5        int n=nums2.length;
6        int len=m+n;
7        int k=0;
8        int[] arr=new int[len];
9        for(int i=0;i<m;i++){
10            arr[k++]=nums1[i];
11        }
12        for(int i=0;i<n;i++){
13            arr[k++]=nums2[i];
14        }
15double ans=0;
16Arrays.sort(arr);
17        if(len%2==0){
18           ans=(arr[len/2] + arr[len/2-1])/2.0;
19
20        }
21        else{
22            ans=arr[len/2];
23
24        }
25        return ans;
26    }
27}