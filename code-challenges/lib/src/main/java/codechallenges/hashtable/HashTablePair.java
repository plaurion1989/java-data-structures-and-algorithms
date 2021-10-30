package codechallenges.hashtable;

import java.util.AbstractMap;

public class HashTablePair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<HashTablePair<K, V>>
{
    public HashTablePair(K key, V value)
    {
        super(key,value);
    }

    @Override
    public int compareTo(HashTablePair<K, V> o) {
        throw new UnsupportedOperationException("HashTablePair doesn't support comparison!");
    }
}