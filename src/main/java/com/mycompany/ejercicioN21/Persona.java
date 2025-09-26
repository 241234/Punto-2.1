/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioN21;

public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    String paisNacimiento;
    char genero;
    int anoNacimiento;
    
Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anoNacimiento, String paisNacimiento, char genero) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    this.anoNacimiento = anoNacimiento;
    this.paisNacimiento = paisNacimiento;
    this.genero = genero;
 }
 void imprimir() {
    System.out.println("Nombre = " + nombre);
    System.out.println("Apellidos = " + apellidos);
    System.out.println("Número de documento de identidad = " + numeroDocumentoIdentidad);
    System.out.println("Año de nacimiento = " + anoNacimiento);
    System.out.println("País de nacimiento = " + paisNacimiento);
    System.out.println("Genero = " + genero);
    System.out.println();
 }
}
