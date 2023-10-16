package controleFluxo;

import java.security.InvalidParameterException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        // System.out.println("valores dos parametros - ParametroUm: " + parametroUm + "
        // ParametroDois: " + parametroDois);
        try {
            // chamando o método contendo a lógica de contagem
            // System.out.println("entrando no try");
            contar(parametroUm, parametroDois);

        } catch (InvalidParameterException exception) {
            System.out.println("ParametrosInvalidosException: O segundo parâmetro deve ser maior que o primeiro");
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }

    }

    static void contar(int parametroUm, int parametroDois) throws InvalidParameterException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new InvalidParameterException();
        }
        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
