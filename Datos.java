public class Datos {
    public static void main(String[] args) {
        // Booleanos
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = (99 > 100);           // falso
        boolean b4 = ("profe" != "alumno"); // en Java es referencia, pero igual da true
        boolean b5 = (3.1416 < 10);        // true

        // Strings
        String s1 = "arepa";
        String s2 = "dragón";
        String s3 = "XD";
        String s4 = "cafecito";
        String s5 = "2025";

        // Enteros
        int i1 = 13;
        int i2 = -404;
        int i3 = 2025;
        int i4 = 0;
        int i5 = 999;

        // Flotantes (double)
        double f1 = 3.1416;    // pi
        double f2 = -0.0001;   // casi nada
        double f3 = 6.66;      // sospechoso
        double f4 = 42.42;     // doblemente mítico
        double f5 = 1.618;     // número áureo

        // Caracteres
        char c1 = 'A';
        char c2 = 'z';
        char c3 = '!';
        char c4 = '7';
        char c5 = 'Ñ';

        // Imprimir para verificar
        System.out.println("Booleanos: " + b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5);
        System.out.println("Strings: " + s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5);
        System.out.println("Enteros: " + i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5);
        System.out.println("Flotantes: " + f1 + " " + f2 + " " + f3 + " " + f4 + " " + f5);
        System.out.println("Caracteres: " + c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
    }
}
