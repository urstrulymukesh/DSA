1class Solution {
2
3    static void dfs(int[][] grid,int i,int j, int oldcolor,int color){
4        int m=grid.length;
5        int n=grid[0].length;
6        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]!=oldcolor) return;
7        grid[i][j]=color;
8        
9        dfs(grid,i-1,j,oldcolor,color);
10         dfs(grid,i,j-1,oldcolor,color);
11          dfs(grid,i+1,j,oldcolor,color);
12         dfs(grid,i,j+1,oldcolor,color);
13       
14    }
15
16    
17    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
18     
19     int oldcolor=image[sr][sc];
20     if(color==oldcolor){
21        return image;
22     }
23     dfs(image,sr,sc,oldcolor,color);
24        
25
26return image;
27
28        
29    }
30}