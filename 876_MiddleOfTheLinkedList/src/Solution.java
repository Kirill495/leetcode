public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    @SuppressWarnings("unused")
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}

        ListNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
