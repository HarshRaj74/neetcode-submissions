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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode earlier=dummy;
        ListNode later=dummy;

        for(int i=0;i<=n;i++){
            earlier=earlier.next;
        }
        while(earlier!=null){
            later=later.next;
            earlier=earlier.next;
        }
        //remove later make prev as later
        later.next=later.next.next;
        return dummy.next;
    }
}
