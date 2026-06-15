package linkedList.DLL;
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode() {
    }
    public ListNode(int data) {
    }
    public ListNode(int data, ListNode prev, ListNode next) {
    }
};


class SolutionLLD3 {
    public ListNode deleteHead(ListNode head) {
        if(head.next==null){
            return null;
        }
        head=head.next;
        head.prev=null;

        return head;
    }
}
