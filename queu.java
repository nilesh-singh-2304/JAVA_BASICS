import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queu {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q);


        //array deque
        ArrayDeque<Integer> q1 = new ArrayDeque<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.addFirst(300);
        q1.addLast(400);
        System.out.println(q1.peek());
        q1.remove();
        System.out.println(q1.peek());
        System.out.println(q1.size());
        System.out.println(q1);


        //pq
        Queue<Integer> q2 = new PriorityQueue<>((a, b) -> b - a);  //custom comparator for maxheap
        q2.add(40);
        q2.add(20);
        q2.add(30);

        System.out.println(q2);   //by default sabse chote ki priority sabse zda => minheap
    }
}
