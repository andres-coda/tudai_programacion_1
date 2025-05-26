/*
 4. Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.

 */
public class Ejercicio4 {
    public static void subMenu(int[]arreglo, int max){
        ManejoArreglo.comprobarArreglo(arreglo, max);
        System.out.println("Ingrese el elemento a buscar");
        int elemento= Utils.leerInt();
        buscarElemento(arreglo, max, elemento);
        Menu.pausarConsola();
    }

    public static void buscarElemento(int[]arreglo, int max, int buscar){
        boolean encontrado = false;
        for(int i=0; i<max; i++){
            if (arreglo[i]==buscar){
                System.out.println("El elemento fue encontrado en la posición "+i);
                encontrado=true;
            }
        }
        if (!encontrado){
            System.out.println("El elemento no fue encontrado");
        }
    }
}
