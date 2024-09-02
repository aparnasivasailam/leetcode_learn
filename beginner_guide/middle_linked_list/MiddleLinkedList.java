package beginner_guide.middle_linked_list;

import java.util.Scanner;
class Node {
    int val;
    Node next;
    Node() { }
    Node(int val) { 
        this.val = val;
    }
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class MiddleLinkedList {
    public static void main(String[] args) {
        Node head = fetchInput();
        Node middle = getMiddleNode(head);
        printFromMiddleNode(middle);
    }

    public static Node fetchInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        Node element = null;
        
        for(int i = n-1; i >= 0; i--) {
            element = new Node(array[i], element);
        }
        return element;
    }

    public static void printFromMiddleNode(Node middle) {
        while(middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
        System.out.println();
    }

    public static Node getMiddleNode(Node head) {
        Node end = head, middle = head;
        while(end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }
}
