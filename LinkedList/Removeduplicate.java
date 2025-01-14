public class Removeduplicate {
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node duplicate(Node head) {
        if (head == null || head.next == null) {
            return head; // Return as is if the list is empty or has one node
        }

        Node newHead = null; // Head of the new list
        Node newTail = null; // Tail of the new list
        Node temp = head;

        while (temp != null) {
            // Check if the current node is unique
            if (temp.next == null || temp.data != temp.next.data) {
                Node node = new Node(temp.data); // Create a new node
                if (newHead == null) {
                    newHead = node; // Initialize newHead
                    newTail = node; // Initialize newTail
                } else {
                    newTail.next = node; // Append to the new list
                    newTail = node; // Update the tail
                }
            }
            temp = temp.next; // Move to the next node
        }

        return newHead;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(4);
        Node g = new Node(4);
        Node h = new Node(5);
        Node i = new Node(6);
        Node j = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        System.out.println("Original List:");
        print(a);

        Node result = duplicate(a);
        System.out.println("List After Removing Duplicates:");
        print(result);
    }
}
