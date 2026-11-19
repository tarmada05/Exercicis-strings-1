/*
 * Ejercicio 01: Digits
 *
 * Salida por consola:
 *   3 digits before decimal point
 *   2 digits after decimal point
 *
 * Métodos de String utilizados:
 *
 * 1) String.valueOf(double d)  -> ESTÁTICO (se llama sobre la clase)
 *    - Función: convierte el valor double en su representación como texto.
 *    - Devuelve: String ("858.48").
 *    - Parámetros: un double (existen versiones sobrecargadas para int, char, boolean...).
 *
 * 2) s.indexOf('.')  -> DE INSTANCIA (se llama sobre un objeto String)
 *    - Función: busca la primera aparición del carácter y da su posición.
 *    - Devuelve: int (posición, empezando en 0; -1 si no existe). Aquí 3.
 *    - Parámetros: un carácter (int ch) o un String; opcionalmente una posición de inicio.
 *
 * 3) s.length()  -> DE INSTANCIA
 *    - Función: número de caracteres del String.
 *    - Devuelve: int (aquí 6).
 *    - Parámetros: ninguno.
 *
 * Cálculo: dígitos antes del punto = dot = 3
 *          dígitos después = length - dot - 1 = 6 - 3 - 1 = 2
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        double d = 858.48;
        String s = String.valueOf(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits before decimal point");
        System.out.println((s.length() - dot - 1) + " digits after decimal point");
    }
}

