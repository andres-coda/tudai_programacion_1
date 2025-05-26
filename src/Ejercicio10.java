/*
 10. Hacer un programa que verifique en un arreglo si tiene al
menos N números primos. N debe ser ingresado por el usuario.
Reutilizar los métodos ya desarrollados.

 */
public class Ejercicio10 {
    public static void subMenu(int[] arreglo, int max){
        ManejoArreglo.comprobarArreglo(arreglo, max);
        Ejercicio1.mostrarArreglo(arreglo, max);
        System.out.println("Ingrese la cantidad minima de números primos que supone que hay en el arreglo");
        int n=Utils.leerInt();
        if (n>cantidadDePrimos(arreglo, max)){
            System.out.println("El arreglo no llega a esa cantidad de números primos");
        } else {
            System.out.println("El arreglo tiene al menos "+n+" números primos");
        }
        Menu.pausarConsola();
    } 

    public static boolean esPrimo(int x){
        if (x<=0) return false;
        int divisor=2;
        while (divisor<x/2 && x%divisor!=0){
            divisor++;
        }
        return (divisor>=(x/2));
    }

    public static int cantidadDePrimos(int[] arreglo, int max){
        int contador=0;
        for(int i=0; i<max;i++){
            if (esPrimo(arreglo[i])){
                contador++;
            }
            System.out.println(" "+arreglo[i]+" - "+esPrimo(arreglo[i]));
        }
        System.out.println("Cantidad de primos "+contador);
        return contador;
    }
}
