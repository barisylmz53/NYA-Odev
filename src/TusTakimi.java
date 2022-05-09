import java.util.Scanner;

public class TusTakimi implements ITusTakimi {

    @Override
    public String stringVeriAl() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    @Override
    public int intVeriAl() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}