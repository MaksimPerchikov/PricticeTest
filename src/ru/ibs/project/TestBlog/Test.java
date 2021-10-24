

package ru.ibs.project.TestBlog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Monitoring security = new Monitoring() {
            public void monitoringTheSystem() {
                System.out.println("Безопасность включена.");
            }
        };
        Monitoring monitoring = new Monitoring() {
            public void monitoringTheSystem() {
                System.out.println("Все процессы находятся в норме.");
            }
        };
        security.monitoringTheSystem();
        monitoring.monitoringTheSystem();
        Monitoring security2 = new Monitoring() {
            @Override
            public void monitoringTheSystem() {
                System.out.println("Security2");
            }

        };
        security2.monitoringTheSystem();

        MyNumbers myNumber;

        myNumber = (n,m) ->{
            int sum = n+m;
            if(sum >10){
                return sum;
            }
            else
            return m;
        };
        System.out.println(myNumber.mathematicsOperation(1,6));

        OneString oneString;

        /*List<Integer> integerList = Arrays.asList(2,4,6,3,87,98)
                .stream()
                .filter(f -> f%2 == 0).collect(Collectors.toList());
        System.out.println(integerList);*/

       /* System.out.println();
        System.out.println("=====================");
        List<Integer> integerList = (List)Arrays.asList(12, 3, 2, 5, 6, 3, 5, 32, 54, 6, 2, 2)

                .stream()
                .filter((e) -> {
            Integer x2 = e * 2;
            return x2 % 2 == 0;
        }).collect(Collectors.toList());
        System.out.println(integerList);


        System.out.println();
        System.out.println("=====================");
        func(Methods::first, "Gg");
        func(Methods::second, "not gg");


        Map<String, Integer> integerListSecond = (Map)Arrays.asList(32, 4, 2, 67, 65, 435, 654456, 345, 3245, 99, 12, 3).stream().sorted((o1, o2) -> {
            return String.valueOf(o1).compareTo(String.valueOf(o2));
        }).collect(Collectors.toMap(String::valueOf, (e) -> {
            return e;
        }));
        System.out.println(integerListSecond);*/
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6)
        .stream()
                .filter(element ->element %2 == 0)
                .collect(Collectors.toList());
        System.out.println(integerList);
        System.out.println("=====================");

        List<String> stringList = Arrays.asList("a","b","c")
                .stream()
                .filter(element -> {
                    return element.equals("b");
                })
                .collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("=====================");


        /*Methods.TestInternal


        Methods methods = new Methods();
        Methods.TestInternal testInternal = methods.new TestInternal();
        testInternal.name("Max");*/

        List<Pair> integerListNewExample = Arrays.asList(2,3,4,2,3,6,54,4)
                .stream()
                .filter(element -> element%2 == 0)
                .map(element -> new Pair<String,Integer>(String.valueOf(element),element))
                .collect(Collectors.toList());
        System.out.println(integerListNewExample);


    }

    public static List<Integer> methodForListIn(List<Integer> integerList){
        return integerList.stream()
                .filter(elements -> elements.equals(3))
                .collect(Collectors.toList());
    }

    private static void func(FuncInt funcInt, String txt) {
        funcInt.doSmth(txt);
    }
}
