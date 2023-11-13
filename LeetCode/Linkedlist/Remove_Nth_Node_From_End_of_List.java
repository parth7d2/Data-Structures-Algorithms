package LeetCode.Linkedlist;

public class Remove_Nth_Node_From_End_of_List {
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


        ListNode ans = removeNthFromEnd(a, 2);
        display(ans);

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode() {
        }

    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;

        for(int i = 1; i <= n; ++i)
            fast = fast.next;

        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }

    public static int length(ListNode temp){
        int count = 1;
        while (temp.next!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void display(ListNode temp){
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}
