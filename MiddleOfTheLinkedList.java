/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head.next;
        while(temp!=null){
            head=head.next;
            if(temp.next==null) return head;
            temp=temp.next.next;
        }
        return head;
    }
}