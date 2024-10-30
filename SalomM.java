import java.util.Scanner;

public class SalomM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int puntos = 0;
        int numRegistro = 0; 

        // Apartado 1
        while (numRegistro < 1 || numRegistro > 499) {
            System.out.print("Número de registro del niño: ");
            numRegistro = input.nextInt();
            if (numRegistro < 1 || numRegistro > 499) {
                System.out.println("El número de registro tiene que estar entre 1 y 499");
            }
        }

        // Apartado 2
        System.out.print("¿Tienes un hermano en el colegio? (0: no / 1: sí): ");
        int hermano = input.nextInt();
        if (hermano == 1) {
            puntos = puntos + 40;
        }

        // Apartado 3
        System.out.print("¿Vives en la misma zona que el colegio? (0: no / 1: sí): ");
        int zonaColegio = input.nextInt();

        // Apartado 4
        System.out.print("¿Tu padre o madre trabaja en la misma zona que el colegio? (0: no / 1: sí): ");
        int trabajaZona = input.nextInt();
        if (zonaColegio == 1) {
            puntos = puntos + 30;
        } else if (trabajaZona == 1) {
            puntos = puntos + 20;
        }

        // Apartado 5
        System.out.print("¿Tienes alguna enfermedad o discapacidad superior al 30% o alguna enfermedad crónica? (0: no / 1: sí): ");
        int enfermedad = input.nextInt();
        if (enfermedad == 1) {
            puntos = puntos + 10;
        }

        // Apartado 6
        System.out.print("¿Tu familia es numerosa o monoparental? (0: no / 1: sí): ");
        int familiaNumerosa = input.nextInt();
        if (familiaNumerosa == 1) {
            puntos = puntos + 15;
        }

        // Apartado 7
        System.out.print("¿Tu padre, madre, tutor legal o hermano ha estado escolarizado en la escuela? (0: no / 1: sí): ");
        int escolarizado = input.nextInt();
        if (escolarizado == 1) {
            puntos = puntos + 5;
        }

        // Número registro + Puntos
        System.out.println("Número de registro: " + numRegistro);
        System.out.println("Puntuación total: " + puntos + " puntos.");
        input.close();
    }
}
