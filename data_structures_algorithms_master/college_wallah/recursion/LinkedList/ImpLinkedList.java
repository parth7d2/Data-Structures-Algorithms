package data_structures_algorithms_master.college_wallah.recursion.LinkedList;

public class ImpLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        private Node head = null;
        private Node tail = null;
        private long len = 0l;

        public void insert(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            len++;
        }

        public void insertAtHead(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            len++;
        }

        public void insertAt(int pos, int data){
            Node temp = new Node(data);
            Node point = head;
            if(pos == 0 || head == null){
                insertAtHead(data);
            }else if(pos == len){
                insert(data);
            }else {
                int count = 1;
                while (point!=null){
                    if(pos == count){
                       temp.next = point.next;
                       point.next = temp;
                       len++;
                    }
                    count++;
                    point = point.next;
                }
            }
        }

        long size() {
            return len;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtHead(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(6);
        ll.display();
        System.out.println(ll.size());
        ll.insert(7);
        ll.display();
        ll.insertAtHead(0);
        ll.display();
        System.out.println(ll.size());
        ll.insertAt(7, 5);
        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.tail.data);

    }
}
