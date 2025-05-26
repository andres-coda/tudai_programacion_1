/*
 9. Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida.
 */
public class Ejercicio9 {
    public static void subMenu(int[] arreglo, int max){
        ManejoArreglo.comprobarArreglo(arreglo, max);
        Ejercicio1.mostrarArreglo(arreglo, max);
        ordenarAscendente(arreglo, max);
        Ejercicio1.mostrarArreglo(arreglo, max);
        if(existeRepetido(arreglo, max)){
            System.out.println("Existen números repetidos en el arreglo");
        } else{
            System.out.println("No existen números repetidos en el arreglo");
        }
        Menu.pausarConsola();
    }
    public static boolean existeRepetido(int[] arreglo, int max){
        int i=0;
        int aux=arreglo[0]-1;
        while(i<max&&aux!=arreglo[i]){
            aux=arreglo[i];
            i++;
        }
        return i<max;
    }

    public static void ordenarAscendente(int[] arreglo, int max){
        int posAux=0;
        for(int j=max; j>1; j--){
            int posicionAnterior = arreglo[0];
            for(int i=0; i<j; i++){
                if(arreglo[i]<posicionAnterior){
                    posAux=arreglo[i-1];
                    arreglo[i-1]=arreglo[i];
                    arreglo[i]=posAux;
                }
                posicionAnterior=arreglo[i];
            }
        }
    }
}