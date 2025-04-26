import java.util.ArrayList;
import java.util.Scanner;
public class GestorDeTareas {
public static void main(String[] args) {
ArrayList<String> tareas = new ArrayList<>();
Scanner sc = new Scanner(System.in);
int opcion;
do {
    System.out.println("1. Agregar tarea\n2. Listar tareas\n3. Salir");
    try {
    opcion = sc.nextInt();
    } catch (Exception e) {
    System.out.println("Por favor ingresa un número.");
    sc.nextLine();
    opcion = 0;
    }
    switch (opcion) {
    case 1:
    System.out.println("Escribe la tarea:");
    sc.nextLine();
    String tarea = sc.nextLine();
    tareas.add(tarea);
    break;
    case 2:
    System.out.println("Tareas: " + tareas);
    break;
    }
    } while (opcion != 3);
    sc.close();
    }
    }
    