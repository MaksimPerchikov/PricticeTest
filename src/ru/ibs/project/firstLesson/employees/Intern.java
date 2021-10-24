package ru.ibs.project.firstLesson.employees;

import ru.ibs.project.firstLesson.employees.Employees;

public class Intern extends Employees {
    private String direction;

    Intern(){}
    Intern(String name,Integer age,String direction){
        super(name,age);
        this.direction = direction;
    }
    public Intern(String name,Integer age){
        super(name,age);
    }
    public Intern(String name,String post){
        super(name,post);
    }

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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
