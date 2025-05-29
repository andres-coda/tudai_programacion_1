/*
 30. Hacer un programa que reemplace de un arreglo A todas las
ocurrencias de una secuencia patrón dada en un arreglo P, por la
secuencia contenida en el arreglo R de igual tamaño.
 */
public class Ejercicio30 {
    public static void subMenu(int[] ar, int max){
        int[] arregloP= {7,1,3};
        int[] arregloR= {45, 28, 12};
        
        Ejercicio1.mostrarArreglo(ar, max);
        Ejercicio1.mostrarArreglo(arregloP, 3);
        Ejercicio1.mostrarArreglo(arregloR, 3);
        
        reemplazarSecuenciaDada(ar, arregloP, arregloR, max, 3);

        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static void reemplazarSecuencia(int[] ar, int[] sec, int fin, int pos){
        int j=0;
        for (int i=pos; i<=fin; i++){
            ar[i]=sec[j];
            j++;
        }
    }

    public static void reemplazarSecuenciaDada(int[] ar, int[] sec, int[] secNueva, int max, int maxArP){
        int fin = 0;
        while(fin<max){
            int inicio = Ejercicio23.inicioSecuencia(ar, max, fin);
            fin = Ejercicio23.finSecuencia(ar, max, inicio);
            if(Ejercicio28.compararSecuencia(ar, sec, fin, inicio, maxArP)){
                reemplazarSecuencia(ar, secNueva, fin, inicio);
            }
            fin++;
        }
    }
}
