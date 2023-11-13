package data_structures_algorithms_master.college_wallah.recursion.LinkedList;

public class basicsII {

    public static void displayRec(Node head){
        if(head == null){
            return;
        }
        displayRec(head.next);
        System.out.print(head.data + " ");

    }

    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int length(Node temp){
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
//        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        System.out.println(b.data);
//        System.out.println(a.next.data);

//        Node temp = a;
//        while (temp != null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }

        displayRec(c);

//        System.out.println(length(a));


    }
}
