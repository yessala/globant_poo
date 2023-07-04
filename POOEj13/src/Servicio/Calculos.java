/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Scanner;
import Entidad.Curso;


public class Calculos {

    Scanner scan = new Scanner(System.in);

    public void cargarAlumnos(Curso c1) {
        String[] nombre = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno");
            nombre[i] = scan.next();
        }
        c1.setAlumnos(nombre);

        //System.out.println(c1.getAlumnos());
    }
    
    public void crearCurso(Curso c1){
        System.out.println("Ingrese el nombre del curso");
        c1.setNombreCurso(scan.nextLine());
        System.out.println("Ingrese la cantidad de horas por dia");
        c1.setCantidadHorasPorDia(scan.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana");
        c1.setCantidadDiasPorSemana(scan.nextInt());
        
        
    }

}
