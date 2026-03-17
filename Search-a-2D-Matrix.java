1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        
4        int l=0;
5        int m=matrix.length;
6        int n=matrix[0].length;
7        int r=(n*m)-1;
8        while(l<=r){
9            int mid=l+(r-l)/2;
10            if(matrix[mid/n][mid%n]==target){
11                return true;
12            }
13            else if(matrix[mid/n][mid%n]<target){
14                l=mid+1;
15            }else{
16                r=mid-1;
17            }
18
19        }
20        return false;
21        
22    }
23}