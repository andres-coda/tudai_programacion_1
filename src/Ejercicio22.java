/*
 22. Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10.
 */
public class Ejercicio22 {
    public static void subMenu(int[] ar, int max){
        ManejoArreglo.comprobarArreglo(ar, max);
        Ejercicio1.mostrarArreglo(ar, max);
        eliminarPar(ar, max);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
        
    }

    public static void eliminarPar(int[] ar, int max){
        boolean primera=true;
        for(int i=max-1; i>=0; i--){
            if(ar[i]%2==0){
                Ejercicio16.corrimientoIzquierda(ar, max, i);
                if(primera){
                    ar[max-1]=0;
                }
            }
        }
    }
}
