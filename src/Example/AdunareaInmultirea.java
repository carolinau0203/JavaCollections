package Example;

import java.util.Scanner;
public class AdunareaInmultirea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        int d = a*b;
        String nume = scan.nextLine();
        System.out.println("Suma: " +c);
        System.out.println("Inmultirea: " +d);
        System.out.println("Carolina");
    }

}
