package alison.avelino.primeirasemana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scan = new Scanner(System.in);

        int custoFabrica = 0;
        int porcentagemDistribuidor = 0;
        int PercentualImpostos = 0;
        try {
            custoFabrica = scan.nextInt();
            porcentagemDistribuidor = scan.nextInt();
            PercentualImpostos = scan.nextInt();
        }catch (Exception ex) {
            System.out.println("Valores inválidos!");
        }

        int custoConsumidor;
        int distribuidor;
        int valorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        valorImpostos = (custoFabrica * PercentualImpostos) / 100;

        custoConsumidor = CalculaCustoConsumidor(distribuidor, valorImpostos, custoFabrica);

        System.out.println(custoConsumidor);
    }
    public static int CalculaCustoConsumidor(int distribuidor, int valorImpostos, int custoFabrica){
        int custoFinal = distribuidor + valorImpostos + custoFabrica;
        return custoFinal;
    }
}
