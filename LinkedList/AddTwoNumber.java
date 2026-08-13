package LinkedList;

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int total,carry=0;
        ListNode dummy=new ListNode();
        ListNode res=dummy;
        while(l1!=null ||l2!=null || carry!=0){
            total=carry;
            if(l1!=null){
                total+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                total+=l2.val;
                l2=l2.next;
            }
            int num=total%10;
            carry=total/10;
            dummy.next=new ListNode(num);
            dummy=dummy.next;
        

        }
        return res.next;
    }
}
