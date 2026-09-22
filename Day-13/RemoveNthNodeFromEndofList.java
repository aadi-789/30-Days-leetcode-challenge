

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both until fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }
    public static void main(String[] args) {
        RemoveNthNodeFromEndofList removeNthNodeFromEndofList = new RemoveNthNodeFromEndofList();

        // Create a linked list for testing
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        int n = 2; // Remove the 2nd node from the end
        ListNode updatedHead = removeNthNodeFromEndofList.removeNthFromEnd(head, n);

        // Print the updated linked list
        System.out.print("Updated linked list after removing " + n + "th node from the end: ");
        while (updatedHead != null) {
            System.out.print(updatedHead.val + " ");
            updatedHead = updatedHead.next;
        }
    }
}
