public class EvenOdd {
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node evenodd(Node head) {
        if (head == null) {
            return null;
        }

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                // Even node
                if (evenHead == null) {
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            } else {
                // Odd node
                if (oddHead == null) {
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }
            temp = temp.next;
        }

        // Combine even and odd lists
        if (evenTail != null) {
            evenTail.next = oddHead;
        }
        if (oddTail != null) {
            oddTail.next = null;
        }

        return (evenHead != null) ? evenHead : oddHead;
    }

    public static void main(String[] args) {
        // Creating the linked list
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        Node ans = evenodd(a);

        print(ans);
    }
}
