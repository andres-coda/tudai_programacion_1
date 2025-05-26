/*
 24. Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor.

 */
public class Ejercicio24 {
    public static void subMenu(int[] ar, int max){
        Ejercicio1.mostrarArreglo(ar, max);

        System.out.println("Secueencia mayor inicia "+posMayorSuma(ar, max));
    
        Menu.pausarConsola();
        
    }

    public static int sumaSecuencia(int[] ar, int max, int pos){
        int suma=0;
        for(int i=pos; i<max; i++){
            suma+=ar[i];
        }
        return suma;
    }

    public static int posMayorSuma(int[] ar, int max){
        int mayor=0;
        int inicio= Ejercicio23.inicioSecuencia(ar, max, 0);
        int fin=Ejercicio23.finSecuencia(ar, max, inicio);
        int posMayor=inicio;
        while(inicio<max){            
            int actual=sumaSecuencia(ar, fin, inicio);
            if(actual>mayor){
                mayor=actual;
                posMayor=inicio;
            }
            inicio=Ejercicio23.inicioSecuencia(ar, max, fin+1);
            fin=Ejercicio23.finSecuencia(ar, max, inicio);            
        }
        return posMayor;
    }
}
