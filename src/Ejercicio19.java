/*
 19. Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
posición del arreglo como cantidad de ocurrencias del número).
 */
public class Ejercicio19 {
    public static void subMenu(int[] ar, int max){
        ManejoArreglo.comprobarArreglo(ar, max);
        Ejercicio1.mostrarArreglo(ar, max);

        System.out.println("Ingrese el número a eliminar:");
        int numero = Utils.leerInt();

        eliminarTodasConcurrencias(ar, max, numero);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static void eliminarTodasConcurrencias(int[] ar, int max, int numero){
        while(Ejercicio18.posicionElemento(ar, max, numero)!=-1 && numero!=ar[max-1]){
            Ejercicio18.numeroEliminar(ar, max, numero);
        }
    }
}
