public class Ejercicio02 {
    public static void main(String[] args) {
        String path = "home/user/index.html";

        int sep = path.lastIndexOf('/');
        int dot = path.lastIndexOf('.');

        String extension = path.substring(dot + 1);
        String nombre = path.substring(sep + 1, dot);

        System.out.println("Extensión: " + extension);
        System.out.println("Nombre: " + nombre);
    }
}
