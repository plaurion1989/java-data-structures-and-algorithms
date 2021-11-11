package codechallenges.linkedlist;
import codechallenges.linkedList.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {


    @Test void linkedListTest()
    {
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
    @Test void linkedListTest2()
    {
        LinkedList testList = new LinkedList();
        //test first if statement
        testList.insert(1);
        //test the other cases
        testList.insert(4);
        testList.insert(7);
        // function is currently not placing newNode with new value into the linked list.
        // running in debug mode and can see my logic is stepping into where i want it to, it's just not
        // putting a new node anywhere in the LL.
//        testList.append(6);
//        testList.insertBefore(1,3);
        testList.insertAfter(3,2);

//        System.out.println(testList.toString());
    }
    @Test void linkedListTest3()
    {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert("butterfingers");
        testList.insert(5);
        LinkedList testList2 = new LinkedList();
        testList2.insert(1);

        testList.kthFromEnd(2);
        testList.kthFromEnd(3);
        testList.kthFromEnd(6); // looks like I need to make a few adjustments to handle int k being bigger than
                                    // size of the LL.
//        testList.kthFromEnd(-2); // test's lock up in potentially infinite loop?
//        testList2.kthFromEnd(0); // test's lock up in potentially infinite loop?

    }
    @Test void linkedListTest4()
    {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        testList.insert(5);
        testList.insert(6);
        LinkedList testList2 = new LinkedList();
        testList2.insert("butterfingers");
        testList2.insert("nutterbutters");
        testList2.insert("snickers");
        testList2.insert("oreos");

        LinkedList zipListTest = LinkedList.zipLists(testList, testList2);
        String results = zipListTest.toString();
        System.out.println(results);
// put these dashes below so that I could read output in debugger
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }

}
