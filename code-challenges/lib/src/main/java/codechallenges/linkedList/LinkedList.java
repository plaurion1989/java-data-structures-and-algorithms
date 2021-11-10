package codechallenges.linkedList;

public class LinkedList
{

    Node head = null;

    public void insert(int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public boolean includes(int value)
    {
        Node checkNode = head;
        while(checkNode != null)
        {
            if (checkNode.value == value)
            {
                return true;
            }
            checkNode = checkNode.next;
        }
        return false;
    }

    @Override
    public String toString()
    {
        Node node = this.head;
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

