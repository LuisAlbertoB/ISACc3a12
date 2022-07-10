import java.util.Scanner;
import java.util.ArrayList;

public class ISACc3a1 {

    public static void main(String[] args) {
        int opcion=1;
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner entrada= new Scanner(System.in);

        do {
            if (opcion ==1)
                añadirNumero(lista);

            System.out.println("añadir mas numeros?");
            System.out.println("1.-Si");
            System.out.println("2.-No");
            opcion= entrada.nextInt();

            if (opcion!=1 && opcion!=2)
                System.out.println("opcion no valida");
        }while (opcion!=2);

        do {
            System.out.println("Opciones:");
            System.out.println("1.-Ver");
            System.out.println("2.- Sumar");
            System.out.println("0.- Salir");

            opcion= entrada.nextInt();
            switch (opcion){
                case 1:
                    ver(lista);
                    break;

                case 2:
                    sumar(lista);
                    break;

                case 0:
                    System.out.println("Hasta pronto");
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
        }while (opcion!=0);
    }

    public static void añadirNumero(ArrayList<Integer> lista){
        Scanner entrada= new Scanner(System.in);
        System.out.println("numero:");
        lista.add(entrada.nextInt());
    }

    public static void sumar(ArrayList<Integer> lista){
        int suma = 0;
        for (int i=0; i<lista.size(); i++)
            suma+= lista.get(i);
        System.out.println("El total de sumar toda la arraylist es: "+suma);
    }

    public static void ver(ArrayList<Integer> lista){
        for (int i=0; i<lista.size(); i++)
            System.out.println(lista.get(i));
    }
}
