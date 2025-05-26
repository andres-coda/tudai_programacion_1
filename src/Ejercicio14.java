/*
14. Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main: un
arreglo con las posiciones de los caracteres que son letras
vocales y otro con las posiciones que son consonantes.
*/
public class Ejercicio14 {
    public static void subMenu(int max){
        char[] arreglo = new char[max];
        ManejoArreglo.cargarArregloChar(arreglo, max);
        ManejoArreglo.mostrarArregloChar(arreglo, max);
        int[] arregloVocal = arreglosPosicionesLetras(arreglo, max, true);
        int[] arregloConsonante = arreglosPosicionesLetras(arreglo, max, false);
        System.out.println("Posiciones de vocales: ");
        Ejercicio1.mostrarArreglo(arregloVocal, newMax(arregloVocal, max));
        System.out.println("Posiciones de consonantes: ");
        Ejercicio1.mostrarArreglo(arregloConsonante, newMax(arregloConsonante, max));
        Menu.pausarConsola();
    }

    public static int[] arreglosPosicionesLetras(char[] ar, int max, boolean vocal) {
        int[] newAr= new int[max];
        int j=0;
        for(int i=0; i<max; i++){
            if(Ejercicio13.esLetra(ar[i])){
                if(vocal && Ejercicio13.esVocal(ar[i])){
                    newAr[j]=i;
                    j++;
                } else if(!vocal && !Ejercicio13.esVocal(ar[i])){
                    newAr[j]=i;
                    j++;
                }
            }
        }
        for(int i=j; i<max; i++){
            newAr[i]=-1;
        }
        return newAr;
    }

    public static int newMax(int[] ar, int max){
        int i=0;
        while (i<max && ar[i]>-1){
            i++;
        }
        return i;
    }
}
