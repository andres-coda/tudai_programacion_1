/*
 12. Dado dos arreglos de números enteros: un arreglo A de tamaño
MAXA y un arreglo B de tamaño MAXB con números entre 0 y
MAXA-1, determinar la suma de los elementos del arreglo A cuyas
posiciones son indicadas por el arreglo B. Por ejemplo, dado
A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá
informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
y el 31 de la posición 2 del arreglo A).

 */
public class Ejercicio12 {
    public static void subMenu(int[] arregloA, int max){
        ManejoArreglo.comprobarArreglo(arregloA, max);
        System.out.println("Ingrese el tamaño del arreglo b");
        int maxB = Utils.leerInt();
        int[] arregloB = new int[maxB];
        ManejoArreglo.cargarArregloLimitado(arregloB, maxB, max-1);
        System.out.println("Arreglo A");
        Ejercicio1.mostrarArreglo(arregloA, max);
        System.out.println("Arreglo B");
        Ejercicio1.mostrarArreglo(arregloB, maxB);
        System.out.println("La sumatoria del arreglo A en las posiciones del arreglo b es: "+ sumarPosiciones(arregloA, arregloB, maxB));
        Menu.pausarConsola();
    }

    public static int sumarPosiciones(int[] arregloA, int[] arregloB, int maxB) {
        int suma=0;
        for (int i = 0; i < maxB; i++){
            suma+=arregloA[arregloB[i]];
        }
        return suma;
    }
}
