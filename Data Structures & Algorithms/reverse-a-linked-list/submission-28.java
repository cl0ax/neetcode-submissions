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
        ListNode curr; 
        ListNode prev;
         
        //ListNode next; 
        prev = null; 
        curr = head; 

        while( curr != null ) {

            

            next = curr.next; //we're saving the ref to the next node

            curr.next = prev; // flipping the node

            prev = curr; 

            curr = next; 
        }
        return prev; 
    }
}
