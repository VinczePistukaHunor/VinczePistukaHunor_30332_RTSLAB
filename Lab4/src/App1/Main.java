package App1;

public class Main {
    public static void main(String[] args) {
        Integer monitor = new Integer(1);
        Integer monitor2 = new Integer(1);
        new ExecutionThread(monitor,monitor, 4, 4, 2, 4).start();
        new ExecutionThread(monitor,monitor2, 3, 3, 2, 6).start();
    }
}
