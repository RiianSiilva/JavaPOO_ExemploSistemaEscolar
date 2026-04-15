package Escola.Dominio;

import Escola.Classes.Disciplina;
import Escola.Classes.Professor;
import Escola.Classes.Turma;

public class AssociacaoMuitosParaMuitos {
    static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("Matemática", 80);
        Disciplina disciplina2 = new Disciplina("Português", 80);
        Disciplina disciplina3 = new Disciplina("Química", 80);
        Disciplina disciplina4 = new Disciplina("Artes", 80);

        Professor professor1 = new Professor("Name_1", 123, "Matemática", 2000);
        Professor professor2 = new Professor("Name_2", 123, "Português", 1999);
        Professor professor3 = new Professor("Name_3", 123, "Artes", 1998);
        Professor professor4 = new Professor("Name_4", 123, "Química", 1997);

        Turma turma1 = new Turma("1°B", 1);
        Turma turma2 = new Turma("2°A", 2);
        Turma turma3 = new Turma("3°C", 3);
        Turma turma4 = new Turma("4°D", 4);


        // relacao de Rian com matematica (bidimencional)
        professor1.adicionarDisciplina(disciplina1); // adicionando obj disciplina dentro de professor
        disciplina1.adicionarProfessor(professor1); // adicionando professor dento de disciplina

        // relacao Rian com portugues
        professor1.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor1);

        // relacao Diego com portugues
        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor2);

        // Criando relacionamento muitos-para-muitos entre disciplinas e turmas

        // A disciplina3 será oferecida em várias turmas
        disciplina3.adicionarTurma(turma1); //turma1 (parametro) esta sendo adicionado ao obj disciplina3
        disciplina3.adicionarTurma(turma2);
        disciplina3.adicionarTurma(turma3);
        disciplina3.adicionarTurma(turma4);

        // A turma1 cursa várias disciplinas
        turma1.adicionarDisciplina(disciplina1);
        turma1.adicionarDisciplina(disciplina2);
        turma1.adicionarDisciplina(disciplina3);
        turma1.adicionarDisciplina(disciplina4);


        professor3.adicionarTurma(turma4); // adicinando a turma no professor
        turma4.adicionarProfessor(professor3); // adicionando professor dentro da turma
        turma4.adicionarProfessor(professor1); // adicionando professor dentro da turma
        turma4.adicionarProfessor(professor4); // adicionando professor dentro da turma

        System.out.println("\nProfessor3 e sua turma");
        for (int i = 0; i < professor3.quantidadeDeTurma(); i++){
            System.out.println(professor3.getTurma(i).getSigla() + " " + professor3.getTurma(i).getAno() + "°ano");
        }

        System.out.println("\nTurma4 e seus professores");
        for (int i = 0; i < turma4.quantidadeDeProfessor(); i++){
            System.out.println(turma4.getProfessor(i).getNome());
        }

        System.out.println("\nTurma1 e suas disciplinas");
        for (int i = 0; i < turma1.quantidadeDeDisciplinas(); i++) {
            System.out.println(turma1.getDisciplina(i).getNome());
        }

        System.out.println("\nDisciplina de quimica, turmas: ");
        for (int i = 0; i < disciplina3.quantidadeDeTurma(); i++) {
            System.out.println(disciplina3.getTurma(i).getSigla() + " " + disciplina3.getTurma(i).getAno() + "°ano");
        }

        // listar as disciplinas do professor Rian
        System.out.println("\nDisciplinas do Rian");
        for (int i = 0; i < professor1.quantidadeDeDisciplinas(); i++) {
            System.out.println(professor1.getDisciplina(i).getNome()); //obj professor1 pega o objs Disciplina ent chamaos o nome da disciplina
        }

        System.out.println("\nProfessores na disciplica de Português");
        for (int i = 0; i < disciplina2.quantidadeDeProfessor(); i++) {
            System.out.println(disciplina2.getProfessor(i).getNome()); //obj disciplina2 pegar o obj Professor ent chamamos o nome do obj
        }


    }
}
