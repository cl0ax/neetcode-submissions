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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //ListNode prev; 
        ListNode curr; 
        ListNode next; 

        curr = list1; 
        curr = list2; 
        //prev = null; 
        next = null; 

        while( curr != null ) {
            next = curr.next; 
            if( list1.val > list2.val ) {

            }
        }  
        return curr; 
    }
}