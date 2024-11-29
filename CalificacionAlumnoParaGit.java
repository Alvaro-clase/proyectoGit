
package gitentornos;

import java.util.Scanner;

/**
 *
 * @author ÁLVARO CARRIÓN ROMERO
 */
public class CalificacionAlumnoParaGit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dame la nota de un alumno: ");
        int nota = input.nextInt();
        input.nextLine();
        if(nota < 5){
            System.out.println("Suspenso");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Aprobado");
        }else if(nota >= 7 && nota < 9){
            System.out.println("Notable");
        }else if(nota >= 9 && nota <= 10){
            System.out.println("Sobresaliente");
        }
    }
}
