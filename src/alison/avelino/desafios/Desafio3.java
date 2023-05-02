package alison.avelino.desafios;

import java.util.Scanner;

public class Desafio3 {

        public static void main(String[] Args) {

            double resultadoParcial = 0;
            double resultadoFinal;
            Scanner sc = new Scanner(System.in);
            double numeroTermos = sc.nextDouble();

            for (int i = 1; i <= numeroTermos; i++) {
                //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
                resultadoParcial = resultadoParcial + (double) 1 / i;
            }

            resultadoFinal = resultadoParcial;

            //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
            System.out.println(Math.round(resultadoFinal));

        }

}
