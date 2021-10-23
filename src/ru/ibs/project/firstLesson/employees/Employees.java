package ru.ibs.project.firstLesson.employees;

public abstract class Employees {
    private String nameEmplo;
    private Integer ageEmplo;

    Employees(String nameEmplo,Integer ageEmplo){
        this.nameEmplo = nameEmplo;
        this.ageEmplo = ageEmplo;
    }
    public Employees(){}
    Employees(String nameEmplo){
        this.nameEmplo = nameEmplo;
    }

    public String getNameEmplo() {
        return nameEmplo;
    }

    public void setNameEmplo(String nameEmplo) {
        this.nameEmplo = nameEmplo;
    }

    public int getAgeEmplo() {
        return ageEmplo;
    }

    public void setAgeEmplo(int ageEmplo) {
        this.ageEmplo = ageEmplo;
    }
    public void methodFromAbstractClassEmployees(){
        System.out.println("Я являюсь сотрудником IBS.");
    }
    public void methodFromAbstractClassEmployeesTwo(){
        System.out.println("Я ЕЩЕ НЕ являюсь сотрудником IBS.");
    }
}
