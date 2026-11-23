import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica cual de las siguientes opciones no es un tipo primitivo en Java:");
        System.out.println("a. int");
        System.out.println("b. char");
        System.out.println("c. boolean");
        System.out.println("d. String");

        String respuesta = sc.nextLine().trim().toLowerCase();

        if (respuesta.equals("a") || respuesta.equals("b")
                || respuesta.equals("c") || respuesta.equals("d")) {
            if (respuesta.equals("d")) {
                System.out.println("Respuesta correcta!");
            } else {
                System.out.println("Respuesta incorrecta, la respuesta correcta es: d");
            }
        } else {
            System.out.println("Respuesta no válida: a, b, c, d");
        }
    }
}
