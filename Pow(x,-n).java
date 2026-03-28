1class Solution {
2    public double myPow(double x, int n) {
3
4        double ans=1.0;
5        long num=n;
6        if(num<0) num=-1*num;
7        while(num>0){
8        if(num%2==1){
9            
10           ans=ans*x;
11           num=num-1;
12
13        }else{
14            x=x*x;
15            num=num/2;
16        }
17        }
18        if(n<0) ans=(double)(1.0)/(double)(ans);
19        return ans;
20        
21    }
22}