package codechallenges.stack;

public class Stack<T>
{
    Node<T> top;

    void push(T valueToPush)
    {
        // TODO: implement me
    }

    T pop()
    {
        // TODO: implement me
        return null;
    }

    T peek()
    {
       return top.value;
    }

    boolean isEmpty()
    {
        if(this.top == null)
        {
            return true;
        }
        return false;
    }
}
