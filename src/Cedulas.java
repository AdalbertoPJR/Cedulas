import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int valor = teclado.nextInt();

        System.out.println("R$" + valor);
        System.out.println(valor / 100 + " nota(s) de R$ 100,00");
        int res = valor % 100;
        System.out.println(res / 50 + " nota(s) de R$ 50,00");
        res = res % 50;
        System.out.println(res / 20 + " nota(s) de R$ 20,00");
        res = res % 20;
        System.out.println(res / 10 + " nota(s) de R$ 10,00");
        res = res % 10;
        System.out.println(res / 5 + " nota(s) de R$ 5,00");
        res = res % 5;
        System.out.println(res / 2 + " nota(s) de R$ 2,00");
        res = res % 2;
        System.out.println(res / 1 + " nota(s) de R$ 1,00");


        teclado.close();
    }
}

