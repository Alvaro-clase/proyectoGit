
package gitentornos;

import java.util.Scanner;

/**
 *
 * @author ÁLVARO CARRIÓN ROMERO
 */
public class OperacionesParaGit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dame dos numeros para hacer la operación: ");
        System.out.print("Primer número: ");
        int numero1 = input.nextInt();
        input.nextLine();
        System.out.print("Segundo número: ");
        int numero2 = input.nextInt();
        input.nextLine();
        System.out.println("Ahora que operación quieres hacer...");
        System.out.println("1.- suma, 2.- resta, 3.- multiplicación, 4.- división: ");
        int operando = input.nextInt();
        input.nextLine();
        
        switch(operando){
            case 1: 
                System.out.println(numero1 + numero2);
                break;
            case 2:
                System.out.println(numero1 - numero2);
                break;
            case 3:
                System.out.println(numero1 * numero2);
                break;
            case 4:
                if(numero2 != 0){
                   System.out.println(numero1 / numero2); 
                } else {
                    System.out.println("Error, no se puede dividir entre cero");
                }
                break;
        }
    
    }
    
}
