/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode curr1 = headA;
        ListNode curr2 = headB;

        int l1=0, l2=0;

        while(curr1 != null){
           l1++;
           curr1 = curr1.next;
        }
        while(curr2 != null){
            l2++;
            curr2 = curr2.next;
        }
        
        curr1 = headA;
        curr2 = headB;

        if(l1>l2){
            for(int i=0; i<l1-l2; i++){
                curr1 = curr1.next;
            }
        }
        else{
            for(int i=0; i< l2-l1; i++){
                curr2 = curr2.next;
            }
        }

        while(curr1 != curr2){
           curr1 = curr1.next;
           curr2 = curr2.next;
        }

     return curr2;
    }
}