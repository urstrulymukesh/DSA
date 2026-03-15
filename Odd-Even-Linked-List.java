1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode oddEvenList(ListNode head) {
13        // if(head==null) return null;
14        // if(head.next==null) return head;
15        // ListNode temp=head;
16        
17        
18        // ListNode s=head;
19      
20        // ArrayList<Integer> li=new ArrayList<>();
21        
22        
23        // while(s!=null){
24        //       li.add(s.val);
25        //        if(s.next==null) break;
26        //     s=s.next.next;
27          
28            
29        // }
30      
31        // ListNode f=head.next;
32        
33        // while(f!=null ){
34        //     li.add(f.val);
35        //     if(f.next==null) break;
36        //     f=f.next.next;
37            
38        // }
39        // ListNode newnode=new ListNode(li.get(0));
40
41        // head=newnode;
42        // temp=head;
43        // for(int i=1;i<li.size();i++){
44        //     ListNode node=new ListNode(li.get(i));
45        //     temp.next=node;
46        //     temp=temp.next;
47          
48        // }
49        // return head;
50
51
52
53 if(head==null) return null;
54        if(head.next==null) return head;
55        ListNode temp=head;
56        ListNode dummyodd=new ListNode(0);
57        ListNode dummyeven=new ListNode(0);
58         ListNode eventail=dummyeven;
59         ListNode oddtail=dummyodd;
60         int pos=1;
61         while(temp!=null){
62            if(pos%2!=0){
63                oddtail.next=temp;
64                oddtail=oddtail.next;
65            }else{
66                eventail.next=temp;
67                eventail=eventail.next;
68            }
69            pos++;
70            temp=temp.next;
71
72         }
73         oddtail.next=dummyeven.next;
74         eventail.next=null;
75
76
77
78        
79
80        return dummyodd.next;
81        
82    }
83}