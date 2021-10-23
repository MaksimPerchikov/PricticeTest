//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.ibs.project.TestBlog;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
        MyNumber myNumber = () -> {
            return 12.3D;
        };
        System.out.println(myNumber.getValue());
        myNumber = () -> {
            return 5.0D;
        };
        System.out.println(myNumber.getValue());
        myNumber = () -> {
            int counter = 1;

            int sum;
            for(sum = 0; counter < 5; ++counter) {
                sum += counter;
            }

            return (double)sum;
        };
        System.out.println(myNumber.getValue());
        MyNumberPara myNumberPara = (n, m) -> {
            return (double)(n + m);
        };
        System.out.println(myNumberPara.getValue(2, 3));
        myNumberPara = (n, m) -> {
            return n > 10 ? (double)m : (double)(m + 1);
        };
        System.out.println(myNumberPara.getValue(3, 9));
        Arrays.asList(1, 2, 4, 2, 4, 5, 6, 3, 2, 1, 2, 1).stream().forEach((element) -> {
            if (element % 2 == 0) {
                System.out.print(element + ",");
            }

        });
        System.out.println();
        System.out.println("=====================");
        List<Integer> integerList = (List)Arrays.asList(12, 3, 2, 5, 6, 3, 5, 32, 54, 6, 2, 2).stream().filter((e) -> {
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
        System.out.println(integerListSecond);
    }

    private static void func(FuncInt funcInt, String txt) {
        funcInt.doSmth(txt);
    }
}
