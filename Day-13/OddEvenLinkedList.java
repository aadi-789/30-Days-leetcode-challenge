

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {

            // Connect odd nodes
            odd.next = even.next;
            odd = odd.next;

            // Connect even nodes
            even.next = odd.next;
            even = even.next;
        }

        // Connect odd list with even list
        odd.next = evenHead;

        return head;
    }
    public static void main(String[] args) {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

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

        ListNode updatedHead = oddEvenLinkedList.oddEvenList(head);

        // Print the updated linked list
        System.out.print("Updated linked list after rearranging odd and even nodes: ");
        while (updatedHead != null) {
            System.out.print(updatedHead.val + " ");
            updatedHead = updatedHead.next;
        }
    }
}
