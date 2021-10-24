package ru.ibs.project.SecondLesson;
import ru.ibs.project.firstLesson.employees.Developer;
import ru.ibs.project.firstLesson.employees.Employees;
import ru.ibs.project.firstLesson.employees.Intern;
import ru.ibs.project.firstLesson.employees.TeamLeader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecLess {
    public static void main(String[] args) {
        Employees employees = new Employees() {
            private String post;
            private Integer workHours;

            public void methodFromAbstractClassEmployees() {
                setPost("Back");
                salary(getPost());
                setPost("Front");
                salary(getPost());

                setWorkHours(8);
                numberOfWorkingHours(getWorkHours());
            }

            private void salary(String post) {
                if ("Back".equals(post)) {
                    System.out.println("какая-то зарплата");
                } else {
                    System.out.println("Error");
                }
            }

            private void numberOfWorkingHours(Integer hours) {
                System.out.println(hours + " часов для каждого сотрудника");
            }

            public String getPost() {
                return this.post;
            }

            public void setPost(String post) {
                this.post = post;
            }

            public Integer getWorkHours() {
                return this.workHours;
            }

            public void setWorkHours(Integer workHours) {
                this.workHours = workHours;
            }
        };
        employees.methodFromAbstractClassEmployees();


        //Вторая часть задания
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

        //собираю новый список
        List<Employees> listDeveloper = filterByPost(listEmployees);
        printList(listDeveloper);
    }
    //фильтрация по одному полю.
    public static List<Employees> filterByPost(List<Employees> employeesList){
        return employeesList.stream()
                .filter(post -> post.getPost().equals("Intern"))
                .collect(Collectors.toList());
    }
    //просто вывод списка
    public static void printList(List<Employees> employeesList){
        System.out.println(employeesList);
    }
}




