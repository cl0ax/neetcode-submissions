

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
        while( curr != null ) {
            curr.val = reverse_head.get(i); 
            i--;
            curr = curr.next; 
        }
        return head; 
    }
}
