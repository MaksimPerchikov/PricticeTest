package ru.ibs.project.firstLesson.employees;

public class Developer extends Employees{
    private String directionOfDevelop;

    Developer(String nameEmplo, Integer ageEmplo,String directionOfDevelop) {
        super(nameEmplo, ageEmplo);
        this.directionOfDevelop = directionOfDevelop;
    }
   public Developer(String directionOfDevelop){
        this.directionOfDevelop = directionOfDevelop;
    }
    public Developer(String name,Integer age){
        super(name,age);
    }
    public Developer(String name,String post){
        super(name,post);
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

    public String getDirectionOfDevelop() {
        return directionOfDevelop;
    }

    public void setDirectionOfDevelop(String directionOfDevelop) {
        this.directionOfDevelop = directionOfDevelop;
    }
}
