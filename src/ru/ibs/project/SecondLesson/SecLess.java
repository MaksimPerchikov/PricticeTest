//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.ibs.project.SecondLesson;

import ru.ibs.project.firstLesson.employees.Employees;

public class SecLess {
    public SecLess() {
    }

    public static void main(String[] args) {
        Employees employees = new Employees() {
            private String post;
            private Integer workHours;

            public void methodFromAbstractClassEmployees() {
                this.setPost("Back");
                this.salary(this.getPost());
                this.setPost("Front");
                this.salary(this.getPost());
            }

            private void salary(String post) {
                if ("Back".equals(post)) {
                    System.out.println("какая-то зарплата");
                } else {
                    System.out.println("Error");
                }

            }

            private void numberOfWorkingHours() {
                System.out.println("N-е количество для каждого сотрудника");
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
    }
}
