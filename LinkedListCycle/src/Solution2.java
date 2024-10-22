import listNode.ListNode;

public class Solution2 {
    public boolean hasCycle(ListNode head) {
        ListNode fast, slow;
        if (head == null || head.next == null) {
            return false;
        }

        slow = head;
        fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
