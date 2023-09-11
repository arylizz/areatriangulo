import java.util.Scanner;
/** Esta clase nos permite calcular el área de un triángulo.
 * @author Lizbeth Monserrat Miramontes Flores
 */

public class areatriangulo {
    public static void main(String[] args) {
        int base;
        int altura;
        int division;
        int multiplicacion;

        System.out.println("¡Hola! Vamos a calcular el área de un triángulo." );

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese la base del triángulo: ");
            base = entrada.nextInt();
            System.out.println("Ingrese la altura del triángulo: ");
            altura = entrada.nextInt();
        }
        multiplicacion = base * altura;
        division = multiplicacion / 2;

        System.out.println("El área del triángulo es: " + division);
    


    }
}
