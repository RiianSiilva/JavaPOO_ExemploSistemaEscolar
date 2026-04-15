package Escola.Classes;
import java.util.ArrayList;

public class Professor extends Pessoas {
    private String formacaoAcademica;
    private double salario;

    private ArrayList<Turma> turmas; // Um professor pode ter VARIAS turmas
    private ArrayList<Disciplina> disciplinas; // Um professor pode ter VARIAS disciplinas

    public Professor(String nome, int matricula, String formacaoAcademica, double salario){
        super(nome, matricula);
        this.formacaoAcademica = formacaoAcademica;
        this.salario = salario;
        disciplinas = new ArrayList<Disciplina>();
        turmas = new ArrayList<Turma>();
    }
    public void imprimir(){
        System.out.println("Nome do Professor: " + this.getNome());
        System.out.println("Matricula do Professor: " + this.getMatricula());
        System.out.println("Formação academica: " + this.formacaoAcademica);
        System.out.println("Salario: " + salario);
    }

    public void adicionarTurma(Turma turma){
        turmas.add(turma);
    }

    public int quantidadeDeTurma(){
        return turmas.size();
    }

    public void excluirTurma(Turma turma){
        turmas.remove(turma);
    }

    public Turma getTurma(int posicao){
        return turmas.get(posicao);
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina); // adicionando uma disciplina no professor
    }

    public int quantidadeDeDisciplinas(){
        return disciplinas.size(); // pegando o tamanho da lista
    }

    public void excluirDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina); // deletando informacoes da lista
    }

    public Disciplina getDisciplina(int posicao){
        return disciplinas.get(posicao); // pega o indice do arrayList retornando o valor do mesmo
    }

    public void aplicarAvaliacao(){

    }

    public String getFormacaoAcademica() {

        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {

        this.formacaoAcademica = formacaoAcademica;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }
}
