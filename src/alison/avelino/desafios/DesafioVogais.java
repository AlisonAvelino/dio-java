package alison.avelino.desafios;

import java.util.Scanner;

public class DesafioVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toLowerCase();

        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};

        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String strItem : strSplit) {
            for (char vogal : arrVogais) {
                if (strItem.contains(String.valueOf(vogal)))
                    quantVogais++;
            }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}

