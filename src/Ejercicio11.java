/*
 11. Dado dos arreglos de números enteros A y B determinar si
todos los números almacenados en el arreglo A están presentes
en el arreglo B.
 */
public class Ejercicio11 {
    public static void subMenu(int[] arregloA, int max){
        final int MAXB=3;
        int[] arregloB = new int[MAXB];
        ManejoArreglo.comprobarArreglo(arregloA, max);
        ManejoArreglo.cargarArreglo(arregloB, MAXB);
        System.out.println("Cargar arreglo A");
        Ejercicio1.cargarArreglo(arregloB, MAXB);
        System.out.println("Arreglo B");
        Ejercicio1.mostrarArreglo(arregloA, max);
        System.out.println("Arreglo A");
        Ejercicio1.mostrarArreglo(arregloB, MAXB);
        if (estanTodos(arregloA, arregloB, max, MAXB)){
            System.out.println("Todos los números del arreglo A están en el arreglo B");
        } else{
            System.out.println("Hay números en el arreglo A que no están en el arreglo B");
        }
        Menu.pausarConsola();
    }

    public static boolean estanTodos(int[] arregloA, int[] arregloB, int maxA, int maxB){
        int i=0;
        int j=0;
        while(i<maxB && j<maxA){
            j=0;
            while(j<maxA && arregloB[i]!=arregloA[j]){
                j++;
            }
                i++;
        }
        return i>=maxB && j<maxA;
    }
}
