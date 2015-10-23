package hundirlaflota;
import java.util.Scanner;
public class HundirLaFlota {
    public static void main(String[] args) {
        //variables
        boolean ganaUsuario1 = false, ganaUsuario2 = false;
        int[][] vectorMapaUsuario1 = new int[5][5];
        int filaUsuario1, columnaUsuario1, filaUsuario2, columnaUsuario2, tiraUsuario1Columna, tiraUsuario1Fila, tiraUsuario2Columna, tiraUsuario2Fila;
        int[][] vectorMapaUsuario2 = new int[5][5];
        //obj
        Scanner sc = new Scanner(System.in);
        //entrada
        System.out.println("VAMOS A JUGAR A HUNDIR LA FLOTA (barcos de un solo punto)");
        System.out.println();
        System.out.println("Introduce tus coordenadas para colocar tu barco: ");
        filaUsuario1 = sc.nextInt();
        columnaUsuario1 = sc.nextInt();
        System.out.println("Introduce tus coordenadas para colocar tu barco: ");
        filaUsuario2 = sc.nextInt();
        columnaUsuario2 = sc.nextInt();
        //operaciones
        //cargando mapas
        //mapa del usuario 1
        System.out.println("");
        System.out.println("MAPA DEL USUARIO 1");
        for (int i = 0; i < vectorMapaUsuario1.length; i++) {
            System.out.println("");
            for (int j = 0; j < vectorMapaUsuario1.length; j++) {
                if (i == columnaUsuario1) {
                    if (j == filaUsuario1) {
                        vectorMapaUsuario1[i][j] = 1;
                    }
                } else {
                    vectorMapaUsuario1[i][j] = 0;
                }
                System.out.print(vectorMapaUsuario1[i][j]);
            }
        }
        System.out.println();
        //mapa del usuario 2
        System.out.println();
        System.out.println("MAPA DEL USUARIO 2");
        for (int i = 0; i < vectorMapaUsuario2.length; i++) {
            System.out.println("");
            for (int j = 0; j < vectorMapaUsuario2.length; j++) {
                if (i == columnaUsuario2) {
                    if (j == filaUsuario2) {
                        vectorMapaUsuario2[i][j] = 1;
                    }
                } else {
                    vectorMapaUsuario2[i][j] = 0;
                }
                System.out.print(vectorMapaUsuario2[i][j]);
            }
        }
        System.out.println("");
        while (ganaUsuario1 == false && ganaUsuario2 == false) {
            System.out.println("");
            System.out.println("Usuario 1 introduce tus coordenadas para el disparo: ");
            tiraUsuario1Columna = sc.nextInt();
            tiraUsuario1Fila = sc.nextInt();
            if (tiraUsuario1Columna == columnaUsuario2 && tiraUsuario1Fila == filaUsuario2) {
                ganaUsuario1 = true;
            } else {
                System.out.println("AGUA!");
                System.out.println();
                System.out.println("Usuario 2 introduce tus coordenadas para el disparo: ");
                System.out.println();
                tiraUsuario2Columna = sc.nextInt();
                tiraUsuario2Fila = sc.nextInt();
                if (tiraUsuario2Columna == columnaUsuario1 && tiraUsuario2Fila == filaUsuario1) {
                    ganaUsuario2 = true;
                } else {
                    System.out.println("");
                    System.out.println("AGUA");
                }
            }
        }
        //salida
        if (ganaUsuario1 == true) {
            System.out.println("GANA EL USUARIO1!");
        }
        if (ganaUsuario2 == true) {
            System.out.println("GANA EL USUARIO2!");
        }
    }
}
