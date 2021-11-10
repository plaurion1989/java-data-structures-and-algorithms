package codechallenges.hashtable;
import org.junit.jupiter.api.Test;
import static codechallenges.hashtable.HashTable.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashTableTest {

        @Test
        void Test_hash_map()
        {
            HashTable<Integer, String> sut = new HashTable<>(5);
            sut.add(1,"patrick");
            System.out.println("Pre Collision: " + sut.get(1));
            sut.add(2,"matt");
            sut.add(3,"jenner");
            sut.add(4,"haustin");
            sut.add(5,"ed");
            assert(sut.contains(5));
            System.out.println("Result: " + sut.get(5) + ", just testing if this actually gets printed");

            sut.contains(4);
            if (sut.contains(12)){
                System.out.println("my hashmap is clearly not doing it's job");
            } else System.out.println("my hashmap is doing fine");//pull something out that is there

                //pull something that isn't in there
            sut.add(1,"barney");//test collision
            System.out.println("Post Collision: " + sut.get(1));



            // test several collisions
            // duplication test
            // collision without same key.
            // map has 10, 1 is key value is patrick
            // int(s) (as key) hash to their own int value!!!
        }
         @Test
            void repeatedWordTest()
            {
                String sentence1 = "i am testing to see if i can find i as the repeated word";
                String sentence2 = "This test will Ensure that my Method will Test all strings properly, returning tEst";
                String sentence3 = "how much wood can a woodchuck chuck, if a woodchuck could chuck wood should return A";

                String test1 = repeatedWord(sentence1);
                repeatedWord(sentence2);
                repeatedWord(sentence3);

                assertEquals("i", test1);
            }

    }