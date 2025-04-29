public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;
        ListNode ptr = head, prev = head.next;
        head = head.next;
        ptr.next = null;

        while(head != null) {
            head = head.next;
            prev.next = ptr;
            ptr = prev;
            prev = head;
        }

        return ptr;
    }
}
