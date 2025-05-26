/*
 16. Implementar un método que realice un corrimiento a izquierda
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición.

 */
public class Ejercicio16 {
    public static void subMenu(int[] ar, int max){
        ManejoArreglo.comprobarArreglo(ar, max);
        Ejercicio9.ordenarAscendente(ar, max);
        Ejercicio1.mostrarArreglo(ar, max);
        System.out.println("Ingrese la posición a partir de la cual debe haber corrimiento");
        int posicion = Utils.leerInt();
        while (Ejercicio15.compobarPosicion(posicion, max)) { 
            posicion=Utils.leerInt(); 
        }

        corrimientoIzquierda(ar, max, posicion);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

        public static void corrimientoIzquierda(int[] ar, int max, int pos){
        for(int i=pos; i<max-1; i++){
            ar[i]=ar[i+1];
        }
    }
}
