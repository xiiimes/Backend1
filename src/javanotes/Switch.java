package javanotes;

import java.util.Scanner;

public class Switch {

    static int Productid;
    static String Productname;
    static double cost;
    static float profit;
    static double price;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        createProduct();
        printProduct();
    }

    public static void createProduct(){

        String []  Product = new String [5];

        System.out.println("Id: ");
        Productid = sc.nextInt();
        sc.nextLine();
        Product [0] = Productid + "";
        System.out.println("Product Name: ");
        Productname = sc.nextLine();
        Product[1] = Productname;
        System.out.println("Cost: ");
        cost = sc.nextDouble();
        sc.nextLine();
        Product[2] = Double.toString(cost);
        System.out.println("Profit");
        profit = sc.nextFloat();
        sc.nextLine();
        Product [3] = profit + "";
        System.out.println("Precio: ");
        price = calulatePrice(profit, cost);
        Product[4] = Double.toString(price);

    }

    public static double calulatePrice(float profit, double cost){

        double price = cost/(1-(profit/100));

        return price;

    }

    public static void printProduct(){
        System.out.println("id " + Productid + "\n" +
                "Nombre Producto" + Productname +  "\n" +
                "Precio" + price);
    }

    public  static  void menu(){
        System.out.println("Selecione 1. Crear producto " +
                "2. Ver producto ");

        int opc = sc.nextInt();
        sc.nextLine();

        switch (opc){
            case 1:
                System.out.println("Crear producto ");
                createProduct();
                break;
            case 2:
                System.out.println(" Ver Producto ");
                printProduct();
                break;

            default:
                System.out.println("Ingrese una opcion valida ");
        }
    }
}
