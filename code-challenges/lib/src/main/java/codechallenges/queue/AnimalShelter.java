package codechallenges.queue;

import codechallenges.linkedList.LinkedList;

import java.util.ArrayList;

public class AnimalShelter<T>
{
    Node<T> front;
    Node<T> back;


    public void enqueue(T animal)
    {
        Node<T> insertNode = new Node<>(animal);
        if(animal.toString().equalsIgnoreCase("dog") || animal.toString().equalsIgnoreCase("cat"))
        {
            if(front == null)
            {
                front = insertNode;
                back = insertNode;
                System.out.println("Added " + insertNode.value + " to the front of the queue");
            }
            else
            {
                back.next = insertNode;
                back = insertNode;
                System.out.println("\n" + "Added " + insertNode.value + " to the back of the queue");
            }
        }
        else
        {
            System.out.println("Unfortunately, we can not admit this species into our shelter");
        }
    }


    public Node<T> dequeue(T pref) {
        Node<T> front = this.front;
        Node<T> back = this.back;

        if (front != null) {
            while (pref.toString().equalsIgnoreCase("dog")) {
                if (front.value.toString().equalsIgnoreCase("dog")) {
                    System.out.println("\n" + "Here is your new " + front.value + ", thank you for visiting our shelter!");
                    this.front = front.next;
                    return front;
                } else if (front.next != null) {
                    front = front.next;
                } else {
                    System.out.println("Sorry, we don't have any " + pref + " available at this time");
                    return null;
                }
            }
            while (pref.toString().equalsIgnoreCase("cat")) {
                if (front.value.toString().equalsIgnoreCase("cat")) {
                    System.out.println("\n" + "Here is your new " + front.value + ", thank you for visiting our shelter!");
                    this.front = front.next;
                    return front;
                } else if (front.next != null) {

                    front = front.next;
                } else {
                    System.out.println("Sorry, we don't have any " + pref + " available at this time");

                    return null;
                }
            }
        }
        System.out.println("Sorry, we don't have any " + pref + " available at this time");
        return null;
    }
}

// I hope this works
