/*
 31. Hacer un programa que invierta el orden de la última secuencia
en un arreglo.
 */
public class Ejercicio31 {
    public static void subMenu(int[] ar, int max){                
        Ejercicio1.mostrarArreglo(ar, max);

        invertirUltimaSecuencia(ar, max);

        
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static void invertirContenidoSecuencia(int[] ar, int fin, int inicio){
        for (int i=inicio; i<((fin+1-inicio)/2)+inicio; i++){
            int aux = ar[i];
            ar[i]=ar[fin-i+inicio];
            ar[fin-i+inicio]=aux;
        }
    }

    public static void invertirUltimaSecuencia(int[]ar, int max){
        int fin= Ejercicio25.finSecuenciaInvertida(ar, max-1);
        int inicio=Ejercicio25.inicioSecuenciaInvertida(ar, fin);
        invertirContenidoSecuencia(ar, fin, inicio);
    }
}
