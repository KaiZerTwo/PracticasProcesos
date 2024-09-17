//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HiloNumero h = new HiloNumero();
        HiloLetra hl = new HiloLetra();

        h.start();
        hl.start();
        System.out.println("Se acabo la fiesta");
    }
}