package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        // analisarCandidato(1900.0);
        // analisarCandidato(2000);
        // analisarCandidato(2200.0);
        // selecaoCandidatos();
        imprimindoSelecionados();
    }

    static void imprimindoSelecionados() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO" };

        System.out.println("Imprimindo a lista de candidatos informando o indice do array");

        for (int index = 0; index < candidatos.length; index++) {
            System.out.println("O candidato de n " + (index + 1) + " é " + candidatos[index]);
        }
        // Forma abreviada de interação: for each
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELLA", "DANIELA",
                "JORGE", "FERNANDA" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Soliticou este valor de salario: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
