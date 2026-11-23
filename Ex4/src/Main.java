import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        if (texto.isEmpty()) {
            System.out.println("Texto vacío. Fin del programa.");
        } else {
            System.out.println("Introduce una palabra a buscar:");
            String palabra = sc.nextLine();

            if (texto.contains(palabra)) {
                System.out.println("La palabra se ha localizado en el texto");
            } else {
                System.out.println("La palabra no se ha localizado en el texto");
            }
        }
    }
}
