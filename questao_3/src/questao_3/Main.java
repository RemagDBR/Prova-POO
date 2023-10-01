package questao_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        Disciplina disciplina = new Disciplina(quantidadeAlunos);

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            disciplina.insereNotas(nota);
        }

        System.out.println("Média de todas as notas: " + disciplina.media());

        System.out.print("Informe um valor para calcular a média das notas acima desse valor: ");
        double valor = scanner.nextDouble();
        System.out.println("Média das notas acima de " + valor + ": " + disciplina.media(valor));

        System.out.println("Quantidade de alunos reprovados: " + disciplina.getAlunosReprovados());
    }
}

