package ru.ibs.project.TestBlog;

public class Methods {

    public Methods() {
    }

    public static void first(String txt) {
        System.out.println("do first with = " + txt);
    }

    public static void second(String txt) {
        System.out.println("do second with = " + txt);
    }

    /*public class TestInternal{
        public String name(String name){
            return name;
    }*/
    public static class TestInternalStatic{
        public String nameFromStatic(String name){
            return name;
        }
    }
}

