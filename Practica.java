/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author zSamuel002
 */
public class Practica {
//Metodo calcular consumo de agua por casa
    public static int PromedioPorCasa() {
        int casa, Op;
        Scanner x = new Scanner(System.in);
        casa = 0;
        int[][] Data = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40}
        };

        System.out.println("Promedio por casa.");
        System.out.println("(0, 1, 2, 3)");
        System.out.print("Seleccione una casa: ");
        Op = x.nextInt();

        for (int i = 0; i < Data[Op].length; i++) {
            casa += Data[Op][i];

        }
        System.out.println(casa);

        return casa;
    }

//Metodoo para calcular el consumo de agua diaria
    public static int promedioDiario() {
        int dia, Op, res;
        Scanner x = new Scanner(System.in);
        dia = 0;
        res = 0;
        int[][] Data = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40}
        };

        System.out.println("Promedio por materia.");
        System.out.println("(0.- Lunes, 1.- Martes, 2.- Miercoles, 3.-Jueves"
                + " 4.- Viernes)");
        System.out.print("Seleccione una dia: ");
        Op = x.nextInt();

        for (int j = 0; j < Data.length; j++) {
            for (int i = 0; i < Data.length; i++) {
                dia += Data[i][Op];
                res = dia / Data.length;
            }
        }
        System.out.println(res);

        return res;
    }

    public static void main(String[] args) {
        int cl;
        int[][] Data = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40}
        };
        boolean Sys = true;
        Scanner Scn = new Scanner(System.in);

        while (Sys) {
            System.out.println("-------------------------------------------");
            System.out.println("         Consumo diario de agua.           ");
            System.out.println("-------------------------------------------");
            System.out.println("1. Consumo de agua por casa.");
            System.out.println("2. Consumo de agua diario.");
            System.out.println("3. Salir.");
            System.out.print("Seleccione una opcion: ");
            cl = Scn.nextInt();

            switch (cl) {
                case 1 -> {
                    Practica.PromedioPorCasa();
                }
                case 2 -> {
                    Practica.promedioDiario();
                }
                case 3 -> {
                    System.out.println("Vuelva pronto.");
                    Sys = false;
                    Scn.close();
                }
                default -> {
                    System.out.println("Opcion no valida.");
                }
            }
            System.out.println( );
        }

    }

}
