package codechallenges.stack;

public class Stack<T>
{
    Node<T> top;

    void push(T valueToPush)
    {
        Node<T> pushNode = new Node<>(valueToPush);
        // move the old top down
        pushNode.next = top;
        // set new top node
        top = pushNode;
    }

    T pop()
    {
        if(this.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        // let current top fly
        T popped = top.value;
        // pass of top duties to deputy top node
        top = top.next;
        // tell skipper the eagle has left the nest
        return popped;
        // I'm getting tired, "dad" humor is keeping me motivated
    }

    T peek()
    {
       return top.value;
    }

    boolean isEmpty()
    {
        if(top == null)
        {
            return true;
        }
        return false;
    }
}
