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
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        ArrayList<Integer> list = new ArrayList<>();
        if (head == null || head.next == null) {
            return head;
        }
        while(curr != null){
           list.add(curr.val);
           if(curr.next != null){
              curr = curr.next.next;
           }
           else{
            break;
           }
        }


           curr = head.next;
           while(curr != null){
            list.add(curr.val);
            if(curr.next != null){
                curr = curr.next.next;
            }
            else{
                break;
            }
           }

        ListNode newHead = new ListNode(list.get(0));
        ListNode tail = newHead;

        for (int i = 1; i < list.size(); i++) {
            tail.next = new ListNode(list.get(i));
            tail = tail.next;
        }

        return newHead;
    
    }
}