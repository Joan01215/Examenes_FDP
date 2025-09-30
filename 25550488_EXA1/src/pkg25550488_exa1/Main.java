package pkg25550488_exa1;

import java.util.Scanner;

public class Main {
    final static String Usuario = "Joan";
    final static String Contraseña = "1234";
    final static String Consultar_saldo = "1.Consultar saldo";
    final static String Retirar_dinero = "2.Retirar dinero";
    final static String Depositar_dinero = "3.Depositar dinero";
    public static void main(String[] args) {
        int Saldo_inicial = 5000;
        String usuario, contraseña, opcion, cantidad_a_retirar;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a sistema de cajero");
        System.out.println("Ingrese su usuario:");
        usuario = input.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña = input.nextLine();
        if(usuario.equals(Usuario)){
            if(contraseña.equals(Contraseña)){
                System.out.println("Bienvenido, selecciona la opcion que desee realizar");
                System.out.println("1.Consultar saldo");
                System.out.println("2.Retirar dinero");
                System.out.println("3.Depositar dinero");
                opcion = input.nextLine();
                if(opcion.equals(Consultar_saldo)){
                    System.out.println(Saldo_inicial);
                if(opcion.equals(Retirar_dinero)){
                    System.out.println("Cantidad a retirar:");
                    cantidad_a_retirar = input.nextLine();
                if(opcion.equals(Depositar_dinero)){
                    System.out.println(Saldo_inicial);
                }else{
            System.out.println("Acceso denegado, intente de nuevo");
           
            }
        }
        
        }
    }
}
    }
}
    

