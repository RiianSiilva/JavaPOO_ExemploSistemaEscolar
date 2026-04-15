package Escola.Classes;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    private ArrayList<Turma> turmas; // uma disciplina pode ter VARIAS turmas
    private ArrayList<Professor> professores; // Uma disciplina pode ter VARIOS professores
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria =  cargaHoraria;
        professores = new ArrayList<Professor>();
        turmas = new ArrayList<Turma>();
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public int quantidadeDeAlunos(){
        return alunos.size();
    }

    public void excluirAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public Aluno getAluno(int posicao){
        return alunos.get(posicao);
    }

    public void adicionarTurma(Turma turma){
        turmas.add(turma); // adicionando uma turma na lista disciplina
    }

    public int quantidadeDeTurma(){
        return turmas.size(); // mostrar a quantidade de turmas em cada disciplina
    }

    public void excluirTurma(Turma turma){
        turmas.remove(turma); // excluir uma turma da lista disciplina
    }

    public Turma getTurma(int posicao){
        return turmas.get(posicao); //  retorna o valor da turma presente na lista disciplina
    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor); // adiciono um professor na lista
    }

    public int quantidadeDeProfessor(){
        return professores.size(); // eu vejo o tamanho da lista
    }

    public void excluirProfessor(Professor professor){
        professores.remove(professor); // remove um professor da lista
    }

    public Professor getProfessor(int posicao){
        return professores.get(posicao); // eu retorno o valor de um professor que esta presente na list
    }


    public void imprimir(){

        if(cargaHoraria > 0){
            System.out.println("Nome da materia: " + this.nome + " Carga horaria: " + this.cargaHoraria);
        }else {
            System.out.println("Defina uma valor positivo");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 0){
            this.cargaHoraria = cargaHoraria;
        }
    }
}
