/*
 21. Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10.
 */

public class Ejercicio21 {
    public static void subMenu(int[] ar, int max){
        ManejoArreglo.comprobarArreglo(ar, max);
        ordenarDecreciente(ar, max);
        Ejercicio1.mostrarArreglo(ar, max);


        System.out.println("Ingrese el número a insertar:");
        int numero = Utils.leerInt();
        insertarNumero(ar, max, numero);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static void ordenarDecreciente(int[] arreglo, int max){
        int aux=0;
        for(int j=max; j>1; j--){
            int posicionAnterior = arreglo[0];
            for(int i=0; i<j; i++){
                if(arreglo[i]>posicionAnterior){
                    aux=arreglo[i-1];
                    arreglo[i-1]=arreglo[i];
                    arreglo[i]=aux;
                }
                posicionAnterior=arreglo[i];
            }
        }
    }

    public static int posicionIndicada(int[] arreglo, int max, int numero){
        int i=0;
        while(i<max && numero < arreglo[i]){
            i++;
        }
        if (i<max) return i;
        return max-1;
    }

    public static void insertarNumero(int[] arreglo, int max, int numero){
        int i=posicionIndicada(arreglo, max, numero);
        Ejercicio15.corrimientoDerecha(arreglo, max, i);
        arreglo[i]=numero;
    }

}