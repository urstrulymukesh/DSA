1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int n=arr.length;
4        if(n==1) return 0;
5        if(arr[0]>arr[1]) return 0;
6        if(arr[n-2]<arr[n-1]) return n-1;
7
8        
9        int l=1,r=n-2;
10        while(l<=r){
11            int mid=l+(r-l)/2;
12            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
13                return mid;
14            }
15            else if(arr[mid]<arr[mid+1]){
16                l=mid+1;
17            }
18            else{
19                r=mid-1;
20            }
21
22        }
23        return -1;
24        
25    }
26}