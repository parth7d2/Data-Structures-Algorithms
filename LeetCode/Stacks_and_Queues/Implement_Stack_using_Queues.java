package LeetCode.Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Implement_Stack_using_Queues {

    Queue<Integer> Q2 = new ArrayDeque<>();
    Queue<Integer> Q1 = new ArrayDeque<>();




    public Implement_Stack_using_Queues() {

    }

    public void push(int x) {
        Q2.add(x);
        while (!Q1.isEmpty()){
            Q2.add(Q1.peek());
            Q1.remove();
        }

        while (!Q2.isEmpty()){
            Q1.add(Q2.peek());
            Q2.remove();
        }
    }

    public int pop() {
        int val = Q1.peek();
        Q1.remove();
        return val;
    }

    public int top() {
        return Q1.peek();
    }

    public boolean empty() {
        return Q1.isEmpty();
    }
}
