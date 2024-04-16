import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");

        int opcionFigura = scanner.nextInt();

        switch (opcionFigura) {
            case 1:
                calcularCirculo(scanner);
                break;
            case 2:
                calcularCuadrado(scanner);
                break;
            case 3:
                calcularTriangulo(scanner);
                break;
            case 4:
                calcularRectangulo(scanner);
                break;
            case 5:
                calcularPentagono(scanner);
                break;
            default:
                System.out.println("Por favor, seleccione una opción válida.");
        }

        scanner.close(); // Cerrar el scanner al finalizar.
    }

    public static void calcularCirculo(Scanner scanner) {
        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char opcion = scanner.next().charAt(0);

        switch (opcion) {
            case 'p':
                System.out.println("Introduzca el valor del diámetro (cm):");
                double diametro = scanner.nextDouble();
                double perimetro = Math.PI * diametro;
                System.out.printf("El valor del perímetro es: %.2f cm%n", perimetro);
                break;
            case 'a':
                System.out.println("Introduzca el valor del radio (cm):");
                double radio = scanner.nextDouble();
                double area = Math.PI * radio * radio;
                System.out.printf("El valor del área es: %.2f cm^2%n", area);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void calcularCuadrado(Scanner scanner) {
        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char opcion = scanner.next().charAt(0);

        switch (opcion) {
            case 'p':
                System.out.println("Introduzca el valor del lado del cuadrado (cm):");
                double lado = scanner.nextDouble();
                double perimetro = 4 * lado;
                System.out.printf("El valor del perímetro es: %.2f cm%n", perimetro);
                break;
            case 'a':
                System.out.println("Introduzca el valor del lado del cuadrado (cm):");
                double lado2 = scanner.nextDouble();
                double area = lado2 * lado2;
                System.out.printf("El valor del área es: %.2f cm^2%n", area);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void calcularTriangulo(Scanner scanner) {
        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char opcion = scanner.next().charAt(0);

        switch (opcion) {
            case 'p':
                System.out.println("Introduzca el valor del primer lado (cm):");
                double lado1 = scanner.nextDouble();
                System.out.println("Introduzca el valor del segundo lado (cm):");
                double lado2 = scanner.nextDouble();
                System.out.println("Introduzca el valor del tercer lado (cm):");
                double lado3 = scanner.nextDouble();
                double perimetro = lado1 + lado2 + lado3;
                System.out.printf("El valor del perímetro es: %.2f cm%n", perimetro);
                break;
            case 'a':
                System.out.println("Introduzca el valor de la base (cm):");
                double base = scanner.nextDouble();
                System.out.println("Introduzca el valor de la altura (cm):");
                double altura = scanner.nextDouble();
                double area = (base * altura) / 2;
                System.out.printf("El valor del área es: %.2f cm^2%n", area);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void calcularRectangulo(Scanner scanner) {
        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char opcion = scanner.next().charAt(0);

        switch (opcion) {
            case 'p':
                System.out.println("Introduzca el valor del lado horizontal (cm):");
                double ladoHorizontal = scanner.nextDouble();
                System.out.println("Introduzca el valor del lado vertical (cm):");
                double ladoVertical = scanner.nextDouble();
                double perimetro = 2 * (ladoHorizontal + ladoVertical);
                System.out.printf("El valor del perímetro es: %.2f cm%n", perimetro);
                break;
            case 'a':
                System.out.println("Introduzca el valor de la base (cm):");
                double base = scanner.nextDouble();
                System.out.println("Introduzca el valor de la altura (cm):");
                double altura = scanner.nextDouble();
                double area = base * altura;
                System.out.printf("El valor del área es: %.2f cm^2%n", area);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void calcularPentagono(Scanner scanner) {
        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
        char opcion = scanner.next().charAt(0);

        switch (opcion) {
            case 'p':
                System.out.println("Introduzca el valor de la longitud de los lados (cm):");
                double longitudLados = scanner.nextDouble();
                double perimetro = 5 * longitudLados;
                System.out.printf("El valor del perímetro es: %.2f cm%n", perimetro);
                break;
            case 'a':
                System.out.println("Introduzca el valor del perímetro (cm):");
                perimetro = scanner.nextDouble();
                double apotema = scanner.nextDouble();
                double area = (perimetro * apotema) / 2;
                System.out.printf("El valor del área es: %.2f cm^2%n", area);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}