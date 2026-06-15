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


class SolutionLLD2 {
    public ListNode insertBeforeHead(ListNode head, int data) {
        ListNode first=new ListNode(data);
        first.next=head;
        first.prev=null;

        if(head!=null){
            head.prev=first;
        }

        return first;
    }
}