package LinkedList;

public class Insertion {
    public ListNode head;
    public ListNode tail;
    public void add(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head =tail = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    public void last(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head =tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }
}
