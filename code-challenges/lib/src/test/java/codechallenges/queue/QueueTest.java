package codechallenges.queue;
import org.junit.jupiter.api.Test;

public class QueueTest
{
    @Test void queueTestOne()
    {
        Queue testQueue = new Queue();
        testQueue.enqueue("snickers");
        testQueue.enqueue("butterfingers");
        testQueue.enqueue("oreo");
        testQueue.enqueue(1);

        testQueue.dequeue();
        testQueue.dequeue();

        System.out.println("\n" + testQueue.peek() + " is still first in queue.");
    }
}
