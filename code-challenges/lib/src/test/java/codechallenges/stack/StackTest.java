package codechallenges.stack;
import org.junit.jupiter.api.Test;

public class StackTest
{
    @Test void stackTest1()
    {
        Stack testStack = new Stack();

        System.out.println("\n" + testStack.isEmpty());

        testStack.push("test1");
        testStack.push(1);
        testStack.push("test2");
        testStack.push(2);

        System.out.println("\n" + testStack.peek());
        System.out.println("\n" + testStack.isEmpty());

        testStack.pop();
        System.out.println("\n" + testStack.peek());
        testStack.pop();
        System.out.println("\n" + testStack.peek());
        testStack.pop();
        System.out.println("\n" + testStack.peek());
        testStack.pop();
        System.out.println("\n" + testStack.isEmpty());
        System.out.println("\n" + testStack.peek());
    }
}
