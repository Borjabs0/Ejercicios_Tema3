import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int edad;
        boolean socioPadre;

        System.out.println("Ingrese su edad: ");
        edad = lector.nextInt();

        System.out.println("¿Los padres son socios? (true/false) ");
        socioPadre = lector.nextBoolean();

        lector.close();

        float cuotaBase = 500;

        // Aplicamos el descuento correspondiente
        if (edad >= 65) {
            cuotaBase = cuotaBase * 0.5;
        } else if (edad < 18 && !socioPadre) {
            cuotaBase = cuotaBase * 0.75;
        } else if (edad < 18 && socioPadre) {
            cuotaBase = cuotaBase * 0.65;
        }

        // Mostramos la cuota a abonar
        System.out.println("La cuota a abonar es de " + cuotaBase + " €");
    }
}