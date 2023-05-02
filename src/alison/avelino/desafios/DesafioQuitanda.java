package alison.avelino.desafios;

import java.util.Scanner;

public class DesafioQuitanda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int morangos = sc.nextInt();
        int macas = sc.nextInt();

        double valorMorango;
        double valorMaca;
        double valorTotal;

        valorMorango = CalcularValorMorango(morangos);
        valorMaca = CalcularValorMaca(macas);
        valorTotal= valorMorango + valorMaca;
        valorTotal = CalcularValorTotal(morangos, macas, valorTotal);
        System.out.println(valorTotal);
    }

    public static double CalcularValorMorango(int morangos){
        return (morangos <= 5) ? morangos*2.5 : morangos*2.2;
    }
    public static double CalcularValorMaca(int macas){
        return (macas <= 5) ? macas*1.8 : macas*1.5;
    }
    public static double CalcularValorTotal(int morangos, int macas, double valorTotal){
       return  ( macas+morangos > 8) ? valorTotal*0.9 : valorTotal;
    }
}
