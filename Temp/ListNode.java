class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {
    val = 0;
    next = null;
  }

  public ListNode(int val) {
    this.val = val;
    this.next = null;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

}

class Temp {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode ptr = headA;

    while (headB != null) {
      while (ptr != null) {
        if (headB == ptr) {
          return headB;
        }
        ptr = ptr.next;
      }
      headB = headB.next;
      ptr = headA;
    }

    return null;
  }

  public void printNodes(ListNode head) {
    while (head != null) {
      System.out.println(head.val + " ");
      head = head.next;
    }
  }

  public static void main(String args[]) {
    ListNode head1 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
    ListNode head2 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));

    ListNode result = new Temp().getIntersectionNode(head1, head2);

    new Temp().printNodes(result);

  }
}