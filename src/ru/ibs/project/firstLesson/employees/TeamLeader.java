package ru.ibs.project.firstLesson.employees;

import ru.ibs.project.firstLesson.employees.info.Manager;

public class TeamLeader extends Employees implements Manager {
    private Integer numberOfSubordinates;

    TeamLeader(){}
    TeamLeader(String name,Integer age,Integer numberOfSubordinates){
        super(name,age);
        this.numberOfSubordinates = numberOfSubordinates;
    }
    TeamLeader(String name){
        super(name);
    }

    //метод класса TeamLeader
    public Integer levelOfProfessionalism(Integer experience,Integer numberOfCompletedProjects){
        System.out.println((experience+numberOfCompletedProjects)/2);
        return null;
    }
    @Override
    public void methodFromInterfaceManager() {
        System.out.println("Я-тимлидер " +getNameEmplo()+" ,еще я являюсь менеджером");
    }


    @Override
    public void methodFromAbstractClassEmployees() {
        super.methodFromAbstractClassEmployees();
    }

    public Integer getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(Integer numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
