package Escola.Dominio;

import Escola.Classes.Aluno;
import Escola.Classes.Turma;
import java.time.LocalDate;

public class AssociacaoUmParaUm {
    static void main(String[] args) {
        Turma turma1 = new Turma("1°B",5); // criando uma turma

        Aluno aluno = new Aluno("Name_aluno1", 763023, LocalDate.of(2005, 04, 12));
        aluno.adicionarTurma(turma1); // adicionando um aluno ---> turma 'um para um'
        turma1.adicionarAluno(aluno); // adicionando uma turma ---> aluno 'um para muitos'

        Aluno aluno2 = new Aluno("Name_Aluno2", 123, LocalDate.of(2005, 04, 12));
        aluno2.adicionarTurma(turma1); // adicionando um aluno ---> turma 'um para um'
        turma1.adicionarAluno(aluno2);// adicionando uma turma ---> aluno 'um para muitos'

        aluno.imprimir();
        System.out.println("A turma dele é: " + turma1.getSigla() + " do "  + turma1.getAno() + "° ano ");

        System.out.println("-----------------");
        System.out.println("Alunos da turma");
        for (int i = 0 ; i < turma1.quantidadeDeAlunos(); i++ ){
            System.out.println(turma1.getAluno(i).getNome());
            System.out.println(turma1.getAluno(i).getMatricula());

        }

    }
}
