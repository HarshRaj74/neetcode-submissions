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
        //have two pointers, p1 and p2
        //while loop till either are null(as have to decide for last node aswell)
        //compare p1.val and p2.val for now just have a new listnode and keep on adding and updating
        ListNode l=new ListNode();
        ListNode output=l;
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode temp;
        if(p1==null){
            return p2;
        }
        if(p2==null){
            return p1;
        }
        while(p1 !=null && p2!=null){
            if(p1.val<=p2.val){
                l.val=p1.val;
                p1=p1.next;
                l.next=new ListNode();
                l=l.next;
            }
            else{
                l.val=p2.val;
                p2=p2.next;
                l.next=new ListNode();
                l=l.next;
            }

        }
        if(p1==null){
            l.val=p2.val;
            l.next=p2.next;
        }
        else{
            l.val=p1.val;
            l.next=p1.next;
        }
        return output;
    }
}