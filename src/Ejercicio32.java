/*
 32. Se tiene un arreglo de enteros de tamaño 20 de secuencias de
números entre 1 y 9, separadas por 0. El arreglo está precargado,
y además empieza y termina con uno o más separadores 0. Hacer
un programa que permita obtener a través de métodos la posición
de inicio y la posición de fin de la secuencia ubicada a partir de
una posición entera ingresada por el usuario. Finalmente, si
existen imprima por pantalla ambas posiciones obtenidas.
 */
public class Ejercicio32 {
    public static void subMenu(int[] ar, int max){                
        Ejercicio1.mostrarArreglo(ar, max);
        
        int posInicial=25;
        
        while (posInicial>=20 || posInicial<0){
            System.err.println("Ingrese la posición a partir de la cual desea buscar el inicio de la secuencia, debe ser un entero positivo menor a 20");
            posInicial=Utils.leerInt();          
        }

        int inicio =posInicialNumero(ar, max, posInicial);

        if(inicio<max){
            System.err.println("La siguiente secuencia empieza en "+ inicio);
            System.err.println("Y termina en: "+ Ejercicio23.finSecuencia(ar, max, inicio));
        } else {
            System.err.println("No existe secuencia nueva después de "+posInicial);
        }

        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static int posInicialNumero(int[] ar, int max, int num){
        int fin=0;
        int inicio = 0;
        if (ar[num]!=0){
            fin = Ejercicio23.finSecuencia(ar, max, num)+1;
            inicio= Ejercicio23.inicioSecuencia(ar, max, fin);
        } else {
            inicio= Ejercicio23.inicioSecuencia(ar, max, num);
        }
        return inicio;
    }
}
