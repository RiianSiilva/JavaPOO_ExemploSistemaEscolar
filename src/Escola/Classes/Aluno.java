package Escola.Classes;
import java.time.LocalDate;
import java.util.ArrayList;


public class Aluno extends Pessoas { // herança, o aluno é uma extencao da Classe Pessoa

    private LocalDate dataDeNascimento; // atributo
    private Turma turma; //Todo aluno tem uma turma, associando aluno com turma

    private ArrayList<Disciplina> disciplinas;

    public Aluno(String nome, int matricula, LocalDate dataDeNascimento){ // Construtor, obrigando que o aluno tenha essas caracteristicas

        super(nome, matricula); // o super funciona para mandar/pegar o valor desses atributos na pasta Pessoas
        this.dataDeNascimento = dataDeNascimento;
        disciplinas = new ArrayList<Disciplina>();
    }


    public void realizarAvaliacao(){} // comportamento

    public void imprimir(){ // comportamento
        System.out.println("Nome do Aluno: " + this.getNome());
        System.out.println("RA do Aluno: " + this.getMatricula());
        System.out.println("Data de Nascimento do Aluno: " + this.dataDeNascimento);

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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void adicionarTurma(Turma turma) {
        this.turma = turma;
    }
}
