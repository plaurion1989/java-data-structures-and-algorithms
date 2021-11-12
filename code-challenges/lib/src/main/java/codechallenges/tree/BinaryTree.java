package codechallenges.tree;

import java.util.ArrayList;


public class BinaryTree<T>
{
    Node <T> root;
    // Can use an ArrayList internally
    ArrayList<T> outputValuesArrayList = new ArrayList<>();

    public Object[] preOrderTraversal(Node node)
    {
        // Should return something like "A B C D"
        if(node.equals(null)){throw new IllegalArgumentException("Node is null");}
        // outputValues = preOrder(root);
        outputValuesArrayList.add((T) node.value);
        if(node.leftNode != null)preOrderTraversal(node.leftNode);
        if(node.rightNode != null)preOrderTraversal(node.rightNode);
        // ArrayList.toArray() returns Object[], hence why Object[] is the return type
        return outputValuesArrayList.toArray();
    }

    public Object[] inOrderTraversal(Node node)
    {
        if(node.equals(null)){throw new IllegalArgumentException("Node is null");}
        if(node.leftNode != null)inOrderTraversal(node.leftNode);
        // outputValues = inOrder(root);
        outputValuesArrayList.add((T) node.value);
        if(node.rightNode != null)inOrderTraversal(node.rightNode);
        return outputValuesArrayList.toArray();
    }

    public Object[] postOrderTraversal(Node node)
    {
        if(node.equals(null)){throw new IllegalArgumentException("Node is null");}
        if(node.leftNode != null)postOrderTraversal(node.leftNode);
        if(node.rightNode != null)postOrderTraversal(node.rightNode);
        // outputValues = postOrder(root);
        outputValuesArrayList.add((T) node.value);
        return outputValuesArrayList.toArray();
    }
}