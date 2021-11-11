package codechallenges.stack;

public class PseudoQueue <T>
{
    Stack<T> stack1 = new Stack<>(); // will be assisting order of stack2(FILO) to act like a queue(FIFO)
    Stack<T> stack2 = new Stack<>(); // will be used as a queue(FIFO instead of FILO)


    public void enqueue (T value)
    {

        // for the first object in the pseudo queue
        if(stack2.peek() == null)
        {
            stack2.push(value);
        }
        // for all other objects in the pseudo queue
        else
        {
            //pop all of stack2 into stack1 for reverse ordering...
            while(stack2.peek() != null)
            {
                T fifoValue = stack2.pop();
                stack1.push(fifoValue);
            }
            // push the incoming value into stack2 for a FIFO scenario
            stack2.push(value);
            // pop the reverse ordered stack1(FILO) into stack2 to maintain FIFO perception.
            while (stack1.peek() != null)
            {
                T filoValue = stack1.pop();
                stack2.push(filoValue);
            }
        }

    }

    public T dequeue()
    {
        Object peek2 = stack2.peek();
        if(peek2.equals(null))
        {
            System.out.println("Nothing in this Pseudo Queue");
            return null;
        }
//        T fifoValue = stack2.pop();
        return stack2.pop();
    }
}
