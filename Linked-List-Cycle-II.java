1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14
15        // ListNode temp=head;
16        // HashSet<ListNode> hs=new HashSet<>();
17        // while(temp!=null){
18        //     if(hs.contains(temp)){
19        //         return temp;
20        //     }
21        //     else{
22        //         hs.add(temp);
23        //     }
24        //     temp=temp.next;
25        // }
26        // return null;
27
28        ListNode s=head;
29        ListNode f=head;
30        while(f!=null && f.next!=null){
31            s=s.next;
32            f=f.next.next;
33            if(s==f){
34                s=head;
35                while(s!=f){
36                s=s.next;
37                f=f.next;
38                }
39                return s;
40            }
41
42        }
43      
44        return null;
45        
46    }
47}