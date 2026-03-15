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
12    public ListNode sortList(ListNode head) {
13        if(head==null) return null;
14        if(head.next==null) return  head;
15        
16
17        ListNode temp=head;
18        ArrayList<Integer> li=new ArrayList<>();
19        while(temp!=null){
20            li.add(temp.val);
21            temp=temp.next;
22        }
23        temp=head;
24        Collections.sort(li);
25        for(int i=0;i<li.size();i++){
26            temp.val=li.get(i);
27            temp=temp.next;
28        }
29        return head;
30    }
31    
32}