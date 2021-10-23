package ru.ibs.project.firstLesson.employees;

import ru.ibs.project.firstLesson.employees.Developer;
import ru.ibs.project.firstLesson.employees.Employees;
import ru.ibs.project.firstLesson.employees.TeamLeader;
import ru.ibs.project.firstLesson.employees.Intern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TeamLeader teamLeader1 = new TeamLeader("Tom");
        teamLeader1.methodFromAbstractClassEmployees();
        teamLeader1.methodFromInterfaceManager();
        //вызов метода класса TeamLeader
        teamLeader1.levelOfProfessionalism(4,2);
        System.out.println("==========================");

        Intern intern1 = new Intern();
        intern1.methodFromAbstractClassEmployeesTwo();
        intern1.methodFromAbstractClassEmployees();
        //вызов метода класса Intern
        intern1.learningLines("Backand");
        System.out.println("==========================");

        Developer developer1 = new Developer("Backend");
        developer1.methodFromAbstractClassEmployees();
        developer1.methodFromAbstractClassEmployeesTwo();
        //вызов метода класса Developer
        developer1.durationOfLunch();
        System.out.println("==========================");

        //вторая часть задания.Упражнения с коллекциями.
        Developer developer = new Developer("Max",22,"developer.Backand.");
        Intern intern = new Intern("Artem",24,"Frontend");
        TeamLeader teamLeader = new TeamLeader("Katy",30,3);

        Set<Employees> setEmployees = new HashSet<>();
        setEmployees.add(developer);
        setEmployees.add(intern);
        setEmployees.add(teamLeader);
        collectMethod(setEmployees);

    }
    //Вторая часть второго упражнения
    public static void collectMethod(Set<Employees> employeesSet){
        List<Object> arrayListEmployees = new ArrayList<>();
        arrayListEmployees.add(employeesSet);

    }
}
