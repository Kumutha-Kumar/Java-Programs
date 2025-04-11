public class LinkedListCycle {
    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode A = head;
        ListNode B = head;

        while (B != null && B.next != null) {
            A = A.next;
            B = B.next.next;

            if (A == B) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head.next = node3;
        node3.next = node4;
        node4.next = node3;

        System.out.println(hasCycle(head) ? "true" : "false");
    }
}
