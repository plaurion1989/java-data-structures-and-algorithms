package codechallenges.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BinaryTree<T>
{
    public Node <T> root;
    // Can use an ArrayList internally
    ArrayList<T> outputValuesArrayList = new ArrayList<>();

    public Integer maximumValue()
    {
        Integer[] values = (Integer[]) this.preOrderTraversal(root);
        Integer currentMax = Integer.MIN_VALUE;
        ArrayList<Integer> internalValues = new ArrayList<>(Arrays.asList(values));
        for(Integer value : internalValues)
        {
            if( value > currentMax)
            {
                currentMax = value;
            }
        }
        return currentMax;

    }
    public Integer minimumValue()
    {
        Integer[] values = (Integer[]) this.preOrderTraversal(root);
        Integer currentMin = Integer.MAX_VALUE;
        ArrayList<Integer> internalValues = new ArrayList<>(Arrays.asList(values));
        for(Integer value : internalValues)
        {
            if( value < currentMin)
            {
                currentMin = value;
            }
        }
        return currentMin;

    }

    public Object[] preOrderTraversal(Node node)
    {
        // Should return something like "A B C D"
        if(node.equals(null)){throw new InternalError("Node is null");}
        // outputValues = preOrder(root);
        outputValuesArrayList.add((T) node.value);
        if(node.leftNode != null)preOrderTraversal(node.leftNode);
        if(node.rightNode != null)preOrderTraversal(node.rightNode);
        // ArrayList.toArray() returns Object[], hence why Object[] is the return type
        return outputValuesArrayList.toArray();
    }

    public Object[] inOrderTraversal(Node node)
    {
        if(node.equals(null)){throw new InternalError("Node is null");}
        if(node.leftNode != null)inOrderTraversal(node.leftNode);
        // outputValues = inOrder(root);
        outputValuesArrayList.add((T) node.value);
        if(node.rightNode != null)inOrderTraversal(node.rightNode);
        return outputValuesArrayList.toArray();
    }

    public Object[] postOrderTraversal(Node node)
    {
        if(node.equals(null)){throw new InternalError("Node is null");}
        if(node.leftNode != null)postOrderTraversal(node.leftNode);
        if(node.rightNode != null)postOrderTraversal(node.rightNode);
        // outputValues = postOrder(root);
        outputValuesArrayList.add((T) node.value);
        return outputValuesArrayList.toArray();
    }

    public List<T> breadthFirstTraversal(BinaryTree<T> tree)
    {
        if(tree.root == null)
        {
            throw new InternalError("The tree is empty");
        }
        List<Node<T>> visitedNodes = new ArrayList<>();
        List<T> values = new ArrayList<>();
        visitedNodes.add(tree.root);
        while(visitedNodes.size() > 0)
        {
            Node<T> currentNode = visitedNodes.remove(0);
            values.add((T) currentNode.value);
            if(currentNode.leftNode != null)
            {
                visitedNodes.add(currentNode.leftNode);
            }
            if(currentNode.rightNode != null)
            {
                visitedNodes.add(currentNode.rightNode);
            }
        }
        System.out.println("Values: " + values);
        return values;
    }

}