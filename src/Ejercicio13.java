/*
 13. Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main dos
arreglos: un arreglo con los caracteres que son letras vocales y
otro con los que son consonantes.
 */

 public class Ejercicio13 {
    public static void subMenu(int max){
        char[] arreglo = new char[max];
        ManejoArreglo.cargarArregloChar(arreglo, max);
        ManejoArreglo.mostrarArregloChar(arreglo, max);

        char[] arregloVocal = crearArregloChar(arreglo, max, true);
        char[] arregloConsonante = crearArregloChar(arreglo, max, false);

        System.out.println("Arreglo consonantes: ");
        ManejoArreglo.mostrarArregloChar(arregloConsonante, max);
        System.out.println("Arreglo vocales: ");
        ManejoArreglo.mostrarArregloChar(arregloVocal, max);
        Menu.pausarConsola();
    }

    public static boolean esLetra(char caracter){
        return ((caracter>= 'A' && caracter <= 'Z') || (caracter>= 'a' && caracter <= 'z'));
    }

    public static boolean esVocal(char caracter){
        boolean vocal = switch (caracter) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
        return vocal;
    }

    public static char[] crearArregloChar(char[] ar, int max, boolean vocal){
        char[] newAr= new char[max];
        int j=0;
        for(int i=0; i<max; i++){
            if(esLetra(ar[i])){
                if(vocal && esVocal(ar[i])){
                    newAr[j]=ar[i];
                    j++;
                } else if(!vocal && !esVocal(ar[i])){
                    newAr[j]=ar[i];
                    j++;
                }
            }
        }
        for(int i=j; i<max; i++){
            newAr[i]=' ';
        }
        return newAr;
    }
 }