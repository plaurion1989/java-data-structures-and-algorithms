package codechallenges.linkedlist;
import codechallenges.linkedList.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test void linkedListTest(){
        LinkedList testList = new LinkedList();
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


}
