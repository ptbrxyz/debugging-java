package br.com.dio.debbuging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        //int media = calculaMediaDaTurma(alunos, scan);
        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
        //System.out.printf("Média da turma %d", media);
    }
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
    //public static int calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        //int soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            //int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }

}
// Paula