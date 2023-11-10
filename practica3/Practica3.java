/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author zSamuel002
 */
public class Practica3 {

    public static void main(String[] args) {
        int Op;
        boolean Sys = true;
        // 3x4 filas = estudiantes & columnas = materias
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };
        Scanner Scn = new Scanner(System.in);

        while (Sys) {
            System.out.println("*********************************************");
            System.out.println("               PROMEDIOS.                ");
            System.out.println("---------------------------------------------");
            System.out.println("1. Promedio por estudiante.");
            System.out.println("2. Promedio por materia.");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            Op = Scn.nextInt();

            switch (Op) {
                case 1 -> {
                    Metodos.promedioEstudiante();
                }
                case 2 -> {
                    Metodos.promedioMateria();
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

            System.out.println("");

        }

    }

}
