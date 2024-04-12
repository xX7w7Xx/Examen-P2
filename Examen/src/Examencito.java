public class Examencito {
    public static void main(String[] args) {
        System.out.println("contador del 1 al 10 Fecha 12/04/2024");
        Hilos cont = new Hilos();
        Hilo2 cont2 = new Hilo2();
        cont2.start();
        cont.start();

    }
}
