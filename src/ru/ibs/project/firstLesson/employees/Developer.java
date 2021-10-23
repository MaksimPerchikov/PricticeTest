package ru.ibs.project.firstLesson.employees;

public class Developer extends Employees{

    private String nameDeveloper;
    private String directionOfDevelop;
    private Integer ageDeveloper;

    Developer(String nameDeveloper,Integer ageDeveloper,String directionOfDevelop){
        this.ageDeveloper = ageDeveloper;
        this.nameDeveloper=nameDeveloper;
        this.directionOfDevelop = directionOfDevelop;
    }
    Developer(){}
    Developer(String directionOfDevelop){
        this.directionOfDevelop = directionOfDevelop;
    }

    //метод класса Developer
    public void durationOfLunch(){
        System.out.println("Длительность обеда у всех одинакова,1 час.");
    }

    @Override
    public void methodFromAbstractClassEmployees() {
        super.methodFromAbstractClassEmployees();
    }

    @Override
    public void methodFromAbstractClassEmployeesTwo() {
        System.out.println("Я "+directionOfDevelop +" разработчик");
    }


    public String getNameDeveloper() {
        return nameDeveloper;
    }

    public void setNameDeveloper(String nameDeveloper) {
        this.nameDeveloper = nameDeveloper;
    }

    public String getDirectionOfDevelop() {
        return directionOfDevelop;
    }

    public void setDirectionOfDevelop(String directionOfDevelop) {
        this.directionOfDevelop = directionOfDevelop;
    }

    public Integer getAgeDeveloper() {
        return ageDeveloper;
    }

    public void setAgeDeveloper(Integer ageDeveloper) {
        this.ageDeveloper = ageDeveloper;
    }
}
