/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

/**
 *
 * @author josep
 */
public class Proyecto {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public class CalculadoraAvanzada{
        public int sumar(int a, int b) { return a + b; }
        public int restar(int a, int b) { return a - b; } 
        public int multiplicar(int a, int b) { return a * b; } 
        public double dividir(int a, int b) { if (b == 0) throw new IllegalArgumentException("No se puede dividir entre cero"); return (double)a / b;} 
        public double promedio(int[] nums) { if (nums == null || nums.length==0) throw new IllegalArgumentException("Arreglo inválido"); return java.util.Arrays.stream(nums).average().getAsDouble(); }
        public boolean esPar(int n){ return n%2==0; } 
        public int max(int... valores){ /* ... */ return 0; }
        public int potencia(int base, int exp){ /* ... */ return 0; }
    }
}
 
