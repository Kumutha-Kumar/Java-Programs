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
        ListNode nospeed = head;
        ListNode speed = head;

        while (speed != null && speed.next != null) {
            nospeed = nospeed.next;
            speed = speed.next.next;

            if (nospeed == speed) {
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
        node4.next = node3;  // Creates a cycle

        System.out.println(hasCycle(head) ? "true" : "false");
    }
}
