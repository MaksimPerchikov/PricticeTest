package ru.ibs.project.ThirdLesson;

public class Adapter1 extends Adaptee implements Target {


    @Override
    public String request(Integer val) {
        return this.specRequest(val.toString());
    }
}
