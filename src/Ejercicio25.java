/*
 25. Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros.
 */
public class Ejercicio25 {
    public static void subMenu(int[] ar, int max){
        final int[] arPosiciones= new int[max];
        Ejercicio1.mostrarArreglo(ar, max);
                
        int maxPos = posicionesSecuenciaMax(ar, max, arPosiciones);
        
        if(maxPos>4){
            System.out.println("La anteultima secueencia inicia en la posición "+arPosiciones[maxPos-4]);
            System.out.println("La anteultima secueencia termina en la posición "+arPosiciones[maxPos-3]);
        } else {
            System.out.println("Hay solo una secuencia, que es la primera y la última, no existe anteúltima secuencia");  
        }

        System.out.println("Arreglo posiciones: ");
        Ejercicio1.mostrarArreglo(arPosiciones, maxPos);
        Menu.pausarConsola();        
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
