package ru.ibs.project.firstHomeWork.employees;

public class Intern extends Employees{
    private String nameIntern;
    private Integer ageIntern;
    private String direction;

    Intern(String nameIntern,Integer ageIntern,String direction){
        this.nameIntern = nameIntern;
        this.ageIntern = ageIntern;
        this.direction = direction;
    }
    Intern(){}

    @Override
    public void methodFromAbstractClassEmployeesTwo() {
        super.methodFromAbstractClassEmployeesTwo();
    }

    @Override
    public void methodFromAbstractClassEmployees() {
        System.out.println("Я еще прохожу стажерскую программу..");
    }

    //метод класса Intern
    public void learningLines(String direction){
        String back = "Backand";
        String front = "Frontend";
        String analytics = "Analytics";
        if(direction.equals(back)){
            System.out.println("Срок обучения 1,5 месяца,так как я бэкенд разработчик");
        }else if(direction.equals(front)){
            System.out.println("Срок обучения 1,6 месяца,так как я фронтенд разработчик");
        }
        else if(direction.equals(analytics)) {
            System.out.println("Срок обучения 1,4 месяца,так как я аналитик");
        }else {
            System.out.println("нет такого направления!");
        }

    }



    public String getNameIntern() {
        return nameIntern;
    }

    public void setNameIntern(String nameIntern) {
        this.nameIntern = nameIntern;
    }

    public Integer getAgeIntern() {
        return ageIntern;
    }

    public void setAgeIntern(Integer ageIntern) {
        this.ageIntern = ageIntern;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
