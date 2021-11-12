package codechallenges.tree;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T>
{
    public Node<T> add(T value, Node<T> currentNode)
    {
        Node<T> nodeToAdd = new Node<>(value);
        if(this.root == null) {
            this.root = nodeToAdd;
            return nodeToAdd;
        }
        // if nodeToAdd.value > currentNode.value then we traverse to the right until nodeToAdd.value !> currentNode.value
        if(nodeToAdd.value.compareTo(currentNode.value) > 0)
        {
            if(currentNode.rightNode != null)
            {
                 this.add(value, currentNode.rightNode);
            }
            else
            {
                currentNode.rightNode = nodeToAdd;
            }

        }
        // if nodeToAdd.value < currentNode.value then we traverse to the right until nodeToAdd.value !< currentNode.value
        if(nodeToAdd.value.compareTo(currentNode.value) < 0)
        {
            if(currentNode.leftNode != null)
            {
                this.add(value, currentNode.leftNode);
            }
            else
            {
                currentNode.leftNode = nodeToAdd;
            }

        }
        //redundant but necessary I think.
        return nodeToAdd;
    }

    public boolean contains (T value, Node<T> currentNode)
    {
        // if value > currentNode.value then we traverse to the right until value !> currentNode.value
        if(value.compareTo(currentNode.value) > 0)
        {
           return this.contains(value, currentNode.rightNode);
        }
        // if value < currentNode.value then we traverse to the right until value !< currentNode.value
        if(value.compareTo(currentNode.value) < 0)
        {
           return this.contains(value, currentNode.leftNode);
        }
        // if root.value == value && currentNode.value == value
        if(value.compareTo(currentNode.value) == 0)
        {
            return true;
        }

        return false;
    }
}
