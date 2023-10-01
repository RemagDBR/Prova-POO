package questao_3;

public class Disciplina {
    private double[] notas;
    private int quantidadeAlunos;
    private int alunosReprovados;

    public Disciplina(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
        this.notas = new double[quantidadeAlunos];
        this.alunosReprovados = 0;
    }

    public void insereNotas(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        } else {
            for (int i = 0; i < quantidadeAlunos; i++) {
                if (notas[i] == 0) {
                    notas[i] = nota;
                    if (nota < 4) {
                        alunosReprovados++;
                    }
                    break;
                }
            }
        }
    }

    public double media() {
        double soma = 0;
        int count = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (notas[i] != 0) {
                soma += notas[i];
                count++;
            }
        }
        if (count == 0) {
            return 0; // Evita divisão por zero
        }
        return soma / count;
    }

    public double media(double valor) {
        double soma = 0;
        int count = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (notas[i] != 0 && notas[i] > valor) {
                soma += notas[i];
                count++;
            }
        }
        if (count == 0) {
            return 0; // Evita divisão por zero
        }
        return soma / count;
    }

    public int getAlunosReprovados() {
        return alunosReprovados;
    }
}
