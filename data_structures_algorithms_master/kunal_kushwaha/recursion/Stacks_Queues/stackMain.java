package data_structures_algorithms_master.kunal_kushwaha.recursion.Stacks_Queues;

public class stackMain {
    public static void main(String[] args) throws StackExeptions {
        CustomStack cs = new CustomStack(5);
        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
        cs.push(6);


//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());

        System.out.println(cs.peek());

    }
}
