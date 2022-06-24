public class IncrementalOperators {
    public static void main(String[] args) {
        int i = 1;

        // Pre-incremento -> primeo se incrementa "i" y luedo se asigna a "j"
        int j = ++i; // i = i + 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Post-incremento -> primero se asigna el valor de "i" a "j", después se le suma 1 a "i"
        i = 2;
        j = i++;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);
        
        // Pre-decremento
        i = 3;
        j = --i;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);

        // Post-decremento
        i = 4;
        j = i--;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);

        System.out.println("\n(++j) = " + (++j)); // Primero suma, luego pinta
        System.out.println("(j++) = " + (j++)); // Primero pinta, luego suma
        System.out.println("j = " + j); // Entonces al final j = 6
    }
}
