package Escola.Classes;
import java.util.ArrayList;

public class Turma  {
    private String sigla;
    private int ano;

    private ArrayList<Professor> professores; // Uma turma pode ter VARIOS professores
    private ArrayList<Disciplina> disciplinas; // Toda turma pode ter VARIAS disciplinas
    private ArrayList<Aluno> alunos; //Toda turma pode ter UM ou VARIOS alunos

    public Turma(String sigla, int ano){
        this.sigla = sigla;
        this.ano = ano;
        alunos = new ArrayList<Aluno>();
        professores = new ArrayList<Professor>();
        disciplinas = new ArrayList<Disciplina>();

    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }

    public int quantidadeDeProfessor(){
        return professores.size();
    }

    public void excluirProfessor(Professor professor){
        professores.remove(professor);
    }

    public Professor getProfessor(int posicao){
        return professores.get(posicao);
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public int quantidadeDeDisciplinas(){
        return disciplinas.size();
    }

    public void excluirDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public Disciplina getDisciplina(int posicao){
        return disciplinas.get(posicao);
    }


    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno); // .add é um metodo do array liste qeu vai adicionar algo na lista
    }

    public int quantidadeDeAlunos(){
        return alunos.size(); // .size é um metodo do array liste que restorna o tamanho da lista
    }

    public void excluirAluno(Aluno aluno){ // para remover um aluno, preciso saber qual aluno é
        alunos.remove(aluno); // .remove um metodo do array list que remove algo da lista
    }

    public Aluno getAluno(int posicao ){
        return alunos.get(posicao); // o metodo get retorna um valor em uma determinada posicao da lista
    }

    public String getSigla() {

        return sigla;
    }
    public void setSigla(String sigla) {

        this.sigla = sigla;
    }

    public int getAno() {

        return ano;
    }
    public void setAno(int ano) {

        this.ano = ano;
    }
}
