/*
 2. Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.
 */

public class Ejercicio2 {
    public static void subMenu(int[] arreglo, int max){
        ManejoArreglo.cargarArreglo(arreglo, max);
        System.out.println("El promedio del arreglo es: "+calcularPromedio(arreglo, max));
        Menu.pausarConsola();      
    }

    public static double calcularPromedio(int[] arreglo, int max){
        int suma = 0;
        for (int i=0; i<max; i++){
           suma += arreglo[i]; 
        }
        return (suma/max);
    }

}
