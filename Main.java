import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2;

        do {
            System.out.println("Que desea realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("El resultado de la división es: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}