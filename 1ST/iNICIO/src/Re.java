import java.util.Scanner;

public class Re {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        double n3 = 0;
        double suma;
        double resta;
        double multiplicacion;
        double division;

        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        n1 = sc.nextInt();

        System.out.print("Num2: ");
        n2 = sc.nextInt();
        
        System.out.print("Num3: ");
        n3 = sc.nextDouble();

        suma = n1 + n2 + n3;
        resta = n1 - n2 - n3;
        multiplicacion = n1 * n2 * n3;
        division = n1 / n2 / n3;

        System.out.println("suma " + suma + "\n" + "Resta " + resta + "\n" + "Multi " + multiplicacion + "\n" + "Div "
                + division + "\n");

    }

}
