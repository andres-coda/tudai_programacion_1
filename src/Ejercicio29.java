/*
29. Hacer un programa que elimine de un arreglo todas las
secuencias que tienen orden descendente entre sus elementos.
*/ 
public class Ejercicio29{
    public static void subMenu(int[] ar, int max){
        Ejercicio1.mostrarArreglo(ar, max);

        eliminarSecDescendentes(ar, max);

        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static boolean ordenDecsendente(int[] ar, int max, int pos){
        int i=pos;
        while(i<max && ar[i]>=ar[i+1]){
            i++;
        }
        return (pos<max-1 && !(i<max));
    }

    public static void eliminarSecDescendentes (int[] ar, int max){
        int fin=0;
        while(fin<max){
            int inicio = Ejercicio23.inicioSecuencia(ar, max, fin);
            fin = Ejercicio23.finSecuencia(ar, max, inicio);
            if (ordenDecsendente(ar, fin+1, inicio)){
                Ejercicio27.eliminarSecuencia(ar,  fin, inicio, max);
                fin=inicio;
            }
            fin++;
        }
    }
}
