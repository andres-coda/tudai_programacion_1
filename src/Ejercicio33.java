/*
 33. Hacer un programa que dado el arreglo definido y precargado,
y un número entero ingresado por el usuario, copie de forma
continua las secuencias de tamaño igual al número ingresado en
otro arreglo de iguales características e inicializado con 0. La
copia en este último arreglo deben comenzar desde el principio
del mismo.
 */

public class Ejercicio33 {
     public static void subMenu(int[] ar, int max){
        int[] newAr= new int[max];
        Ejercicio1.mostrarArreglo(ar, max);
        
        System.err.println("Ingresa el tamaño de las secuencias a copiar");
        int num=Utils.leerInt();

        copiarTodaSecuencia(ar, newAr, max, num);
        Ejercicio1.mostrarArreglo(newAr, max);
        Ejercicio1.mostrarArreglo(ar, max);
        Menu.pausarConsola();
    }

    public static void inicializarAr(int[]ar, int max){
        for(int i=0; i<max; i++){
            ar[i]=0;
        }
    }

    public static void copiarSecuencia(int[] ar, int[] newAr, int inicio, int fin, int pos){
        for(int i=inicio; i<=fin; i++){
            newAr[i-inicio+pos]=ar[i];
        }
    }

    public static void copiarTodaSecuencia(int[]ar, int[] newAr, int max, int num){
        int fin=0;
        int j=0;
        while(fin<max){
            int inicio=Ejercicio23.inicioSecuencia(ar, max, fin);
            fin=Ejercicio23.finSecuencia(ar, max, inicio);
            if((fin+1-inicio)==num){
                copiarSecuencia(ar, newAr, inicio, fin, j);
                j+=num;
            } 
            fin++;
        }
    }
}
