package linkedList.LLmedium;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

class SolutionLLLLm6 {
    public int findLengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                int length = 1;
                ListNode temp = slow.next;

                while(temp != slow){
                    length++;
                    temp = temp.next;
                }

                return length;
            }
        }

        return 0;
    }
}