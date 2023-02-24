package ACTIVITY1;

import java.util.Scanner;
import ACTIVITY1.Alunos;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o e-mail do aluno: ");
        String email = scanner.nextLine();

        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();

        System.out.print("Digite o telefone do aluno: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o endereço do aluno: ");
        String endereco = scanner.nextLine();

        Alunos aluno = new Alunos(matricula, nome, email, curso, telefone, endereco);

        System.out.print("Digite o número de faltas do aluno: ");
        int faltas = scanner.nextInt();
        aluno.lancarFaltas(faltas);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota da prova " + i + " do aluno: ");
            double nota = scanner.nextDouble();
            aluno.lancarNota(i, nota);
        }

        String situacao = aluno.verificarAprovacao();
        System.out.println("Situação do aluno: " + situacao);

        scanner.close();
    }
}
