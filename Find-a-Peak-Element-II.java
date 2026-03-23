1class Solution {
2    public int[] findPeakGrid(int[][] mat) {
3        int m=mat.length;
4        int n=mat[0].length;
5        int i=0,j=0,i1=-1,i2=-1;
6        while(i<m && j<n && i>=0 && j>=0){
7             int up = (i > 0) ? mat[i - 1][j] : -1;
8            int down = (i < m - 1) ? mat[i + 1][j] : -1;
9            int left = (j > 0) ? mat[i][j - 1] : -1;
10            int right = (j < n - 1) ? mat[i][j + 1] : -1;
11            if(mat[i][j]>up && mat[i][j]>left && mat[i][j]>down && mat[i][j]>right){
12                i1=i;
13                i2=j;
14                break;
15            }
16            else if(mat[i][j]<up){
17                i--;
18            }
19            else if (mat[i][j]<down){
20                i++;
21            }
22            else if(mat[i][j]<left){
23                j--;
24            }
25            else if (mat[i][j]<right) {
26                
27            j++;
28        }
29        else{
30            break;
31        }
32        }
33        return new int[]{i1,i2};
34        
35    }
36}