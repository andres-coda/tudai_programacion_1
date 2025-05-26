/*
 28. Hacer un programa que elimine de un arreglo todas las
ocurrencias de una secuencia patrón dada por otro arreglo.
 */
public class Ejercicio28 {
    public static void subMenu(int[] ar, int max){
        int[] arCantPos = new int[max];
        int[] secEliminar= new int[max];
        Ejercicio1.mostrarArreglo(ar, max);

        int maxPos=Ejercicio27.cantPosSecuencia(ar, max, arCantPos);

        cargarSecuenciaMax(secEliminar, max);

        eliminarSecuenciaCoincidente(ar, secEliminar, arCantPos, maxPos);

        Ejercicio1.mostrarArreglo(arCantPos, maxPos);

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

    public static boolean compararSecuencia(int[]ar, int sec[], int max, int pos){
        int i=pos;
        int j=0;
        int maxSec=Ejercicio23.finSecuencia(sec, max, 0)+1;
        while(i<max && max==maxSec && sec[j]==ar[i]){
            i++;
            j++;
        }
        return !(i<max);
    }

    public static void eliminarSecuenciaCoincidente(int[]ar, int[]sec, int[] arPos, int maxPos){
        for(int i=0; i<maxPos; i++){
            if (compararSecuencia(ar, sec, arPos[i]+arPos[i+1], arPos[i+1])){
                Ejercicio27.eliminarSecuencia(ar, arPos[i+1]+arPos[i], arPos[i+1]);
            }
        }
    }
}
