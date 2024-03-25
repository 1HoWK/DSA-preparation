//Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        // exit when pointing at null
        while (currentNode != null) {
            // next elem is not null && current element is equals to next element
            while (currentNode.next != null && currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            }
            // proceed to next element
            currentNode = currentNode.next;
        }
        return head;

    }
}