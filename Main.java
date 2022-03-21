package Prueba_2;

import java.io.IOException;
import java.util.Scanner;

import static Prueba_2.Itunes.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion = -1;
        do {
            try {
                System.out.println("-----MENU-----"+
                        "\n0-Iniciar"+
                        "\n1-Add Song"+
                        "\n2-Review Song"+
                        "\n3-Download Song"+
                        "\n4-Songs"+
                        "\n5-Info Song"+
                        "\n6-Salir"+
                        "\nSELECCIONE OPCION: ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 0:
                        System.out.println("Inicio");
                        new Itunes();
                        break;
                    case 1:
                        System.out.println("---ADD SONG---");
                        System.out.println("Ingrese Cancion:");
                        String nombre = leer.next();
                        System.out.println("Ingrese Artista:");
                        String artista = leer.next();
                        System.out.println("Ingrese Precio:");
                        double precio = leer.nextDouble();
                        addSong(nombre, artista, precio);
                        break;
                    case 2:
                        System.out.println("---REVIEW SONG---");
                        System.out.println("Ingrese Codigo de Cancion");
                        int codigo = leer.nextInt();
                        System.out.println("Ingrese las estrellas:");
                        int estrellas = leer.nextInt();
                        reviewSong(codigo, estrellas);
                        break;
                    case 3:
                        System.out.println("---DOWNLOAD SONG---");
                        System.out.println("Ingrese el codigo de la cancion:");
                        int codigo1 = leer.nextInt();
                        System.out.println("Ingrese el nombre del cliente:");
                        String cliente = leer.next();
                        downloadSong(codigo1, cliente);
                        break;
                    case 4:
                        System.out.println("---SONGS---");
                        songs();
                        break;
                    case 5:
                        System.out.println("---INFO SONG---");
                        System.out.println("Ingrese el codigo:");
                        int codigo2 = leer.nextInt();
                        infoSong(codigo2);
                        break;
                    case 6:
                        System.out.println("Ha salido del Programa!!");
                        break;
                    default:
                        System.out.println("Opcion Invalida!!!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Opción Invalida!!!");
            }
        } while (opcion != 6);
    }
}
