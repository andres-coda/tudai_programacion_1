public class Menu {
    private static final int MAX = 20;
    private static final int[] ARREGLOSECUENCIA = { 0, 1, 5, 2, 0, 0, 3, 8, 0, 12, 15, 8, 0, 7, 21, 0, 0, 4, 0,0};
    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        int nuMenu = -1;
        while (nuMenu!=0) {  
            limpiarConsola();           
            System.out.println("------------------------------------------------");
            System.out.println("--                                            --");
            System.out.println("------------- Trabajo Práctico n° 5 ------------");
            System.out.println("--                                            --");
            System.out.println("--  1) Ejercicio 1 - Cargar arreglo           --");
            System.out.println("--  2) Ejercicio 2 - Calcular promedio        --");
            System.out.println("--  3) Ejercicio 3 - Mayor que el promedio    --");
            System.out.println("--  4) Ejercicio 4 - Buscar elemento          --");
            System.out.println("--  5) Ejercicio 5 - Invertir arreglo         --");
            System.out.println("--  6) Ejercicio 6 - Contar pares             --");
            System.out.println("--  7) Ejercicio 7 - Modificación especifica  --");
            System.out.println("--  8) Ejercicio 8 - ¿Esta ordenado asc?      --");
            System.out.println("--  9) Ejercicio 9 - ¿Hay repetidos?          --");
            System.out.println("-- 10) Ejercicio 10 - Cantidad de n° primos   --");
            System.out.println("-- 11) Ejercicio 11 - Existen todos           --");
            System.out.println("-- 12) Ejercicio 12 - Sumatoria de posiciones --");
            System.out.println("-- 13) Ejercicio 13 - Vocales y consonantes   --");
            System.out.println("-- 14) Ejercicio 14 - Posiciones vocal y cons --");
            System.out.println("-- 15) Ejercicio 15 - Corrimiento derecha     --");
            System.out.println("-- 16) Ejercicio 16 - Corrimiento izquierda   --");
            System.out.println("-- 17) Ejercicio 17 - Número inicial          --");
            System.out.println("-- 18) Ejercicio 18 - Eliminar elemento       --");
            System.out.println("-- 19) Ejercicio 19 - Eliminar todas concurre --");
            System.out.println("-- 21) Ejercicio 21 - Incertar numero ordenad --");
            System.out.println("-- 22) Ejercicio 22 - Eliminar todos pares    --");
            System.out.println("-- 22) Ejercicio 22 - Eliminar todas concurre --");
            System.out.println("------------------  Secuencia ------------------");
            System.out.println("-- 23) Ejercicio 23 - Inicio y fin            --");
            System.out.println("-- 24) Ejercicio 24 - Inicio mayor secuencia  --");
            System.out.println("-- 25) Ejercicio 25 - Anteultima inicio fin   --");
            System.out.println("-- 26) Ejercicio 26 - Inicio y fin mayor secu --");
            System.out.println("-- 27) Ejercicio 27 - Eliminar sec de cantida --");
            System.out.println("-- 28) Ejercicio 28 - Eliminar sec coincident --");
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
            case 30 -> EjercicioClase.subMenu();
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
