import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura:");
        String name = scanner.nextLine();

        System.out.println("Integre el primer precio:");
        double price1 = scanner.nextDouble();

        System.out.println("Integre el segundo precio:");
        double price2 = scanner.nextDouble();

        double total = price1 + price2;
        double tax = (total * 19) / 100;
        double totalWithTax = total + tax;

        String msg = "La factura " + name + " tiene un total bruto de " + total + ", con un impuesto de " + tax + " y el monto después del impuesto es de " + totalWithTax;
        System.out.println(msg);
    }
}
