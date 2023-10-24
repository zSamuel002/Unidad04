/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forwtarray;
import java.util.Scanner;
/**
 *
 * @author zSamuel002
 */
public class Practicau4 {

    public static void main(String[] args) {
        double[] num = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        int Op;
        Scanner x = new Scanner(System.in);
        boolean Sys = true;
        
        while (Sys) {       
        System.out.println("***********************************************");    
        System.out.println("                    MENU        ");
        System.out.println("***********************************************");  
        System.out.println("Bienvenido.");
        System.out.println("1.- Suma.");
        System.out.println("2.- Multiplicacion.");
        System.out.println("3. Salir.");
        System.out.println("***********************************************");            
        
        System.out.print("Seleccione una opcion: ");
        Op = x.nextInt();
        
        switch (Op) {
            case 1 -> {
                System.out.println("Suma.");
                double sum = 0;  
                for (int i = 0; i < 7 ; i++) {
                sum += num[i];    }
                System.out.println(sum);
        
            }
            case 2 -> {
                System.out.println("Multiplicacion.");
                double mul = 1;  
                for (int i = 0; i < 7 ; i++) {
                mul *= num[i];    }
                System.out.println(mul);
        
            }
            case 3 -> {
                System.out.println("Vuelva pronto.");
                x.close();
                Sys = false;
            }
            default -> {
                System.out.println("Opcion no valida.");
            }
        }
        
            System.out.println("");

            
        }

    }
    
}
