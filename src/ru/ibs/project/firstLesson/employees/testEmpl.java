package ru.ibs.project.firstLesson.employees;

public class testEmpl extends Employees{
    private String a;

    testEmpl(String nameEmplo, Integer ageEmplo) {
        super(nameEmplo, ageEmplo);
    }


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
