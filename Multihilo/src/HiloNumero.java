public class HiloNumero extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("El numero es: " + i);
        }
    }

}
