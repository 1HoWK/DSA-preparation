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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next;
        }
        
        return slow;
    }
}


// slow and fast pointer
// slow: move one step each time
// fast: move 2 steps each time
// TC: O(n +n/2) == O(n), SC: O(1)