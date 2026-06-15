package linkedList.DLL;
class ListNode{
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}


class SolutionLLD4 {
    public ListNode reverseDLL(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode temp=null;
        ListNode curr=head;

        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;

            curr=curr.prev;
        }

        return temp.prev;
    }
}
