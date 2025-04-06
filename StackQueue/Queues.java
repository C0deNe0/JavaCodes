import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    static Queue<Integer> q = new LinkedList<>();

    static boolean isEmpty(){
        return q.isEmpty();
    }


    static void qEnqueue(int n){
        q.add(n);
    }


    static int qDequeue(){
        if (isEmpty()) {
            return -1;
        }
        return q.poll();
    }


    static int getFront() {
        if (isEmpty()) return -1;
        return q.peek();
    }

    static int getRear() {
        if (isEmpty()) return -1;
        return ((LinkedList<Integer>) q).getLast();
    }

    public static void main(String[] args) {
        qEnqueue(1);
        qEnqueue(2);
        qEnqueue(3);
        

        if (!isEmpty()) {
            System.out.print("Queue after enqueue operation: ");
            for (int num : q) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Front: " + getFront());
        System.out.println("Rear:  " + getRear());

        System.out.println("Queue size: " + q.size());

        qDequeue();

        System.out.println("Is queue empty? " + (isEmpty() ? "Yes" : "No") );
    }
}
