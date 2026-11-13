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

    public static int getCount(ListNode head){
        int count = 0;
        ListNode curr; 
        curr = head; 

        while( curr != null ){
            count++; 
            curr = curr.next; 
        }
        System.out.print(count); 
        return count; 
    }
    public boolean hasCycle(ListNode head) {
        ListNode curr;
        curr = head; 
        while( curr != null ) {
            curr = curr.next; 

            
        }

        return false; 
    }
}
