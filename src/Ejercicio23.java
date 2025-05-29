/*
 23. Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros.
 */

public class Ejercicio23 {
    public static void subMenu(int[] ar, int max){
        Ejercicio1.mostrarArreglo(ar, max);

        int inicio=inicioSecuencia(ar, max, 0);

        System.out.println("Inicio primera secuencia "+inicio);
        System.out.println("Fin de primera secuencia "+finSecuencia(ar, max, inicio));
       
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
        
    }

    public static int inicioSecuencia(int[] ar, int max, int pos){
        int i=pos;
        while(i<max && ar[i]==0){
            i++;
        }
        return i;
    } 

    public static int finSecuencia(int[] ar, int max, int pos){
        int i=pos;
        while(i<max && ar[i]!=0){
            i++;
        }
        return i-1;
    } 
}
