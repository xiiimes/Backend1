package javanotes;

public class Variables {

    public static void main(String[] args) {
        byte moveLeft; // declarando la variable
        moveLeft = 100;

        short moveLeft2 = (short) moveLeft; // casting de la variable
        System.out.println(moveLeft2);
        moveLeft2 = 150;

        // recibe dos valores numericos pero uno de ellos es de tipo string
        // tenemos que sacar un promedio, no se puede sacar promedio con String

        int num1 = 19;
        String num2 = "23";

        // aca podemos sacar parseo de variables - string a numero

        int newNum2= Integer.parseInt(num2);
        float promedio = (num1 + newNum2)/2;
        System.out.println(promedio);
    }

}
