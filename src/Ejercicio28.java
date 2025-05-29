/*
 28. Hacer un programa que elimine de un arreglo todas las
ocurrencias de una secuencia patrón dada por otro arreglo.
 */
public class Ejercicio28 {
    public static void subMenu(int[] ar, int max){
        int[] secEliminar= {7,9};
        final int MAXSEC=2;
        Ejercicio1.mostrarArreglo(ar, max);
        Ejercicio1.mostrarArreglo(secEliminar, 2);

        eliminarSecuenciaCoincidente(ar, secEliminar, max, MAXSEC);

        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static void cargarSecuenciaMax(int[] ar, int max){
        int numSecuencia=1;
        int i=0;
        while(i<max && numSecuencia!=0){
            System.out.println("Ingrese el número "+i+" de la secuencia que desea eliminar; Ingrese 0 para terminar secuencia");
            numSecuencia=Utils.leerInt(); 
            ar[i]=numSecuencia;
            i++;
        }
    }

    public static boolean compararSecuencia(int[]ar, int sec[], int max, int pos, int maxSec){
        int i=pos;
        int j=0;
        while(i<max && max-pos+1==maxSec && sec[j]==ar[i]){
            i++;
            j++;
        }
        return !(i<max);
    }

    public static void eliminarSecuenciaCoincidente(int[]ar, int[]sec, int max, int maxSec){
        int fin=0;
        while(fin<max) {
            int inicio=Ejercicio23.inicioSecuencia(ar, max, fin);
            fin= Ejercicio23.finSecuencia(ar, max, inicio);
            if(compararSecuencia(ar, sec, fin, inicio, maxSec)){
                Ejercicio27.eliminarSecuencia(ar, fin, inicio, max);
                fin=inicio;
            } 
            fin++;
        }
    }
}
