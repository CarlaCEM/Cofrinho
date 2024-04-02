package cofrinho;

import java.util.Scanner;

public class Cofrinho {

    public static void main(String[] args) {
        Scanner cv = new Scanner(System.in);
        int opcao;
        Lista lista = new Lista();

        System.out.println("Menu");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Deseja converter a moeda para real?");
        System.out.println("0 - Encerrar");
        opcao = cv.nextInt();

        Moeda coin;
        int tipo;
        double valor, input;

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    tipo = 0;
                    while (tipo > 2 || tipo <= 0) {
                        System.out.println("1 - Dolar");
                        System.out.println("2 - Euro");
                        tipo = cv.nextInt();
                    }
                    System.out.println("Qual o valor?");
                    valor = cv.nextDouble();

                    System.out.println("Taxa de Cambio? ");
                    input = cv.nextDouble();

                    coin = null;
                    if (tipo == 1) {
                        coin = new DolarConv(valor, input);
                    } else {
                        System.out.println("Valor convertido?");
                        coin = new EuroConv(valor, input);
                    }
                    lista.adicionar(coin);
                    break;
                case 2:
                    tipo = 0;
                    while (tipo > 2 || tipo <= 0) {
                        System.out.println("1 - Dolar");
                        System.out.println("2 - Euro");
                        tipo = cv.nextInt();
                    }
                    System.out.println("Qual o valor?");
                    valor = cv.nextDouble();

                    System.out.println("Taxa de Cambio? ");
                    input = cv.nextDouble();

                    coin = null;
                    if (tipo == 1) {
                        coin = new DolarConv(valor, input);
                    } else {
                        System.out.println("Valor convertido?");
                        coin = new EuroConv(valor, input);
                    }
                    lista.remover(coin);
                    break;
                case 3:
                    lista.listar();
                    break;
                case 4:
                    tipo = 0;
                    while (tipo > 2 || tipo <= 0) {
                        System.out.println("1 - Dolar");
                        System.out.println("2 - Euro");
                        tipo = cv.nextInt();
                    }
                    System.out.println("Qual o valor?");
                    valor = cv.nextDouble();

                    coin = null;
                    if (tipo == 1) {
                        double real = Conversor.convertDollarsToReal(valor);
                        System.out.println(real);
                    }
                    if (tipo == 2) {
                        double real = Conversor.convertEuroToReal(valor);
                        System.out.println(real);
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            System.out.println("Menu");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Deseja converter a moeda para real?");
            System.out.println("0 - Encerrar");
            opcao = cv.nextInt();
        }

    }
}
