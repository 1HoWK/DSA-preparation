// LeetCode 206. Reverse Linked List

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
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;     
        ListNode nextNode = null;        
        ListNode previousNode = null;    

        // three pointers solution
        while(currentNode != null){
            nextNode = currentNode.next;  
            currentNode.next = previousNode; 
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;

    }
}

// 1 -> 2 -> 3 -> 4 -> 5 null

// null 1 -> 2 -> 3 -> 4 -> 5

// null <- 1 2 -> 3 -> 4 -> 5