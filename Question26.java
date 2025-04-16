class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
    }
}

public class Question26 {

    public static Node removeNthFromEnd(Node head, int n) {
        // Step 1: Count length
        int length = 0;
        Node curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Step 2: If removing the first node
        if (n == length) {
            return head.next;
        }

        // Step 3: Go to (length - n - 1)th node
        curr = head;
        for (int i = 1; i < length - n; i++) {
            curr = curr.next;
        }

        // Step 4: Remove the node
        curr.next = curr.next.next;

        return head;
    }

    // Print list helper
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2;

        System.out.print("Original List: ");
        printList(head);

        head = removeNthFromEnd(head, n);

        System.out.print("After Removing " + n + "-th node from end: ");
        printList(head);
    }
}
