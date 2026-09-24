

public class CopyListwithRandomPointer {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();

        // Step 1: Create a copy of every node
        Node current = head;

        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }

        // Step 2: Connect next and random pointers
        current = head;

        while (current != null) {

            Node copy = map.get(current);

            copy.next = map.get(current.next);
            copy.random = map.get(current.random);

            current = current.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {
        CopyListwithRandomPointer copyList = new CopyListwithRandomPointer();

        Node head = new Node(1);
        head.next = new Node(2);
        head.random = head.next;
        head.next.random = head;

        Node copiedList = copyList.copyRandomList(head);

        // Print the copied list
        Node current = copiedList;
        while (current != null) {
            System.out.print("Node value: " + current.val);
            if (current.random != null) {
                System.out.print(", Random points to: " + current.random.val);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            current = current.next;
        }
    }
}
