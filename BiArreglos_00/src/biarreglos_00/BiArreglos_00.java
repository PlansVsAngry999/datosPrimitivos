package biarreglos_00;
/**
 * Programa que solicita 10 números y los almacena en un arreglo de dos dimensiones.
 * @author Ricardo Daniel Hernandez Sosa (PlansVsAngry999).
 */
import java.util.Scanner;
public class BiArreglos_00 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num[] [] = new int[4] [4]; // i = Fila ; j = Columna.
            //Leer datos.
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("Posición: "+ i +","+ j +"; Ingrese un número: ");
                num[i] [j] = sn.nextInt();
            }
        }
            //Imprimir datos.
        System.out.println("Sus números: ");   
        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=0;j<4;j++){
                System.out.print(num[i] [j] + " ");
            }
        }
        System.out.println();
    }
}
