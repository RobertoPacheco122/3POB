package app;

import java.util.Scanner;
import entities.*;

public class App {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int quantidadeAlunos;        
        
        System.out.println("===== Criação de Turma =====");
        System.out.println("\nDigite o NOME e CÓDIGO da Disciplina:");
        
        String nomeDisciplina = read.next();
        int codigoDisciplina = read.nextInt();
        Disciplina disciplina = new Disciplina(nomeDisciplina, codigoDisciplina);
        
        System.out.println("\nDigite o NOME e MATRíCULA do Professor:");
        
        String nomeProfessor = read.next();
        String matriculaProfessor = read.next();
        Professor professor = new Professor(nomeProfessor, matriculaProfessor);
        
        Turma turma = new Turma(professor, disciplina);
        
        System.out.println("\nDigite a quantidade de Alunos da turma:");
        quantidadeAlunos = read.nextInt();
        
        for(int i = 0; i < quantidadeAlunos; i++){
            System.out.printf("\nDigite o NOME e a MATRÍCULA do Aluno %d:%n", i + 1);
            String nomeAluno = read.next();
            String matriculaAluno = read.next();
            Aluno aluno = new Aluno(nomeAluno, matriculaAluno);
            turma.addStudent(aluno);
        }
        
        System.out.println("\n\n===== Exibindo dados da TURMA =====\n");
        turma.listAllData();
        read.close();
    }
}
