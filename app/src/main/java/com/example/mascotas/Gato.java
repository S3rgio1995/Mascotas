package com.example.mascotas;

public class Gato {
String Nombre, colorpelaje, genero, raza;
Double altura, peso;
Integer edad;

    public Gato(String nombre, String colorpelaje, String genero, String raza, Double altura, Double peso, Integer edad) {
        Nombre = nombre;
        this.colorpelaje = colorpelaje;
        this.genero = genero;
        this.raza = raza;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }
}
