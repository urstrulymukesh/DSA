1class Solution {
2    static boolean dfs(char[][] board,boolean vis[][],int i,int j,String word,int k){
3        int m=board.length;
4        int n=board[0].length;
5        if(i>=m || j>=n || i<0 || j<0  || vis[i][j] || board[i][j]!=word.charAt(k)){
6            return false;
7        }
8        if(k==word.length()-1) return true;
9        vis[i][j]=true;
10        
11
12        boolean ans=dfs(board,vis,i-1,j,word,k+1)|| dfs(board,vis,i,j-1,word,k+1)||dfs(board,vis,i+1,j,word,k+1)||
13 dfs(board,vis,i,j+1,word,k+1);
14        vis[i][j]=false;
15        return ans;
16
17    }
18    public boolean exist(char[][] board, String word) {
19        int m=board.length;
20        int n=board[0].length;
21        boolean vis[][]=new boolean[m][n];
22        int k=0;
23        
24        
25       
26        for(int i=0;i<m;i++){
27            for(int j=0;j<n;j++){
28
29                if(board[i][j]==word.charAt(0)){
30                    if(dfs(board,vis,i,j,word,k)){
31                        return true;
32                    }
33                }
34
35            }
36        }
37        return false;
38    }
39}