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
        while( curr != null ) {
            reverse_head.add( curr.val );
            curr = curr.next; 
        }
        curr = head; 
        int i = reverse_head.size() - 1; 
        while( curr != head ) {
            curr.val = reverse_head.get(i); 
            i--;
            curr = curr.next; 
        }
        return head; 
    }
}
