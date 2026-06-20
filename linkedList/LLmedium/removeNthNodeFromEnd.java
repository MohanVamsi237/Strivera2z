package linkedList.LLmedium;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class SolutionLLLLm9 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (count == n) {
            return head.next;
        }

        int k = count - n - 1;

        ListNode curr = head;
        while (k > 0) {
            curr = curr.next;
            k--;
        }
        curr.next = curr.next.next;

        return head;
    }
}