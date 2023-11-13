package LeetCode.Linkedlist;

import data_structures_algorithms_master.college_wallah.recursion.LinkedList.basicsII;

public class Rotate_List {
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

        ListNode ans = rotateRight(a, 2000000000);
        display(ans);
    }
    public static void display(ListNode temp){
        while (temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
    }
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
    public static ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null|| head.next == null){
            return head;
        }

        int len = len(head);
        if(k>len){
            k = k%len;
        }
        for(int i = 0; i<k; i++){
            ListNode tempHead = head;
            while (tempHead.next.next!= null){
                tempHead = tempHead.next;
            }
            ListNode temp = new ListNode(tempHead.next.val);
            temp.next = head;
            head = temp;
            tempHead.next = null;
        }

        return head;
//        return helper(head, k, 0);

    }

    public static int len(ListNode temp){
        int len = 0;
        while (temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }

    private static ListNode helper(ListNode head, int k, int n) {
        if(n>=k){
            return head;
        }
        ListNode tempHead = head;
        while (tempHead.next.next!= null){
            tempHead = tempHead.next;

        }
        ListNode temp = new ListNode(tempHead.next.val);
        temp.next = head;
        head = temp;
        tempHead.next = null;
        return helper(head, k, n+=1);
    }
}
