/*
 3. Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado.
 */
public class Ejercicio3 {
   public static void subMenu(int[] arreglo, int max){
        ManejoArreglo.cargarArreglo(arreglo, max);
        System.out.println("El arreglo tiene "+cantidadMayorPromedio(arreglo, max)+" números mayores al promedio");
        Menu.pausarConsola();
   }

   public static int cantidadMayorPromedio(int[] arreglo, int max){
        int promedio= (int)(Ejercicio2.calcularPromedio(arreglo, max));
        int contador=0;
        for(int i=0; i<max; i++){
            if (arreglo[i]>promedio){
                contador++;
            }
        }
        return contador;
   }
}
