package Ejemplo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String titulo;

        Biblioteca[] libreria = new Biblioteca[3];

        for (i = 0; i < libreria.length; i++) {
            System.out.println("Introduce título del libro n°" + (i + 1));
            titulo = sc.nextLine();
            libreria[i] = new Biblioteca(titulo);
        }
        for (i = 0; i < 3; i++) {
            System.out.println(libreria[i].getLibro());
        }
    }
}