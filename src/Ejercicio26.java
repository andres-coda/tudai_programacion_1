/*
 26. Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño.
 */
public class Ejercicio26 {
    public static void subMenu(int[] ar, int max){
        Ejercicio1.mostrarArreglo(ar, max);

        System.out.println("Secueencia mayor inicia en la posición "+Ejercicio24.posMayorSuma(ar, max));
        System.out.println("Secueencia mayor termina en la posición "+posFinMayor(ar, max));
    
        Menu.pausarConsola();
    }

    public static int posFinMayor(int[]ar, int max){
        int inicio=Ejercicio24.posMayorSuma(ar, max);
        return Ejercicio23.finSecuencia(ar, max, inicio);
    }
}
