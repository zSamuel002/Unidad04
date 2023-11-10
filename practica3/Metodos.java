/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author zSamuel002
 */
public class Metodos {

    public static double promedioEstudiante() {
        double Suma, Res, E1;
        int Op;
        Scanner x = new Scanner(System.in);
        E1 = 0;
        Suma = 0;
        Res = 0;
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };

        System.out.println("Promedio por estudiante.");
        System.out.println("(0, 1, 2)");
        System.out.print("Seleccione un estudiante para calcular su promedio: ");
        Op = x.nextInt();

        for (int i = 0; i < calificaciones[Op].length; i++) {
            E1 += calificaciones[Op][i];
            Res = E1 / 4;

        }
        System.out.println(Res);

        return Res;
    }

    public static double promedioMateria() {
        double Suma, Res, Student;
        int Op;
        Scanner x = new Scanner(System.in);
        Student = 0;
        Suma = 0;
        Res = 0;
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };

        System.out.println("Promedio por materia.");
        System.out.println("(0, 1, 2, 3)");
        System.out.print("Seleccione una materia para calcular su promedio: ");
        Op = x.nextInt();

        for (int j = 0; j < calificaciones.length; j++) {
            for (int i = 0; i < calificaciones.length; i++) {
                Student += calificaciones[i][Op];
                Res = Student / 3 / 3;
            }
        }
        System.out.println(Res);

        return Res;
    }

}
