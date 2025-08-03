package LinkedList;


class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class intersectionOfLL {
    public static Node getIntersectionNode(Node headA, Node headB) {
        int lenA = getLength(headA), lenB = getLength(headB);
        
        // Move the pointer of the longer list
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Traverse both lists to find the intersection point
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA; // Intersection node OR null if no intersection
    }

    private static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}