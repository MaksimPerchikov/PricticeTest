package ru.ibs.project.ThirdLesson;

import ru.ibs.project.ThirdLesson.template.TemplateImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Max",22,"RF","?");
        Student student1 = new Student("Art",24,"EK","elder");
        Student student2 = new Student("Ken",22,"RF","?");
        Student student3 = new Student("Bob",40,"EK","?");

        List<User> users = new ArrayList<>();
        users.add(student);
        users.add(student1);
        users.add(student2);
        users.add(student3);

        List<User> end = method(users);
        //System.out.println(end);

        method2(end);
    }
    public static List<User> method(List<User> users){
        return users.stream()
                .filter( element -> element.getPost().equals("?"))
                .collect(Collectors.toList());
    }
    public static void method2(List<User> users){
       users.stream()
                .map(element -> element.getUserName())
                .forEach(System.out::println);


    }
}
