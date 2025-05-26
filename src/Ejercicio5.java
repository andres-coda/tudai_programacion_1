/*
 5. Hacer un programa que dado un arreglo de caracteres de tamaño
MAX que se encuentra cargado, invierta el orden del contenido.
 */
public class Ejercicio5 {
    public static void subMenu(int[] arreglo, int max){
        ManejoArreglo.comprobarArreglo(arreglo, max);
        Ejercicio1.mostrarArreglo(arreglo, max);
        invertirContenidoArreglo(arreglo, max);
        System.out.println("");
        System.out.println("Arreglo invertido");
        Ejercicio1.mostrarArreglo(arreglo, max);
        Menu.pausarConsola();
    }
    
    public static void invertirContenidoArreglo(int[] arreglo, int max){
        int aux=0;
        for (int i=0; i<max/2; i++){
            aux = arreglo[i];
            arreglo[i]=arreglo[max-1-i];
            arreglo[max-1-i]=aux;
        }
    }
}
