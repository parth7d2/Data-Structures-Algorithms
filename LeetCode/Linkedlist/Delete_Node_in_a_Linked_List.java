package LeetCode.Linkedlist;

import org.w3c.dom.Node;

public class Delete_Node_in_a_Linked_List {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void display(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void deleteNode(ListNode node) {
        if (node.next == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }


//    public class ListNode{
//        int val;
//        ListNode next;
//
//        ListNode(int val){
//            this.val = val;
//        }
//    }
//
//    public class insetNode{
//        private ListNode start = null;
//        private ListNode end = null;
//        private long len = 0l;
//
//        public insetNode(int data){
//            ListNode temp = new ListNode(data);
//            if(start == null){
//                start = temp;
//                end = temp;
//            }else {
//                end.next = temp;
//                end = temp;
//            }
//            len++;
//        }
//
//        void display(){
//            ListNode temp = start;
//            while (temp != null){
//                System.out.print(temp.val + " ");
//                temp = temp.next;
//            }
//        }
//
//        public void deleteNode(ListNode node) {
//            ListNode temp = null;
//            while (temp != null){
//                if(temp.val != node.val){
//                    insetNode(temp.val)
//                }
//            }
//        }
//
//    }
//
//    public void deleteNode(ListNode node) {
//
//    }
}
