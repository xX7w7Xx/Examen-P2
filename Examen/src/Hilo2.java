public class Hilo2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("cont 1: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}