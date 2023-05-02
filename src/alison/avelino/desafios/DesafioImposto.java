package alison.avelino.desafios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
    try {
        double renda = leitor.nextDouble();
        double imposto = CalcularImposto(renda);

        System.out.printf(imposto == 0.0 ? "Isento" : "R$ %.2f%n", imposto);
        leitor.close();
    }catch (InputMismatchException e){
        System.out.println("Valor inválido");
    }

    }

    static double CalcularImposto(double renda){
        double impostoCalculado;

        if (renda <= 2000.0) {
            impostoCalculado = 0.0;
        } else if (renda <= 3000.0) {
            impostoCalculado = (renda - 2000.0) * 0.08;
        } else if (renda <= 4500.0) {
            impostoCalculado = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            impostoCalculado = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        return impostoCalculado;
    }
}
