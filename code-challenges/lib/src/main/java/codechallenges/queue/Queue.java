package codechallenges.queue;

public class Queue<T>
{
    Node<T> front;
    Node<T> back;

    public void enqueue(T valueToEnqueue)
    {
        Node<T> insertNode = new Node<>(valueToEnqueue);
        if(this.isEmpty())
        {
            this.front = insertNode;
            this.back = insertNode;
            System.out.println("Added " + insertNode.value + " to the front of the queue");
        }
        else
        {
            this.back.next = insertNode;
            this.back = insertNode;
            System.out.println("\n" + "Added " + insertNode.value + " to the back of the queue");
        }

    }

    public Node<T> dequeue()
    {
        Node<T> front = this.front;
        if(this.isEmpty())
        {
            System.out.println("Queue is empty");
        }
        this.front = front.next;
        System.out.println("\n" + "Removed " + front.value + " from queue! " + "\n" + front.next.value + " is now the first in queue!");
        return front;
    }

    public T peek()
    {
        return front.value;
    }

    boolean isEmpty()
    {
        if(this.front == null)
        {
            return true;
        }
        return false;
    }
}

