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
// System.out.print("testing");

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode prev;
        ListNode curr;
        ListNode next;
        ListNode inital; 

        ListNode nodes = head.getChildNodes();
        for(int i = 0; i < nodes.length; i++  ) {
            ListNode node = nodes.item(i);
            System.out.print(node);
        }

        // initial = head; 

        // curr = head;
        // prev = null;


        // while (curr != null) {
        //     next = curr.next;

        //     curr = next; 

        //     prev = curr;
        // }
        return false;
    }
}
