package ViewModul;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public String getString(String title) {
        System.out.printf("%s", title);
        return in.next();
    }

    public double getNumber(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public int getIntNumber(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    // print(f'{title} = {data}')
    public void print(String title) {
        System.out.printf("%s\n", title);
    }
}