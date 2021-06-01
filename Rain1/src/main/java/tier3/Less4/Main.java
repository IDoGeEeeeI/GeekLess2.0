package tier3.Less4;

public class Main {
    static volatile char a = 'A';
    static Object obj = new Object();

    static class WaitNotifyClass implements Runnable {
        private char Letter;
        private char checkLetter;

        public WaitNotifyClass(char Letter, char checkLetter) {
            this.Letter = Letter;
            this.checkLetter = checkLetter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (obj) {
                    try {
                        while (a != Letter)
                            obj.wait();
                        System.out.print(Letter);
                        a = checkLetter;
                        obj.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        new Thread(new WaitNotifyClass('A', 'B')).start();
        new Thread(new WaitNotifyClass('B', 'C')).start();
        new Thread(new WaitNotifyClass('C', 'A')).start();
    }
}
