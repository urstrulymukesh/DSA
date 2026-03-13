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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        if(head==null )  return null;
14        
15        
16
17
18        ListNode temp=head;
19        int count=0;
20        while(temp!=null){
21            count++;
22            temp=temp.next;
23        }
24        if(count==n) return head.next;
25        temp=head;
26        int k=count-n;
27        for(int i=1;i<k;i++){
28            temp=temp.next;
29        }
30        temp.next=temp.next.next;
31        return head;
32        
33    }
34}