package LinkedList;

public class Appmain {
    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        insertion.add(10);
        insertion.add(20);
        insertion.add(30);
        insertion.last(40);
        insertion.last(50);
        insertion.last(60);
        ListNode current = insertion.head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
