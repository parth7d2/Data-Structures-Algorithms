package LeetCode.Linkedlist;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(8);

        a.next = b;

        ListNode a1 = new ListNode(1);


        ListNode ans = addTwoNumbers(a, a1);
        display(ans);

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

    public static void display(ListNode temp){
        while (temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        int s = 0;
        int f = 0;
        boolean ten = false;
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val;
            if(f!=0){
                sum+=f;
                f=0;
            }
            if(sum>=10){
                s = sum%10;
                f = sum/10;
                ten = true;
            }
            if(ten){
                ListNode sumL = new ListNode(s);
                ans.next = sumL;
                ans = sumL;
            }else {
                ListNode sumL = new ListNode(sum);
                ans.next = sumL;
                ans = sumL;
            }

            l1 = l1.next;
            l2 = l2.next;
            ten = false;

        }
        while (l1!=null){
            int sum = l1.val ;
            if(f!=0){
                sum+=f;
                f=0;
            }
            if(sum>=10){
                s = sum%10;
                f = sum/10;
                ten = true;
            }
            if(ten){
                ListNode sumL = new ListNode(s);
                ans.next = sumL;
                ans = sumL;
                l1 = l1.next;
                ten = false;
            }else {
                ListNode sumL = new ListNode(sum);
                ans.next = sumL;
                ans = sumL;
                l1 = l1.next;
            }
        }
        while (l2!=null){
            int sum = l2.val ;
            if(f!=0){
                sum+=f;
                f=0;

            }
            if(sum>=10){
                s = sum%10;
                f = sum/10;
                ten = true;

            }
            if(ten){
                ListNode sumL = new ListNode(s);
                ans.next = sumL;
                ans = sumL;
                l2 = l2.next;
                ten = false;
            }else {
                ListNode sumL = new ListNode(sum);
                ans.next = sumL;
                ans = sumL;
                l2 = l2.next;
            }
        }

        if(f!=0){
            ListNode sumL = new ListNode(f);
            ans.next = sumL;
            ans = sumL;
        }

        return head.next;
    }
}
