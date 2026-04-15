package Escola.Dominio;

import Escola.Classes.Aluno;
import Escola.Classes.Disciplina;
import Escola.Classes.Professor;
import Escola.Classes.Turma;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Conexoes {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Name_1", 1234, LocalDate.of(2005, 04, 12));
        Aluno aluno2 = new Aluno("Name_2", 123, LocalDate.of(2005, 04, 12));
        Aluno aluno3 = new Aluno("Name_3", 12, LocalDate.of(2005, 04, 12));

        Professor professor = new Professor("Name_Professor", 1234, "Licenciatura em exatas", 12000);

        Turma turma = new Turma("3°B", 3);

        Disciplina matematica = new Disciplina("Matematica", 60);
        Disciplina fisica = new Disciplina("Fisica", 40);
        Disciplina quimica = new Disciplina("Quimica", 40);

        // criando a conexao um para um
        aluno1.adicionarTurma(turma); // adicionando uma turma no aluno
        turma.adicionarAluno(aluno1); // adicionando um alunno a turma

        System.out.println("\nTurma " + turma.getSigla() + " " + turma.getAno() + "°ano temos o aluno:");
        for (int i = 0; i < turma.quantidadeDeAlunos(); i++) {
            System.out.println(turma.getAluno(i).getNome());
        }

        System.out.println("\nO aluno " + aluno1.getNome() + " esta nessa turma: ");
        System.out.println(aluno1.getTurma().getSigla() + " " + aluno1.getTurma().getAno() + "°ano");

        // criando uma conexao muitos para muitos
        aluno1.adicionarDisciplina(matematica);
        aluno1.adicionarDisciplina(fisica);
        aluno1.adicionarDisciplina(quimica);
        // criando uma conexao muitos para muitos
        matematica.adicionarAluno(aluno1);
        fisica.adicionarAluno(aluno2);
        quimica.adicionarAluno(aluno3);

        System.out.println("\nAs Materias que o " + aluno1.getNome() + " tem:");
        for (int i = 0; i < aluno1.quantidadeDeDisciplinas(); i++) {
            System.out.println(aluno1.getDisciplina(i).getNome() + " e Carga horaria: " + aluno1.getDisciplina(i).getCargaHoraria());
        }
        System.out.println("\nMatematica e seus devidos alunos:");
        for (int i = 0; i < matematica.quantidadeDeAlunos(); i++) {
            System.out.println("Nome do aluno: " + matematica.getAluno(i).getNome() + " RA do aluno: " + matematica.getAluno(i).getMatricula());
        }

        System.out.println("\nfisica e seus devidos alunos:");
        for (int i = 0; i < fisica.quantidadeDeAlunos(); i++) {
            System.out.println("Nome do aluno: " + fisica.getAluno(i).getNome() + " RA do aluno: " + fisica.getAluno(i).getMatricula());
        }

        System.out.println("\nQuimica e seus devidos alunos:");
        for (int i = 0; i < quimica.quantidadeDeAlunos(); i++) {
            System.out.println("Nome do aluno: " + quimica.getAluno(i).getNome() + " RA do aluno: " + quimica.getAluno(i).getMatricula());
        }

        //criando uma conexão muitos para muitos
        professor.adicionarTurma(turma); // adicionando uma turma na lista de porfessores
        turma.adicionarProfessor(professor); // adicionando um professor em uma lista de turma

        System.out.println("\nO Professor " + professor.getNome() + " aplica seu conhecimento nessa turma: ");
        for (int i = 0; i < professor.quantidadeDeTurma(); i++) {
            System.out.println(professor.getTurma(i).getSigla() + " " + professor.getTurma(i).getAno() + "°ano");
        }

        System.out.println("\nA turma " + turma.getSigla() + " " + turma.getAno() + "°ano" + " tem esses professores cadastrados");
        for (int i = 0; i < turma.quantidadeDeProfessor(); i++) {
            System.out.println(turma.getProfessor(i).getNome());

        }

        //criando uma conexão muitos para muitos
        professor.adicionarDisciplina(matematica);
        professor.adicionarDisciplina(quimica);
        professor.adicionarDisciplina(fisica);
        //criando uma conexão muitos para muitos
        matematica.adicionarProfessor(professor);
        fisica.adicionarProfessor(professor);
        quimica.adicionarProfessor(professor);

        System.out.println("\nO professor " + professor.getNome() + " leciona essas disciplinas:");
        for (int i = 0; i < professor.quantidadeDeDisciplinas(); i++) {
            System.out.println(professor.getDisciplina(i).getNome());
        }

        System.out.println("\nMatematica");
        for (int i = 0; i < matematica.quantidadeDeProfessor(); i++) {
            System.out.println(matematica.getProfessor(i).getNome());
        }

        System.out.println("\nQuimica");
        for (int i = 0; i < quimica.quantidadeDeProfessor(); i++) {
            System.out.println(quimica.getProfessor(i).getNome());
        }

        System.out.println("\nfisica");
        for (int i = 0; i < fisica.quantidadeDeProfessor(); i++) {
            System.out.println(fisica.getProfessor(i).getNome());
        }

        //criando uma conexão muitos para muitos
        turma.adicionarDisciplina(matematica);
        turma.adicionarDisciplina(fisica);
        //criando uma conexão muitos para muitos
        matematica.adicionarTurma(turma);
        fisica.adicionarTurma(turma);

        System.out.println("\nNa turma " + turma.getSigla() + " " + turma.getAno() + "°ano temos essas Disciplinas:");
        for (int i = 0; i < turma.quantidadeDeDisciplinas(); i++) {
            System.out.println(turma.getDisciplina(i).getNome());
        }

        System.out.println("\nNa disciplina  de " + matematica.getNome() + " esta presente nessa turma:");
        for (int i = 0; i < matematica.quantidadeDeTurma(); i++){
            System.out.println(matematica.getTurma(i).getSigla()+" "+matematica.getTurma(i).getAno() + "°ano");
        }

        System.out.println("\nNa disciplina  de " + fisica.getNome() + " esta presente nessa turma:");
        for (int i = 0; i < fisica.quantidadeDeTurma(); i++){
            System.out.println(fisica.getTurma(i).getSigla()+" "+fisica.getTurma(i).getAno() + "°ano");
        }


    }

}
