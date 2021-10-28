package ru.ibs.project.ThirdLesson;

public class Adapter2 implements Target{

    private final Adaptee adaptee;

    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public String request(Integer val) {
        return adaptee.specRequest(val.toString());
    }
}