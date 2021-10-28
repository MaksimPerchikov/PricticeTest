package ru.ibs.project.ThirdLesson.template;

public abstract class AbstractTemplate {

    public String execute(){
        String str = abstractOperation();
        str = str + "\nexecute_result1\n";
        str = str +operation1();
        str = str + "execute_result2\n";
        return  str +operation2();

    }

    protected String operation1(){
        return "base result1\n";
    }
    protected String operation2(){
        return "base result2\n";
    }

    protected abstract String abstractOperation();

}
