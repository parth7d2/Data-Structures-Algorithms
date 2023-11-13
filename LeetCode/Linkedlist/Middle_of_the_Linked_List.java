package LeetCode.Linkedlist;


public class Middle_of_the_Linked_List {
    public static void main(String[] args) {
        ListNode a = new ListNode(5);
//        System.out.println(a.next);

        System.out.println(middleNode(a).val);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static int display(ListNode node) {
        ListNode temp = node;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len/2;
    }

    public static ListNode middleNode(ListNode head) {
        int len = display(head);
        int i = 0;
        ListNode ans = null;
        while (head != null) {
            if(i >= len ){
                return head;
            }
            head = head.next;
            i++;
        }
        return ans;
    }
}
