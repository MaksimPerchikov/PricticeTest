package ru.ibs.project.ThirdLesson;

public class Student extends User{
    private String faculty;
   public Student(String userName,Integer age,String faculty){
       super(userName,age);
       this.faculty = faculty;
    }
    public Student(String userName,Integer age,String faculty,String post){
       super(userName,age,post);
       this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
