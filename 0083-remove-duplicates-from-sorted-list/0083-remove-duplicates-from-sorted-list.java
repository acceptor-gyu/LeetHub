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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode prev = head;
        ListNode pos = head.next;

        while (pos != null) {
            if (prev.val == pos.val) {
                prev.next = pos.next;
                pos = prev.next;
            } else {
                prev = pos;
                pos = pos.next;
            }
        }
        return head;
    }
}