package less_11;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> lst = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lst.add(new Thread(new Print()));
            lst.get(i).start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Join on " + lst.get(i).getName());
                lst.get(i).join();
            } catch (InterruptedException e) {
                System.out.println(lst.get(i).getName() + " interrupted");
            }
        }
    }

    private static class Print implements Runnable {
        @Override
        public synchronized void run() {
            synchronized (Print.class) {
                for (int i = 0; i < 5; i++) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " Print: " + i);
                }
            }
        }
    }
}
