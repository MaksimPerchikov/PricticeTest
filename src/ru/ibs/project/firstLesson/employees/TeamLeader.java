package ru.ibs.project.firstLesson.employees;

import ru.ibs.project.firstLesson.employees.info.Manager;

public class TeamLeader extends Employees implements Manager {
    private Integer numberOfSubordinates;
    private String nameTeamLeader;
    private Integer ageTeamLeader;

    TeamLeader(String nameTeamLeader,Integer ageTeamLeader,Integer numberOfSubordinates){
        this.nameTeamLeader= nameTeamLeader;
        this.numberOfSubordinates = numberOfSubordinates;
        this.ageTeamLeader = ageTeamLeader;
    }
    TeamLeader(){}
    public TeamLeader(String nameTeamLeader){
        this.nameTeamLeader = nameTeamLeader;
    }

    //метод класса TeamLeader
    public Integer levelOfProfessionalism(Integer experience,Integer numberOfCompletedProjects){
        System.out.println((experience+numberOfCompletedProjects)/2);
        return null;
    }




    @Override
    public void methodFromInterfaceManager() {
        System.out.println("Я-тимлидер " +getNameTeamLeader()+" ,еще я являюсь менеджером");
    }
    public Integer getAgeTeamLeader(){
        return ageTeamLeader;
    }
    public void setAgeTeamLeader(Integer ageTeamLeader){
        this.ageTeamLeader = ageTeamLeader;
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



    public String getNameTeamLeader() {
        return nameTeamLeader;
    }

    public void setNameTeamLeader(String nameTeamLeader) {
        this.nameTeamLeader = nameTeamLeader;
    }
}
