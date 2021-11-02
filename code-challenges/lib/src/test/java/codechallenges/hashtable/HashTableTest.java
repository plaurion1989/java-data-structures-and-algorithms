package codechallenges.hashtable;
import org.junit.jupiter.api.Test;

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

    }