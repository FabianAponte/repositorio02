import java.util.Scanner;

 public class Otro {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce un nombre: ");
        cadena = sc.nextLine();
        System.out.println("Buenos Días " + cadena);
        sc.close(); //Cierra el scanner                                               

    }
}