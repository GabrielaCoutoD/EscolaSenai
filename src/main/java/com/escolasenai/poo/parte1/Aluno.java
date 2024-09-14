package com.escolasenai.poo.parte1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa{
    
    private Date dataMatricula;
    private String curso;
    private Nota notas;
    private Situacao situacao;

    private List<Nota> notasList = new ArrayList<>();

    public List<Nota> getNotesList() {
        return notasList;
    }

    public void addNote(Nota nota) {
        this.notasList.add(nota);
    }

    public static List<Aluno> alunosList = new ArrayList<Aluno>();

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Situacao getSituacao() {
        return situacao;
    }
    
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Aluno [dataMatricula=" + dataMatricula + ", curso=" + curso + ", situacao="
                + situacao + "]";
    }
    public static void registrarAluno(){
        System.out.println(" -- Registrar novo aluno -- ");
        System.out.println("Nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        Aluno.alunosList.add(aluno);
    }
    
    public static void atualizarAluno(){
        if (!Aluno.alunosList.isEmpty()) {

            System.out.println("Listar alunos: ");
            listarAlunos();
            System.out.println("Digite o número do aluno para atualização: ");
            Scanner sc = new Scanner(System.in);
            int alunoIndex = sc.nextInt() - 1;
            if (alunoIndex >= 0 && alunoIndex < Aluno.alunosList.size()) {
                Aluno alunoToUpdate = Aluno.alunosList.get(alunoIndex);
                System.out.println("Coloque o novo nome: ");
                sc.nextLine();
                String newNome = sc.nextLine();
                alunoToUpdate.setNome(newNome);
                System.out.println("Aluno atualizado com sucesso. \n");
            } else {
                System.out.println("Número de estudante inválido. \n");
            }
        }else {
            System.out.println("Não há aluno registrado.");
        }
    }
    public static void excluirAluno(){
        if (!Aluno.alunosList.isEmpty()) {

            System.out.println("Listar alunos: ");
            listarAlunos();
            System.out.println("Digite o número do aluno para exclusão: ");
            Scanner sc = new Scanner(System.in);
            int alunoIndex = sc.nextInt() - 1;
            if (alunoIndex >= 0 && alunoIndex <= Aluno.alunosList.size()) {
                Aluno.alunosList.remove(alunoIndex);
                System.out.println("Aluno excluido com sucesso. \n");
            } else {
                System.out.println("Número de estudante inválido. \n");
            }
        }else {
            System.out.println("Não há aluno registrado.");
        }
    }

    public static void listarAlunos(){
        if(!Aluno.alunosList.isEmpty()){
            System.out.println("Listar alunos: ");
            for (Aluno a : alunosList){
                System.out.println((alunosList.indexOf(a))+ "- " + a.getNome() + " / data matricula: " +
                        a.getDataMatricula() + " / email: " + a.getEmail() + " / curso: "
                        + a.getCurso());
            }
            
        }else {
            System.out.println("Não há aluno registrado.");
        }
    }
   

    public static void alimentarAluno(){
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Luan");
        aluno1.setEmail("luanG@gmail.com");
        aluno1.setCurso("Desenvolvimento de Software");
        alunosList.add(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Ana");
        aluno2.setEmail("ana@gmail.com");
        aluno2.setCurso("Desenvolvimento de Software");
        alunosList.add(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Alice");
        aluno3.setEmail("alice@gmail.com");
        aluno3.setCurso("Desenvolvimento de Software");
        alunosList.add(aluno3);
          
    }
    public static List<Aluno> getAlunosList(){
        return alunosList;
}
public static Aluno getAlunoByEmail(String email){
    for (Aluno aluno : alunosList){
        if (aluno.getEmail().equals(email)){
            return aluno;
        }
    }
    return null;
}

}





    

   