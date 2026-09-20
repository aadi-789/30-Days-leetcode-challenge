// Problem:-
// Remove duplicate values from a sorted linked list so that each value appears only once.
//complexity
// Time: O(n)
// Space: O(1)


public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while (curr != null && curr.next != null) {

            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedList rdsl = new RemoveDuplicatesfromSortedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode uniqueHead = rdsl.deleteDuplicates(head);

        // Print the linked list after removing duplicates
        ListNode current = uniqueHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
