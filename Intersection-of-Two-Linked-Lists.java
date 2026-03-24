1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        
15        HashSet<ListNode> li=new HashSet<>();
16        while(headA!=null){
17            li.add(headA);
18            headA=headA.next;
19        }
20          while(headB!=null){
21            if(li.contains(headB)){
22                return headB;
23            }
24            headB=headB.next;
25        }
26
27        return null;
28
29    }
30}