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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13
14        ListNode dummy=new ListNode(0);
15        ListNode temp=dummy;
16        int carry=0;
17 
18        while(l1!=null || l2!=null || carry!=0){
19            int sum=0;
20           
21            
22            if(l1!=null){
23                sum+=l1.val;
24                l1=l1.next;
25            }
26            if(l2!=null){
27                sum+=l2.val;
28                l2=l2.next;
29            }
30            sum+=carry;
31            carry=sum/10;
32            int digit=sum%10;
33            ListNode newnode=new ListNode(digit);
34            temp.next=newnode;
35            temp=temp.next;
36
37
38        }
39        return dummy.next;
40
41        
42    }
43}