// Problem
// Merge two sorted linked lists into one sorted linked list.
// Complexity
// Time: O(n + m)
// Space: O(1)

import java.util.*;

public class MergeTwoSortedLists {
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        MergeTwoSortedLists mtl = new MergeTwoSortedLists();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedHead = mtl.mergeTwoLists(list1, list2);

        // Print the merged linked list
        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
