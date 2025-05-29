public class Menu {
    private static final int MAX = 20;
    private static final int[] ARREGLOSECUENCIA = { 0, 8, 8, 4, 0, 0, 8, 2, 0, 7, 1, 3, 0, 7, 9, 0, 4, 6, 5,0};
    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        int nuMenu = -1;
        while (nuMenu!=0) {  
            limpiarConsola();           
            System.out.println("------------------------------------------------");
            System.out.println("--                                            --");
            System.out.println("------------- Trabajo Práctico n° 5 ------------");
            System.out.println("--                                            --");
            System.out.println("--  1) Cargar arreglo                         --");
            System.out.println("--  2) Calcular promedio                      --");
            System.out.println("--  3) Mayor que el promedio                  --");
            System.out.println("--  4) Buscar elemento                        --");
            System.out.println("--  5) Invertir arreglo                       --");
            System.out.println("--  6) Contar pares                           --");
            System.out.println("--  7) Modificación especifica                --");
            System.out.println("--  8) ¿Esta ordenado ascendente?             --");
            System.out.println("--  9) ¿Hay repetidos?                        --");
            System.out.println("-- 10) Cantidad de n° primos                  --");
            System.out.println("-- 11) Existen todos                          --");
            System.out.println("-- 12) Sumatoria de posiciones                --");
            System.out.println("-- 13) Vocales y consonantes                  --");
            System.out.println("-- 14) Posiciones vocal y pos. consonantes    --");
            System.out.println("-- 15) Corrimiento derecha                    --");
            System.out.println("-- 16) Corrimiento izquierda                  --");
            System.out.println("-- 17) Número inicial                         --");
            System.out.println("-- 18) Eliminar elemento                      --");
            System.out.println("-- 19) Eliminar todas las concurrencias       --");
            System.out.println("-- 21) Incertar numero ordenado               --");
            System.out.println("-- 22) Eliminar todos los n° pares            --");
            System.out.println("--                                            --");
            System.out.println("------------------  Secuencia ------------------");
            System.out.println("-- 23) Inicio y fin de secuencia              --");
            System.out.println("-- 24) Inicio mayor secuencia                 --");
            System.out.println("-- 25) Inicio y fin de anteultima secuencia   --");
            System.out.println("-- 26) Inicio y fin de mayor secuencia        --");
            System.out.println("-- 27) Eliminar sec por cantidad de elementos --");
            System.out.println("-- 28) Eliminar sec coincidentes              --");
            System.out.println("-- 29) Eliminar sec de orden descendente      --");
            System.out.println("-- 30) Reemplazar sec coincidentes            --");
            System.out.println("-- 31) Invertir la ultima secuencia           --");
            System.out.println("-- 32) Primera secuencia a partir de posición --");
            System.out.println("-- 33) Copia en nuevo arreglo sec continuas   --");
            System.out.println("--  0) Salir                                  --");
            System.out.println("--                                            --");
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.print("-- Ingresa un número: ");
            nuMenu=Utils.leerInt();
            seleccionMenu(nuMenu, arreglo);
        }

    }

    private static void seleccionMenu(int nuMenu, int[] arreglo){
        limpiarConsola();
        switch (nuMenu) {
            case 1 -> Ejercicio1.submenu(arreglo,MAX);
            case 2 -> Ejercicio2.subMenu(arreglo,MAX);
            case 3 -> Ejercicio3.subMenu(arreglo,MAX);
            case 4 -> Ejercicio4.subMenu(arreglo,MAX);
            case 5 -> Ejercicio5.subMenu(arreglo,MAX);
            case 6 -> Ejercicio6.subMenu(arreglo,MAX);
            case 7 -> Ejercicio7.subMenu(arreglo,MAX);
            case 8 -> Ejercicio8.subMenu(arreglo,MAX);
            case 9 -> Ejercicio9.subMenu(arreglo,MAX);
            case 10 -> Ejercicio10.subMenu(arreglo,MAX);
            case 11 -> Ejercicio11.subMenu(arreglo,MAX);
            case 12 -> Ejercicio12.subMenu(arreglo,MAX);
            case 13 -> Ejercicio13.subMenu(MAX);
            case 14 -> Ejercicio14.subMenu(MAX);
            case 15 -> Ejercicio15.subMenu(arreglo, MAX);
            case 16 -> Ejercicio16.subMenu(arreglo, MAX);
            case 17 -> Ejercicio17.subMenu(arreglo, MAX);
            case 18 -> Ejercicio18.subMenu(arreglo, MAX);
            case 19 -> Ejercicio19.subMenu(arreglo, MAX);
            case 21 -> Ejercicio21.subMenu(arreglo, MAX);
            case 22 -> Ejercicio22.subMenu(arreglo, MAX);
            case 23 -> Ejercicio23.subMenu(ARREGLOSECUENCIA, MAX);
            case 24 -> Ejercicio24.subMenu(ARREGLOSECUENCIA, MAX);
            case 25 -> Ejercicio25.subMenu(ARREGLOSECUENCIA, MAX);
            case 26 -> Ejercicio26.subMenu(ARREGLOSECUENCIA, MAX);
            case 27 -> Ejercicio27.subMenu(ARREGLOSECUENCIA, MAX);
            case 28 -> Ejercicio28.subMenu(ARREGLOSECUENCIA, MAX);
            case 29 -> Ejercicio29.subMenu(ARREGLOSECUENCIA, MAX);
            case 30 -> Ejercicio30.subMenu(ARREGLOSECUENCIA, MAX);
            case 31 -> Ejercicio31.subMenu(ARREGLOSECUENCIA, MAX);
            case 32 -> Ejercicio32.subMenu(ARREGLOSECUENCIA, MAX);
            case 33 -> Ejercicio33.subMenu(ARREGLOSECUENCIA, MAX);
            case 40 -> EjercicioClase.subMenu();
            default -> System.out.println("Finalizó el programa");
        }
    }

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pausarConsola(){
        System.out.println("");
        System.out.println("Presione cualquier caracter para continuar...");
        char x = Utils.leerChar();
    }
}
