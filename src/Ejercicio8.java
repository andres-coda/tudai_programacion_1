/*
 8. Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente.

 */
public class Ejercicio8 {
    public static void subMenu(int[] arreglo, int max){
        ManejoArreglo.comprobarArreglo(arreglo, max);
        if(siAscendente(arreglo, max)){
            System.out.println("El arreglo esta ordenado de forma ascendente");
        } else {
            System.out.println("El arreglo no esta ordenado de forma ascendente"); 
        }
        Menu.pausarConsola();
    }

    public static boolean siAscendente(int[] arreglo, int max){
        int i=0;
        int posicionAnterior=-99999999;
        while(i<max && arreglo[i]>=posicionAnterior){
            posicionAnterior=arreglo[i];
            i++;
        }
        return i>=max;
    }
}
