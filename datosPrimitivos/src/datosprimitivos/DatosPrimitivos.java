package datosprimitivos;
/**
 * Programa que declara, solicita y lee los tipos de dato primitivos.
 * @author Ricardo Daniel Hernandez Sosa (PlansVsAngry999).
 */
import java.util.Scanner;
public class DatosPrimitivos {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
            //Declaracion de datos
        //ENTEROS: Almacenan numeros positivos y negativos.
        byte datoByte = 8;                    //Tamaño 8 bits.
        short datoCorto = 16;                 //Tamaño 16 bits       
        int datoEntero = 32;                  //Tamaño 32 bits.
        long datoLargo = 64;                  //Tamaño 64 bits.
        //CON DECIMAL: Almacenan numeros con precision fraccional        
        float datoFlotante = (float) 45.6;    //Tamaño de 32 bits.
        double datoDoble = 64.64;             //Tamaño de 64 bits.
        //CARACTERES: Almacena un conjunto de simbolos (letras, numeros, caracteres).
        char datoCaracter = 'x';              //Tamaño de 16 bits (unicode).
        //BOOLEANOS: Almacena valores lógicos (verdadero o falso).
        boolean datoBooleano = true;
        
            //Impresion de datos
        //ENTEROS.
        System.out.println("Un byte (byte): "+datoByte);
        System.out.println("Un corto (short): "+datoCorto);
        System.out.println("Un entero (int): "+datoEntero);
        System.out.println("Un largo (long): "+datoLargo);
        //CON DECIMAL.
        System.out.println("Un flotante (float): "+datoFlotante);
        System.out.println("Un doble (double): "+datoDoble);
        //CARACTERES.
        System.out.println("Un caracter (char): "+datoCaracter);
        //BOOLEANOS.
        System.out.println("Un booleano (boolean): "+datoBooleano);
        
            //Solicitar y leer datos
        System.out.println(); //Para hacer separación.
        //ENTEROS.
        System.out.print("Ingresa un Byte: ");
        datoByte = sn.nextByte();
        System.out.print("Ingresa un corto: ");
        datoCorto = sn.nextShort();
        System.out.print("Ingresa un entero: ");
        datoEntero = sn.nextInt();
        System.out.print("Ingresa un largo: ");
        datoLargo = sn.nextLong();
        //CON DECIMAL.
        System.out.print("Ingresa un flotante: ");
        datoFlotante = sn.nextFloat();
        System.out.print("Ingresa un doble: ");
        datoDoble = sn.nextDouble();
        //CARACTERES
        /* System.out.print("Ingresa un caracter: ");
                      datoCaracter = sn.nextChar();*/
        //BOOLEANOS.
        System.out.print("Ingresa un Booleano: ");
        datoBooleano = sn.nextBoolean();
        
            //Impresion de datos (Ingresados por el usuario).
        System.out.println(); //Para hacer separación.
        //ENTEROS.
        System.out.println("Tu byte (byte): "+datoByte);
        System.out.println("Tu corto (short): "+datoCorto);
        System.out.println("Tu entero (int): "+datoEntero);
        System.out.println("Tu largo (long): "+datoLargo);
        //CON DECIMAL.
        System.out.println("Tu flotante (float): "+datoFlotante);
        System.out.println("Tu doble (double): "+datoDoble);
        //BOOLEANOS.
        System.out.println("Tu booleano (boolean): "+datoBooleano);
    }
    
}
