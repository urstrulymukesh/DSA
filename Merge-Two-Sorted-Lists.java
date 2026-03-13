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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ArrayList<Integer> li=new ArrayList<>();
14
15        if(list1==null) return list2;
16        if(list2==null) return list1;
17        // ListNode temp1=list1;
18        // ListNode temp2=list2;
19        // while(temp1!=null){
20        //     li.add(temp1.val);
21        //     temp1=temp1.next;
22        // }
23        //  while(temp2!=null){
24        //     li.add(temp2.val);
25        //     temp2=temp2.next;
26        // }
27        // Collections.sort(li);
28
29        // ListNode head=null;
30        // ListNode temp=null;
31        // ListNode dummy=new ListNode(-1);
32        // temp=dummy;
33        // for(int i=0;i<li.size();i++){
34        //     temp.next=new ListNode(li.get(i));
35        //     temp=temp.next;
36        // }
37        // return dummy.next;
38        
39        
40
41        ListNode head=null;
42        ListNode temp=null;
43        if(list1.val<=list2.val){
44            head=list1;
45            list1=list1.next;
46        }else{
47            head=list2;
48            list2=list2.next;
49        }
50        temp=head;
51
52        while(list1!=null && list2!=null){
53            if(list1.val<=list2.val){
54                temp.next=list1;
55                list1=list1.next;
56            }
57            else{
58                temp.next=list2;
59                list2=list2.next;
60            }
61            temp=temp.next;
62        }
63        if(list1!=null){
64            temp.next=list1;
65        }else{
66            temp.next=list2;
67        }
68        return head;
69        
70
71
72        
73        
74       
75        
76    }
77}