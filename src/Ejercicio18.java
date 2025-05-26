/*
 18. Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición).
 */
public class Ejercicio18 {
   public static void subMenu(int[] ar, int max){
        ManejoArreglo.comprobarArreglo(ar, max);
        Ejercicio1.mostrarArreglo(ar, max);

        System.out.println("Ingrese el número a eliminar:");
        int numero = Utils.leerInt();

        numeroEliminar(ar, max, numero);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static int posicionElemento(int[] ar, int max, int numero){
        int i=0;
        while(i<max && ar[i]!=numero){
            i++;
        }
        if (i<max){
            return i;
        } else {
            return -1;
        }
    }
    
    public static void numeroEliminar(int[] ar, int max, int numero){
        int pos=posicionElemento(ar, max, numero);
        if(pos==-1){
            System.out.println("El número no fue encontrado en el arreglo");
        } else{
            Ejercicio16.corrimientoIzquierda(ar, max,pos);
        }
    }
}
