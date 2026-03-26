1class Solution {
2    public String removeOuterParentheses(String s) {
3        int n=s.length();
4        StringBuilder sb=new StringBuilder();
5        int cnt1=0;
6        for(int i=0;i<n;i++){
7            char ch=s.charAt(i);
8            if(ch=='('){
9                cnt1++;
10                 if(cnt1>1){
11                    sb.append('(');
12                 }
13                
14            }
15            else{
16                cnt1--;
17                if(cnt1>0){
18                    sb.append(')');
19                }
20            }
21           
22
23        }
24        return sb.toString();
25        
26    }
27}