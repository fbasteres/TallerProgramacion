/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author ferna
 */

/*  el almuno ingresa tres notas
    Visualizat el promedio y su condicion
    Mayor o igual 14 - aprobado 
    sino desaprobado

*/ 
import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa02 {
    public static void main(String[] args){
        double nota1,nota2,nota3,alumnoPromedio;
        String alumno,condicion;
        
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato= new DecimalFormat("##.##");
        
        System.out.print("Ingresar el Nombre del alumno:");
        alumno = lectura.next();
        System.out.print("Ingresar Nota 1:");
        nota1 = lectura.nextInt();
        System.out.print("Ingresar Nota 2:");
        nota2 = lectura.nextInt();
        System.out.print("Ingresar Nota 3:");
        nota3 = lectura.nextInt();
        
        alumnoPromedio = (nota1 + nota2 + nota3) / 3;
        
        if(alumnoPromedio >= 12){
            condicion="Aprobado";
        }else{
            condicion="Desaprobado";
        }
        
        System.out.println("El promedio es:" + formato.format(alumnoPromedio));
        System.out.println("La condicion es:" + condicion);
    }
}
