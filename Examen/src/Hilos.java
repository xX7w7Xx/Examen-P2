public class Hilos extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("cont2: " + i);
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
