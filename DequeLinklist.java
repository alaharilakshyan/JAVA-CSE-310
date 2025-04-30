import java.util.*;
import java.util.LinkedList;
public class DequeLinklist {
    public static void main(String[] args) {
        // Create a Deque using LinkedList
        Deque<String> deque = new LinkedList<>();
        System.out.println("\n-----adding elements to deque-----");
        // Add elements to the front and back of the deque
        deque.addFirst("A");
        deque.addLast("B");
        deque.offerFirst("C");
        deque.offerLast("D");
        System.out.println("Deque after adding elements: " + deque);
        System.out.println("\n-----peeking elements from deque-----");
        // Peek at the first and last elements without removing them
        System.out.println("First element (peek): " + deque.peekFirst());
        System.out.println("Last element (peek): " + deque.peekLast());
        System.out.println("\n-----removing elements from deque-----");
        // Remove elements from the front and back of the deque
        System.out.println("Removed first element: " + deque.removeFirst());
        System.out.println("Removed last element: " + deque.removeLast());
        System.out.println("Deque after removing elements: " + deque);
        System.out.println("\n-----polling elements-----");
        // Poll elements from the front and back of the deque
        System.out.println("Polled first element: " + deque.pollFirst());
        System.out.println("Polled last element: " + deque.pollLast());
        System.out.println("Deque after polling elements: " + deque);
        System.out.println("\n-----trying get on empty deque-----");
        // trying getfirst and getlasrt on empty deque
        try {
            System.out.println("First element (get): " + deque.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Deque is empty, cannot get first element: " + e.getMessage());
        }
        try {
            System.out.println("Last element (get): " + deque.getLast());
        } catch (NoSuchElementException e) {
            System.out.println("Deque is empty, cannot get last element: " + e.getMessage());
        }
        System.out.println("\n-----adding elements to deque again-----");
        // Add elements to the front and back of the deque again
        deque.offerFirst("X");
        deque.offerLast("Y");
        deque.addFirst("Z");
        System.out.println("Deque after adding elements again: " + deque);

    }
}