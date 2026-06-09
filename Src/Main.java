import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        String archivo = "estudiante.txt";

        do {
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    try {
                        FileWriter write = new FileWriter(archivo, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(write);

                        System.out.print("Nombre del estudiante: ");
                        String nombre = sc.nextLine();

                        bufferedWriter.write(nombre);
                        bufferedWriter.newLine();
                        bufferedWriter.close();

                        System.out.println("Estudiante agregado.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        FileReader read = new FileReader(archivo);
                        BufferedReader buffer = new BufferedReader(read);

                        String linea;

                        while ((linea = buffer.readLine()) != null) {
                            System.out.println(linea);
                        }

                        buffer.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}