package data_structures_algorithms_master.kunal_kushwaha.recursion.linkedlist;

public class singly_LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public singly_LinkedList(){
        this.size = 0;
    }

    public void inserFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void inserLast(int val){
        if(tail == null){
            inserFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void insert(int val, int index){
        if(index == 0){
            inserFirst(val);
            return;
        }
        if(index == size){
            inserLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
