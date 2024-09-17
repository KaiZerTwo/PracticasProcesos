public class HiloLetra extends Thread {
    @Override
    public void run() {
        for (char c = 'a'; c < 'z'; c++) {
            System.out.println("la letra es: " + c);
        }
    }
}
