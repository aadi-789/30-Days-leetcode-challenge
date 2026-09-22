;

public class MiddleoftheLinkedList {
     public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        MiddleoftheLinkedList middleoftheLinkedList = new MiddleoftheLinkedList();

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

        ListNode middleNode = middleoftheLinkedList.middleNode(head);
        System.out.println("The middle node has value: " + middleNode.val); // Output: 3
    }
}
