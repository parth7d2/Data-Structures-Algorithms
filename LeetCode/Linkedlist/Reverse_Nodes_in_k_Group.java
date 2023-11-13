package LeetCode.Linkedlist;

public class Reverse_Nodes_in_k_Group {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void display(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
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

        ListNode ans = reverseKGroup(a, 3);
        display(ans);

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head == null || head.next == null){
            return head;
        }

        int i  = 0;
        ListNode n = head;
        while (i<k-1){
            i++;
            n = n.next;
            if(n == null){
                return head;
            }
        }

        ListNode prev = null;
        ListNode crnt = head;
        ListNode next = null;
        int count = 0;


        while (crnt != null && count < k){
            next = crnt.next;
            crnt.next = prev;
            prev = crnt;
            crnt = next;
            count++;
        }

        if(next!=null) {
            head.next = reverseKGroup(next, k);
        }
        return prev;
    }

    public static void reverseList(ListNode start, int k){

    }


}
