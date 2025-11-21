public class Main {
    static int F = 4;
    static int R = 4;
    public static void main(String[] args) {
        int max = 5;
        int[] Q = new int[max];
        enqueue(Q, max, 10);
        enqueue(Q, max, 20);
        enqueue(Q, max, 30);
        enqueue(Q, max, 50);
        dequeue(Q, max);
        enqueue(Q, max, 40);
        enqueue(Q, max, 60);
        dequeue(Q, max);
    }
    public static void enqueue(int[] Q, int max, int x) {
        boolean overflow;
        if ((R + 1 == F) || (R == max - 1 && F == 0)) {
            overflow = true;
        } else {
            overflow = false;
        }

        if (overflow) {
            System.out.println("Overflow! Cannot enqueue ");
        } else {
            if (R == max - 1) {
                R = 0;
            } else {
                R = R + 1;
            }
            Q[R] = x;
            displayQueue(Q, max);
        }
    }
    public static int dequeue(int[] Q, int max) {
        boolean underflow;
        int x;
        if (F == R) {
            underflow = true;
        } else {
            underflow = false;
        }
        if (underflow) {
            System.out.println("Underflow Cannot dequeue so we return -1");
            return -1;
        } else {
            if (F == max - 1) {
                F = 0;
            } else {
                F = F + 1;
            }
            x = Q[F];
            displayQueue(Q, max);
            return x;
        }
    }
    public static void displayQueue(int[] Q, int max) {
        boolean empty=false;
        if (F == R) {
            System.out.println("[]");
            empty = true;
        }
        if(!empty){
        System.out.print("[");
        int i;
        if (F == max - 1) {
            i = 0;}
        else {
            i = F + 1;}

        while (true) {
            System.out.print(Q[i]);
            if (i == R) break;

            if (i == max - 1) {
                i = 0;
            } else {
                i = i + 1;
            }
            System.out.print(",");
        }
            System.out.println("]");
    }}
}