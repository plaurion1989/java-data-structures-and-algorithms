package codechallenges.linkedList;

import java.security.InvalidParameterException;

public class LinkedList<T>
{

    Node<T> head = null;

    public void insert(T v)
    {
        Node<T> newNode = new Node<>(v);
        newNode.next = head;
        head = newNode;
    }
    public boolean includes(T v)
    {
        Node currentNode = head;
        while(currentNode != null)
        {
            if (currentNode.value.equals(v))
            {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void append(T v) {
        // give newNode input value V
        Node<T> newNode = new Node<>(v);
        // make sure newNode does not have assigned next node.
        newNode.next = null;
        // check if we are adding to an empty LL
        if (this.head == null) {
            // if we are, set this newNode as the new head of empty LL
            this.head = newNode;
            // if LL is not empty
        } else {
            // establish a variable of type Node that is the head of LL
            Node<T> currentNode = this.head;
            // make sure there are other nodes in the LL
            while (currentNode.next != null) {
                //if there are, then we will keep moving through the LL until next
                // is null, then the loop breaks while currentNode is the last node
                // in the LL.
                currentNode = currentNode.next;
            }
            // once we have reached the last node in the LL, we will append the new
            // node with the value V to the LL
            currentNode.next = newNode;
        }
    }

    public void insertBefore(T searchV, T insertV)
    {
        // set local variable of type Node to have value of insertV
        Node<T> newNode = new Node<>(insertV);
        // set local variable of type Node to LL head
        Node<T> currentNode = this.head;
        // we traverse through the LL
        while (currentNode.next != null) {
            // we check to see of the input value is the same as node value in LL
            if (currentNode.value.equals(searchV)) {
                // if it is, then set newNode before
                newNode.next = currentNode;
            }
            // if not then we keep going
            else {
                currentNode.next = currentNode;
            }
            // if nothing is found, then nothing happens.
        }
    }


    public void insertAfter (T searchV, T insertV)
    {
        // set local variable of type Node to have value of insertV
        Node<T> newNode = new Node<>(insertV);
        // set local variable of type Node to LL head
        Node<T> currentNode = this.head;
        // we traverse through the LL
        while (currentNode.next != null)
        {
            // we check to see of the input value is the same as node value in LL
            if (currentNode.value == searchV)
            {
                // we set the newNode in the LL after
                currentNode.next = newNode;
            }
            // if not then we keep going
            else
            {
                currentNode = currentNode.next;
            }
            // if nothing is found, then nothing happens.
        }
    }

    public void kthFromEnd(int k)
    {
        //writing based on 0 indexing since was not specified in instructions.
        Node<T> A = this.head;
        Node<T> B = this.head;
        // should give B pointer starting position of k in linked list
        if (B != null)
        {
            for(int i = 0; i<= k; i++)
            {
                if(B.next != null)
                {
                    B = B.next;
                }
            }
            //will not run if int k forces B to null before B traverses a node in LL k times
        }
        // start traversing the list until B.next is null.  node A will be kthFromEnd node.
        while(B != null)
        {
            if(A.next != null)
            {
                A = A.next;
                B = B.next;
            }
        }
        System.out.println(A.value);
    }

    public static LinkedList zipLists(LinkedList inputList, LinkedList inputList2)
    {
        Node A = inputList.head;
        Node B = inputList2.head;
        LinkedList mergedList = new LinkedList<>();
        // want to merge only nodes with values initially
        while(A != null && B != null)
        {
            // want to merge both list's together evenly at first
            if(A != null || B != null)
            {
                mergedList.append(A.value);
                mergedList.append(B.value);
                A = A.next;
                B = B.next;
            }
        }
        // in the case that inputList is longer than inputList2
        while (A != null)
        {
            mergedList.append(A.value);
            A = A.next;
        }
        // in the case that inputList2 is longer than inputList
        while (B != null)
        {
            mergedList.append(B.value);
            B = B.next;
        }

        return mergedList;
    }

    @Override
    public String toString()
    {
        Node<T> node = this.head;
        String string = "";
        while(node != null)
        {
            string = string + "{ " +node.value+ " } -> ";
            node = node.next;
        }
        string =  string + "is NULL";
        return string;
    }
}

