/*
 27. Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero.
 */
public class Ejercicio27 {
    public static void subMenu(int[] ar, int max){
        int[] arCantPos= new int[max];
        Ejercicio1.mostrarArreglo(ar, max);
        int newMax=cantPosSecuencia(ar, max, arCantPos);
        Ejercicio1.mostrarArreglo(arCantPos, newMax);
        
        System.out.println("Ingrese la cantidad de la secuencia que desea eliminar ");
        int cantEliminar=Utils.leerInt();
        
        eliminarSecuenciasCantidad(ar, newMax, arCantPos, cantEliminar);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
        
    }

    public static int cantPosSecuencia(int[] ar, int max, int[] arCantPos){
        int inicio=Ejercicio23.inicioSecuencia(ar, max, 0);
        int fin=Ejercicio23.finSecuencia(ar, max, inicio);
        int i=0;
        while(inicio<max){
            arCantPos[i]=fin-inicio+1;
            i++;
            arCantPos[i]=inicio;
            i++;
            inicio=Ejercicio23.inicioSecuencia(ar, max, fin+1);
            fin=Ejercicio23.finSecuencia(ar, max, inicio);
        }
        return i;
    }

    public static void eliminarSecuencia(int[]ar,int max,int pos){
        for(int i=pos; i<max; i++){
            ar[i]=0;
        }
    }

    public static void eliminarSecuenciasCantidad(int[]ar, int maxPos, int[] arCantPos, int cantEliminar){
        for(int i=0; i<maxPos; i=i+2){
            if(arCantPos[i]==cantEliminar){
                eliminarSecuencia(ar, arCantPos[i+1]+arCantPos[i], arCantPos[i+1]);
            }
        }
    }
}
