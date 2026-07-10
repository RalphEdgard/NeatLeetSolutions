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
        Map<ListNode, Integer> visitedNodes = new HashMap<>();
        ListNode curr = head;
      
        while (curr != null) {
            visitedNodes.put(curr, visitedNodes.getOrDefault(curr, 0) + 1);
            if (visitedNodes.get(curr) > 1) { return true; }
            curr = curr.next;
        }
        return false;
    }
}
