/*
 25. Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros.
 */
public class Ejercicio25 {
    public static void subMenu(int[] ar, int max){
        Ejercicio1.mostrarArreglo(ar, max);
        int inicio =anteUltimaSecuenciasInicial(ar, max);
        System.err.println("El inicio de la anteúltima secuencia es: "+ inicio);
        System.err.println("El final de la anteúltima secuencia es: "+ Ejercicio23.finSecuencia(ar, max, inicio));
        Menu.pausarConsola();        
    }

    // recorrer el arreglo al reves. Segunda secuencia. 

    public static int anteUltimaSecuenciasInicial(int[] ar, int max) {
        int pos=max;
        for (int i=0; i<2; i++){
            pos=finSecuenciaInvertida(ar, pos-1);     
            pos=inicioSecuenciaInvertida(ar, pos);
        }
        return pos;
    }

    public static int inicioSecuenciaInvertida(int[] ar, int pos){
        int i=pos;
        while(i>0 && ar[i]!=0){
            i--;
        }
        return i+1;
    }

    public static int finSecuenciaInvertida(int[] ar, int pos){
        int i=pos;
        while(i>0 && ar[i]==0){
            i--;
        }
        return i;
    }



    public static int posicionesSecuenciaMax(int[] ar, int max, int[] arPos){
        int inicio=Ejercicio23.inicioSecuencia(ar, max, 0);
        int fin=Ejercicio23.finSecuencia(ar, max, inicio);
        int i=0;
        while(inicio<max){
            arPos[i]=inicio;
            i++;
            arPos[i]=fin;
            i++;
            inicio=Ejercicio23.inicioSecuencia(ar, max, fin+1);
            fin=Ejercicio23.finSecuencia(ar, max, inicio);
        }
        return i;
    }

}
