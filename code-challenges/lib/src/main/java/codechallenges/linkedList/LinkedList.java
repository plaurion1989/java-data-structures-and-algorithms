package codechallenges.linkedList;

public class LinkedList
{
    Node head = null;
    //Node tail = null;

    public void insert(int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public boolean includes(int value)
    {
        Node newNode = head;
        if(head == null) return false;
        while(head != null)
        {
            if (newNode.value != value) {

            }
        }

    }

    @Override
    public String toString()
    {
        Node newNode = head;
        String stringValue = "";
        while(true) {
            if(newNode == null) {
                stringValue += "NULL";
                return stringValue;
            } else {
                stringValue += "{ " +newNode.value+ " } -> ";
                newNode = newNode.next;
            }
        }
    }
}
