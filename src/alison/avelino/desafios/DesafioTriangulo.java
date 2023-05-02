package alison.avelino.desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            double ladoA = sc.nextDouble();
            double ladoB = sc.nextDouble();
            double ladoC = sc.nextDouble();
            boolean triangulo = false;


        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            triangulo = true;
        }

        if (triangulo) {
            double perimetro = CalcularPerimetro(ladoA,ladoB,ladoC);
            System.out.printf("Perimetro = %.1f",perimetro);
        } else {
            double area = CalcularArea(ladoA, ladoB,ladoC);
            System.out.printf("Area = %.1f", area);
        }
        sc.close();

        }catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        }
    }
    static double CalcularPerimetro(double ladoA, double ladoB, double ladoC){
        return ladoA + ladoB + ladoC;
    }

    static double CalcularArea(double ladoA, double ladoB, double ladoC){
        return ((ladoA + ladoB) * ladoC) / 2;
    }
}
