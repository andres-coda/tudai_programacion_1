/*
 7. Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original.

 */
public class Ejercicio7 {
    public static void subMenu(int[] arreglo, int max){
        int[] arregloAux= new int[max];
        ManejoArreglo.comprobarArreglo(arreglo, max);
        Ejercicio1.mostrarArreglo(arreglo, max);
        System.out.println("Ingrese el número N:");
        int n=Utils.leerInt();
        int newMax= arregloPosiciones(arreglo, max, n, arregloAux);
        Ejercicio1.mostrarArreglo(arregloAux, newMax);
        System.out.println("Ingrese el número M para multiplicar las coincidencias:");
        int m=Utils.leerInt();
        multiplicarPorM(arreglo, arregloAux, newMax, m);
        Ejercicio1.mostrarArreglo(arreglo, max);
        Menu.pausarConsola();
    }

    public static int arregloPosiciones(int[] arreglo, int max, int n,int[] newArreglo){
        int newMax=0;
        for (int i=0; i<max; i++){
            if(n==arreglo[i]){
                newArreglo[newMax]=i;
                newMax++;
            }
        }
        return newMax;
    }

    public static void multiplicarPorM(int[] arreglo, int[] arregloPos, int max, int m){
        for(int i=0; i<max; i++){
            arreglo[arregloPos[i]]=arreglo[arregloPos[i]]*m;
        }
    }
}
