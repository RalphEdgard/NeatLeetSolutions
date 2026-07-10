/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {

        // Store each actual ListNode object that we visit.
        // We cannot store curr.val because different nodes can have the same value.
        Map<ListNode, Integer> visitedNodes = new HashMap<>();
        ListNode curr = head;

        // If there is no cycle, curr will eventually become null.
        // If there is a cycle, we will eventually visit the same node again.
        while (curr != null) {

            // Increase the number of times we have visited this exact node.
            visitedNodes.put(curr, visitedNodes.getOrDefault(curr, 0) + 1);

            // If this exact node has been visited more than once,
            // the linked list has returned to a previous node,
            // which means there is a cycle.
            if (visitedNodes.get(curr) > 1) { return true; }

            // Move to the next node in the linked list.
            curr = curr.next;
        }

        // Reaching null means the linked list has an ending,
        // so there is no cycle.
        return false;
    }
}
