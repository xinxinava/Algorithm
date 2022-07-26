package com.littlebean.interview.practice.iflytek721;

public class Solution2 {


}
 class TestGC {
    private static TestGC TEST_GC = null;
    private void isAlive() {
        System.out.print("Yes,I'm Alive!" + "、");
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.print("finalize mehtod executed!" + "、");
        TestGC.TEST_GC = this;
    }
    public static void main(String[] args) throws Throwable {
        TEST_GC = new TestGC();
        TEST_GC = null;
        System.gc();
        Thread.sleep(500);
        if (TEST_GC != null) {
            TEST_GC.isAlive();
        } else {
            System.out.print("NO,I'm dead!" + "、");
        }
        TEST_GC = null;
        System.gc();
        Thread.sleep(500);
        if (TEST_GC != null) {
            TEST_GC.isAlive();
        } else {
            System.out.print("NO,I'm dead!");
        }
    }
}

 class Test implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
        System.out.println("Final");
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Test());
        thread.start();
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            thread.interrupt();
            System.out.println("interrupt");
        }).start();
        thread.join();
        System.out.println("exit");
    }
}
