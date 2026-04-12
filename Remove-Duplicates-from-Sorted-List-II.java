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
12    public ListNode deleteDuplicates(ListNode head) {
13        HashMap <Integer,Integer> hm=new HashMap<>();
14        ListNode temp=head;
15        ListNode prev=null;
16        while(temp!=null){
17            hm.put(temp.val,hm.getOrDefault(temp.val,0)+1);
18            temp=temp.next;
19        }
20       ArrayList<Integer> li=new ArrayList<>();
21      
22      for(int i:hm.keySet()){
23        if(hm.get(i)==1){
24            li.add(i);
25        }
26      }
27
28     Collections.sort(li);
29      temp=head;
30      int i=0;
31    
32      while(temp!=null && i<li.size()){
33        temp.val=li.get(i);
34        prev=temp;
35        temp=temp.next;
36        i++;
37      }
38      if(prev!=null){
39        prev.next=null;
40      }else{
41        return null;
42      }
43      return head;
44
45        
46    }
47}