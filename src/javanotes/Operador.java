package javanotes;

public class Operador {

    public static void main(String[] args) {
        // Aritmeticos (+.-,/,*, %)

        int num1 = 50;
        int num2 = 35;

        int sum = num1 + num2;
        System.out.println(sum);

        int rest = num1 - num2;
        System.out.println("La resta es igual a: " + rest);

        int multipli = num1 * num2;
        System.out.println("Division: " + multipli);

        // modulo de la operacion

        int modul = num1 % num2;
        System.out.println("El modulo es: " + modul);

        // operadores de comparacion (<>)
        int num3 = 4;
        float num4 = 5.0F;

        boolean resultado = num4 == num3;
        System.out.println(resultado);

        // operadores logicos
    }

}
