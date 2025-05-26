/*
 15. Implementar un método que realice un corrimiento a derecha
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición.

 */
public class Ejercicio15 {
    public static void subMenu(int[] ar, int max){
        ManejoArreglo.comprobarArreglo(ar, max);
        Ejercicio1.mostrarArreglo(ar, max);
        System.out.println("Ingrese la posición a partir de la cual debe haber corrimiento");
        int posicion = Utils.leerInt();
        while (compobarPosicion(posicion, max)) { 
            posicion=Utils.leerInt(); 
        }

        corrimientoDerecha(ar, max, posicion);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static boolean compobarPosicion(int pos, int max){
        if (pos <0 || pos>max-1){
            System.out.println("La posición no puede ser menor a 0 o mayor a "+(max-1));
        } 
        return (pos <0 || pos>max-1);
    }

    public static void corrimientoDerecha(int[] ar, int max, int pos){
        for(int i=max-1; i>pos; i--){
            ar[i]=ar[i-1];
        }
    }
}
