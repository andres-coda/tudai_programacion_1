/*
 1. Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
 */

public class Ejercicio1 {

    public static void submenu(int[] arreglo, int MAX){
        cargarArreglo(arreglo, MAX);
        mostrarArreglo(arreglo, MAX);
        Menu.pausarConsola();
    };

    public static void cargarArreglo(int[] arreglo, int MAX){
        int i = 0;
        while(i<MAX){
            System.out.println("Ingrese un número del 1 al 12 para la posición "+i);
            int ingreso = Utils.leerInt();
            if (ingreso < 1 || ingreso > 12) {
                System.out.println("Debe ser especificamente un número mayor a 1 y menor a 12");
            } else {
                arreglo[i]=ingreso;
                i++;
            }
        }
        System.out.println("");
    }

    public static void mostrarArreglo(int[] arreglo, int MAX){
        int i = 0;
        System.out.println("El arreglo quedo cargado de este modo: ");
        while(i<MAX){
            System.out.print(arreglo[i]);
            if(i<MAX-1){
                System.out.print(" - ");
            }
            i++;
        }
        System.out.println("");
    }
}
