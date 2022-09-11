package entities;

import java.util.ArrayList;

public class Turma {
    private Professor teacher;
    private Disciplina subject;
    private ArrayList<Aluno> students = new ArrayList();
    
    //Constructor
    public Turma(Professor professor, Disciplina disciplina){
        this.teacher = professor;
        this.subject = disciplina;
    }
    
    //Getters and Setters
    public Professor getTeacher() {
        return teacher;
    }

    public void setTeacher(Professor teacher) {
        this.teacher = teacher;
    }

    public Disciplina getSubject() {
        return subject;
    }

    public void setSubject(Disciplina subject) {
        this.subject = subject;
    }
    
    //Methods
    public void addStudent(Aluno student){
        this.students.add(student);
    }
    
    public void listAllStudents(){
        for(int i = 0; i < students.size(); i++){
            System.out.printf("Nome Aluno %d: %s%n", i + 1, students.get(i).getName());
            System.out.printf("Matrícula Aluno %d: %s%n%n", i + 1, students.get(i).getRegistration());
        }
    }
    
    public void listAllData(){
        System.out.printf("Subject Name and Code: %s / %d %n", subject.getName(), subject.getCode());
        System.out.printf("Teacher Name and Registration: %s / %s %n", teacher.getName(), teacher.getRegistration());
        System.out.println("Students List:");
        listAllStudents();
    }
}