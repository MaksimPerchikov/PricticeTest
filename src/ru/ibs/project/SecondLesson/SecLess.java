package ru.ibs.project.SecondLesson;
import ru.ibs.project.firstLesson.employees.Employees;
import ru.ibs.project.firstLesson.employees.Intern;

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
                System.out.println(hours+" часов для каждого сотрудника");
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


    }
}
