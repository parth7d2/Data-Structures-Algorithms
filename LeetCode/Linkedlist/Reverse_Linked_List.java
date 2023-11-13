package data_structures_algorithms_master.college_wallah.recursion.LinkedList;


public class Reverse_Linked_List {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode head = reverseList(a);
        display(head);

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void display(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        return healper(head);
    }

    private static ListNode healper(ListNode head) {
        if(head == null ||head.next == null){
            return head;
        }
        ListNode ans = healper(head.next);
        head.next.next = head;
        head.next = null;
        return ans;
    }

}
