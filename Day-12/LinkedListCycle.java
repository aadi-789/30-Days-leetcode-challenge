/**
 * LinkedListCycle
 */


public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();

        // Create a linked list with a cycle for testing
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = node4;
        node4.next = node2; // Create a cycle

        boolean result = linkedListCycle.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + result); // Output: true
    }

}

