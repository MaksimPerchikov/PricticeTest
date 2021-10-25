package ru.ibs.project.SecondLesson;

import ru.ibs.project.firstLesson.employees.Developer;
import ru.ibs.project.firstLesson.employees.Employees;
import ru.ibs.project.firstLesson.employees.Intern;
import ru.ibs.project.firstLesson.employees.TeamLeader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestClassSecLess {
    public static void main(String[] args) {
        Employees employees = new Employees() {
            private String post;
            private Integer number;
            @Override
            public void methodFromAbstractClassEmployees() {
                setPost("Back");
                setNumber(1);
                showSalary(getPost(),getNumber());
            }

            public void showSalary(String post, Integer number){
                if(post.equals("Back")){
                    System.out.println(getNumber()+"какую-то зп платят бекам");
                }else System.out.println(getNumber()+"какую-то зп платят front");
            }
            @Override
            public String getPost() {
                return post;
            }
            @Override
            public void setPost(String post) {
                this.post = post;
            }
            public Integer getNumber() {
                return number;
            }
            public void setNumber(Integer number) {
                this.number = number;
            }
        };employees.methodFromAbstractClassEmployees();

        Developer developerFirst = new Developer("DeveloperFirstName", "Developer");
        Developer developerSecond = new Developer("DeveloperSecondName", "Developer");
        Intern internFirst = new Intern("InternFirstName", "Intern");
        Intern internSecond = new Intern("InternSecondName", "Intern");
        TeamLeader teamLeaderFirst = new TeamLeader("TeamLeaderFirstName", "TeamLeader");
        TeamLeader teamLeaderSecond = new TeamLeader("TeamLeaderSecondName", "TeamLeader");

        List<Employees> listEmployees = new ArrayList<>();
        listEmployees.add(developerFirst);
        listEmployees.add(developerSecond);
        listEmployees.add(internFirst);
        listEmployees.add(internSecond);
        listEmployees.add(teamLeaderFirst);
        listEmployees.add(teamLeaderSecond);

        List<Employees> internListByEqualse = strListEmplByEqualse(listEmployees);
        printColl(internListByEqualse);
        List<Employees> internListByInstanceof = strListEmplByInstanceof(listEmployees);
        printColl(internListByInstanceof);

        Developer developerOld1 = new Developer("Mark",89);
        Intern internYoung = new Intern("Alisa", 22);
        Developer developerOld2 = new Developer("Ken",66);
        Intern internOld = new Intern("Nalaliya", 56);
        List<Employees> ageAndNameEmployees = new ArrayList<>();
        ageAndNameEmployees.add(internOld);
        ageAndNameEmployees.add(internYoung);
        ageAndNameEmployees.add(developerOld2);
        ageAndNameEmployees.add(developerOld1);


        List<Employees> newListAgeEmployees = filterByAge(ageAndNameEmployees);
        printColl(newListAgeEmployees);

        //сортировка по возрасту
        List<Employees> employeesListSortedByAge = sortedBuAge(ageAndNameEmployees);
        printColl(employeesListSortedByAge);

        showNameEmployees(ageAndNameEmployees);

    }
    public static void showNameEmployees(List<Employees> ageEmployees){
        ageEmployees.stream()
                .map(e -> e.getNameEmplo())
                .forEach(System.out::println);
    }
    public static List<Employees> sortedBuAge(List<Employees> ageEmployees){
        return ageEmployees.stream()
                .sorted(Comparator.comparing(Employees ::getAgeEmplo))
                .collect(Collectors.toList());
    }

    public static List<Employees> filterByAge(List<Employees> ageEmployees){
        return ageEmployees.stream()
                .filter(element -> (element.getAgeEmplo() > 50))
                .collect(Collectors.toList());
    }
    public static List<Employees> strListEmplByEqualse(List<Employees> employeesList){
        return employeesList.stream()
                .filter(element -> element.getPost().equals("Intern"))
                .collect(Collectors.toList());
    }
    public static List<Employees> strListEmplByInstanceof(List<Employees> employeesList){
        return employeesList.stream()
                .filter(element -> element instanceof Developer)
                .collect(Collectors.toList());
    }
    public static void printColl(List<Employees> employeesList){
        System.out.println(employeesList);
    }
}
