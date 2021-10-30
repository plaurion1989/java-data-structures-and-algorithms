package codechallenges.tree;

public class Node<T>
{
    T value;
    Node<T> leftNode;
    Node<T> rightNode;

    public Node(T value) {
        this.value = value;
    }
}
