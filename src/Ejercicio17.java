/*
 17. Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra cargado, solicite al usuario un número entero
y lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada.
 */
public class Ejercicio17 {
    public static void subMenu(int[] ar, int max){
        ManejoArreglo.comprobarArreglo(ar, max);
        Ejercicio1.mostrarArreglo(ar, max);

        System.out.println("Ingrese un nuevo número:");
        int numero = Utils.leerInt();

        numeroInicial(ar, max, numero);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static void numeroInicial(int[] ar, int max, int numero){
        Ejercicio15.corrimientoDerecha(ar, max,0);
        ar[0]=numero;
    }
}
