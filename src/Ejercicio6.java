/*
 6. Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima.

 */
public class Ejercicio6 {
    public static void subMenu(int[] arreglo,int max){
        ManejoArreglo.comprobarArreglo(arreglo, max);
        Ejercicio1.mostrarArreglo(arreglo, max);
        System.out.println("El arreglo tienen "+cantidadPares(arreglo, max)+" elementos pares");
        Menu.pausarConsola();
    }

    public static int cantidadPares(int[] arreglo, int max){
        int contador=0;
        for(int i=0; i <max; i++){
            if(arreglo[i]%2==0){
                contador++;
            }
        }
        return contador;
    }
}
