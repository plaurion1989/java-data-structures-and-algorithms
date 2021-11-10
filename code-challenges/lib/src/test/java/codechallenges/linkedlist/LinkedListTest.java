package codechallenges.linkedlist;
import codechallenges.linkedList.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    LinkedList testList = new LinkedList();

    @Test void linkedListTest()
    {
        testList.insert(1);
        testList.insert(5);
        testList.insert(9);
        if (testList.includes(7))
        {
            System.out.println("WHY!?!?!");
        }
        if (testList.includes(1))
        {
            System.out.println("YES!");
        }

        System.out.println(testList.toString());
    }
    @Test void linkedListTest2()
    {
        testList.insert(1);
        testList.insert(4);
        testList.insert(7);
        // function is currently not placing newNode with new value into the linked list.
        // running in debug mode and can see my logic is stepping into where i want it to, it's just not
        // putting a new node anywhere in the LL.
        testList.append(6);
        testList.insertBefore(1,3);
//        testList.insertAfter(3,2);

        System.out.println(testList.toString());
    }


}
