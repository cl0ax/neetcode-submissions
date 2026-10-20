/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> reverse_head = new ArrayList<>(); 
        ListNode curr = head; 
        while( head != null ) {
            reverse_head = curr.val; 
            curr = head.next; 
        }
        curr = head; 
        int i = reverse_head.size() - 1; 
        while( head != null ) {
            reverse_head.add( curr.get(i) );
            i--; 
            curr = next; 

        }

        return head;
    }
}
