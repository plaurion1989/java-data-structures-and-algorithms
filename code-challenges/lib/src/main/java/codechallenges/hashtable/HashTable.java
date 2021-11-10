package codechallenges.hashtable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;


public class HashTable<K, V> {

        ArrayList<LinkedList<HashTablePair<K,V>>> bucketArrayList;  // using ArrayList instead of array so we can instantiate with a generic parameterized type
        int size;

        public HashTable(int size)
        {
            if (size < 1)
            {
                throw new IllegalArgumentException("HashMap must have a size of 1 or greater!");
            }

            this.size = size;
            this.bucketArrayList = new ArrayList<>(size);
            for (int i = 0; i < this.size; i++)
            {
                bucketArrayList.add(i, new LinkedList<>());
            }
        }

        // WARNING: adding duplicate keys won't work properly in this hash map!
        public void add(K key, V value)
        {  //based on Haustins code from code review
            int hashedKey = hash(key);
            LinkedList<HashTablePair<K,V>> addingKey = bucketArrayList.get(hashedKey);
            addingKey.add(new HashTablePair<>(key, value));
        }

        public V get(K key)
        {   //based on Haustins code from code review
            int hashedKey = hash(key);
            LinkedList<HashTablePair<K,V>> bucket = bucketArrayList.get(hashedKey);
            for (HashTablePair<K,V> keyName : bucket) {
                if(keyName.getKey().equals(key)) {
                    return keyName.getValue();
                }
            }
            return null;
        }

        public boolean contains(K key)
        {  //based on Haustins code from code review
            int hashedKey = hash(key);
            LinkedList<HashTablePair<K,V>> bucket = bucketArrayList.get(hashedKey);
            for (HashTablePair<K,V> keyName : bucket) {
                if(keyName.getKey().equals(key)) {
                    return true;
                }
            }
            return false;
        }


        public static String repeatedWord(String words)
        {
            String[] checkArray = words.replaceAll("[^a-zA-Z]", "").toLowerCase().split(" ");
            HashTable<String ,Integer> repeatWords = new HashTable<>(checkArray.length);
            for(String check : checkArray)
            {
                if(repeatWords.get(check) == null)
                {
                    repeatWords.add(check,1);
                }else
                {
                    return check;
                }
            }
            return null;
        }


    // Sometimes hashCode can be negative in Java, hence the abs()
        // If you really want to implement your own hashing, look at https://stackoverflow.com/a/113600/16889809
        // Don't use Character in here! Don't use Object()! Don't use any object you made that does not have hashCode() and equals() overridden
        // If you do, things that should collide, won't
        // Protip: Testing collisions is easy with Integer, because it hashes to its value
        public int hash(K key)
        {
            return Math.abs(key.hashCode() % size);
        }
}
