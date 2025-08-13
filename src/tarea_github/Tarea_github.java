package tarea_github;
import java.util.Scanner;
public class Tarea_github {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() ;
         if (a<10)    { 
        System.out.println("El numero es de una cifra");
        }
        else if (a>9 && a <100) {
        System.out.println("El numero es de dos cifras");
        }
        else if(a<1000){
        System.out.println("El numero es de tres cifras");
        }
        //Canbios en el laboratotio virtual
        else if(a<10000){
        System.out.println("El numero es de tres cifras");
        }
        else {
        System.err.println("Error: El numero es invalido");
        }  
    }   
}
