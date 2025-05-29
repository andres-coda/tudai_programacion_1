/*
 27. Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero.
 */
public class Ejercicio27 {
    public static void subMenu(int[] ar, int max){
        Ejercicio1.mostrarArreglo(ar, max);
        
        System.out.println("Ingrese la cantidad de la secuencia que desea eliminar ");
        int cantEliminar=Utils.leerInt();
        
        eliminarSecuenciaCantidad(ar,max, cantEliminar);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
        
    }

    public static void eliminarSecuencia(int[]ar, int fin, int inicio, int max){
        for(int j=0; j<fin-inicio+1; j++){
            Ejercicio16.corrimientoIzquierda(ar, max, inicio);
        }
    }

    public static void eliminarSecuenciaCantidad(int[]ar, int max, int n){
        int fin=0;
        int inicio=0;
        while(fin<max){
            inicio=Ejercicio23.inicioSecuencia(ar, max, fin);
            fin=Ejercicio23.finSecuencia(ar, max, inicio);
            if((fin+1-inicio)==n){
                eliminarSecuencia(ar, fin, inicio, max);
                fin=inicio;
            } 
            fin++;
        }
    }

    // ----------------------

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

   /* public static void eliminarSecuencia(int[]ar,int max,int pos){
        for(int i=pos; i<max; i++){
            ar[i]=0;
        }
    }

    

    public static void eliminarSecuenciasCantidad(int[]ar, int maxPos, int[] arCantPos, int cantEliminar){
        for(int i=0; i<maxPos; i=i+2){
            if(arCantPos[i]==cantEliminar){
                eliminarSecuencia(ar, arCantPos[i+1]+arCantPos[i], arCantPos[i+1], maxPos);
            }
        }
    }
        */
}
