/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package practica2;
import java.util.Scanner;
/**
 *
 * @author Samuel Arriaga
 */
public class Practica2 {
    public static int suma (int a, int b, int res){
        Scanner Num = new Scanner(System.in);
        
        System.out.println("Suma de dos numeros.");
        
        System.out.print("Ingrese el primer numero: ");
        a = Num.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        b = Num.nextInt();
        
        res = a + b;

       System.out.println("El resultado es: " + res);
        
        return res;
    }

    public static int resta (int a, int b, int res){
        Scanner Num = new Scanner(System.in);
        
        System.out.println("Resta de dos numeros.");
        
        System.out.print("Ingrese el primer numero: ");
        a = Num.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        b = Num.nextInt();
        
        res = a - b;

       System.out.println("El resultado es: " + res);
        
        return res;
    }    

    public static int Multiplicacion (int a, int b, int res){
        Scanner Num = new Scanner(System.in);
        
        System.out.println("Multiplicacion.");
        
        System.out.print("Ingrese el primer numero: ");
        a = Num.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        b = Num.nextInt();
        
        res = a * b;
        
       System.out.println("El resultado es: " + res);
       
        return res;
    }

    public static int Division (int a, int b, int res){
        Scanner Num = new Scanner(System.in);
        
        System.out.println("Division.");
        
        System.out.print("Ingrese el primer numero: ");
        a = Num.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        b = Num.nextInt();
        
        res = a / b;
        
        System.out.println("El resultado es: " + res);
        
        return res;
    }    
    
}
