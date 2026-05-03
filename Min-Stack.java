1class MinStack {
2    Stack<Long> st;
3    long min;
4
5    public MinStack() {
6        st=new Stack<>();
7        
8    }
9    
10    public void push(int val) {
11        long v=val;
12        if(st.isEmpty()){
13            min=v;
14            st.push(v);
15
16        }
17        else if(v>=min){
18            st.push(v);
19        }
20        else{
21            st.push(2*v-min);
22            min=v;
23        }
24        
25    }
26    
27    public void pop() {
28        if(st.isEmpty()){
29            return ;
30
31        }
32        long x=st.pop();
33        if(x<min){
34            min=2*min-x;
35        }
36    }
37    
38    public int top() {
39        if(st.isEmpty()){
40            return -1;
41        }
42        long x=st.peek();
43        if(x>=min){
44            return (int)x;
45        }
46        return (int)min;
47    }
48    
49    public int getMin() {
50        if(st.isEmpty()) return -1;
51        return (int)min;
52        
53    }
54}
55
56/**
57 * Your MinStack object will be instantiated and called as such:
58 * MinStack obj = new MinStack();
59 * obj.push(val);
60 * obj.pop();
61 * int param_3 = obj.top();
62 * int param_4 = obj.getMin();
63 */