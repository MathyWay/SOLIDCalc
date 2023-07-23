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

    public double[] getInput(){
        double[] inp = {this.getNumber("Введите ах: "), this.getNumber("Введите ay: "),
        this.getNumber("Введите bх: "), this.getNumber("Введите ах: ")};
        return inp;
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