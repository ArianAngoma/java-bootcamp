import javax.swing.*;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int i = 5, j = 4, sum = i + j;

        System.out.println("sum = " + sum);

        System.out.println("i + j = " + i + j);
        System.out.println("i + j = " + (i + j));

        int diff = i - j;
        System.out.println("diff = " + diff);

        int multi = i * j;
        System.out.println("multi = " + multi);

        int div = i / j;
        System.out.println("div = " + div);

        float div2 = (float) i / j;
        System.out.println("div2 = " + div2);

        int res = i % j;
        System.out.println("res = " + res);


        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (number % 2 == 0) System.out.println("El número es par");
        else System.out.println("El número es impar");
    }
}
