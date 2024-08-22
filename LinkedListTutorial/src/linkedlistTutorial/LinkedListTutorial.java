/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistTutorial;

/**
 *
 * @author 2004
 */
public class LinkedListTutorial {
    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Iniliazing linked list
   public LinkedListTutorial(String Nerit, String Boas, String Angra, String Angopa) {
    head = new Node(Nerit); // The head node
    head.next = new Node(Boas); // The second node
    head.next.next = new Node(Angra); // The third node
    head.next.next.next = new Node(Angopa); // The fourth node
}


    // To find a node containing the specified item
    public Node find(String item) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(item)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // To print the data in the linked list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // To delete the last node from the linked list
    public Node deleteLast() {
        if (head == null) {
            return null; // Empty list
        }
        if (head.next == null) {
            Node removed = head;
            head = null; // Only one node in the list
            return removed;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Node removed = current.next;
        current.next = null;
        return null; // We can return the removed node, but to follow the method specification, we return null
    }
// Other methods like insert, can be added as well, if needed

    public static void main(String[] args) {
        LinkedListTutorial list = new LinkedListTutorial("Nerit","Boas", "Angra","Angopa");
        list.print(); // Output: Nerit, Boas, Angra, Angopa
        
        Node foundNode = list.find("Angra");
        if (foundNode != null) {
            System.out.println("Found: " + foundNode.data); // Output: Found: Angra
        }
        

        Node removedNode = list.deleteLast();
        if (removedNode != null) {
            System.out.println("Removed: " + removedNode.data); // Output: Removed: Angopa, but we returned null as specified
        }
        
        list.print(); // Output: Nerit, Boas, Angra
    }
} 