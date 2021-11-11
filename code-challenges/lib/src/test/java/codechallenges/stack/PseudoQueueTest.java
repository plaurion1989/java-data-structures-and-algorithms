package codechallenges.stack;
import org.junit.jupiter.api.Test;

public class PseudoQueueTest
{
    @Test void pseudoQueueTest1()
    {
        PseudoQueue testQueue = new PseudoQueue();

        testQueue.enqueue("please work");
        testQueue.enqueue(1);
        testQueue.enqueue("wow");
        testQueue.enqueue(2);
        testQueue.enqueue("got lucky");

        System.out.println("\"" + testQueue.dequeue() + "\"" + " was removed from Pseudo Queue");
    }
}
