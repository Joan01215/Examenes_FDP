package pkg25550488_exa2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num, num1, num2, opcion;
        Scanner captu = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Elija dos numeros del 2 en delante");
        System.out.println("Capture el primer numero");
        num1 = captu.nextInt();
        System.out.println("Capture el segundo numero");
        num2 = captu.nextInt();
        System.out.println("Quiere imprimir solo los primos? (1 para si, 2 para no)");
        opcion = captu.nextInt();
        if(opcion == 1){
        for( int i = num1; i <=num2; i++){
            for(int j= 1; j<= i; j++)
                System.out.print("*");
        System.out.println("");    
        }
        }else if(opcion == 2){
        for( int i = num1; i <=num2; i++){
            for(int j= 1; j<= i; j++)
                System.out.print("*");
        
        System.out.println("");
        }
        //NO PUDE HACER SOLO LOS PRIMOS
        
    }
    }
}
    
