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
    public boolean hasCycle(ListNode head) {
        ListNode curr = head; 
        ArrayList<Integer> count = new ArrayList(); 
        while(curr != null ) {
            count.add(curr.val);
            curr = curr.next; 
        }
        
        for(int i = 0; i < count.size(); i++) {
            if( curr.next == null ){
                return false;
            }
            else{
                return true; 
            }
            curr = curr.next; 
        }
        return false; 
    }
}
