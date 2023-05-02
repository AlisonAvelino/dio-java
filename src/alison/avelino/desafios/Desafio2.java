package alison.avelino.desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) throws IOException {
        try {
            Scanner leitor = new Scanner(System.in);
            int cont = 0;
            double media = 0;
            double valor;

            //TODO: Implemente as condições adequadas para obter a quantidade
            //de valores positivos e a média dos valores positivos:
            for (int i = 0; i < 6; i++) {
                valor = leitor.nextDouble();

                if (valor > 0) {
                    cont ++;
                    media += valor;
                }
            }

            media /= cont;
            System.out.println(cont + " valores positivos");
            System.out.println(String.format("%.1f", media));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
