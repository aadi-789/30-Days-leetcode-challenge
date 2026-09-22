

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find the starting node of cycle
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        LinkedListCycleII linkedListCycleII = new LinkedListCycleII();

        // Create a linked list with a cycle for testing
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = node4;
        node4.next = node2; // Create a cycle

        ListNode cycleStartNode = linkedListCycleII.detectCycle(head);
        if (cycleStartNode != null) {
            System.out.println("The cycle starts at node with value: " + cycleStartNode.val); // Output: 2
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
