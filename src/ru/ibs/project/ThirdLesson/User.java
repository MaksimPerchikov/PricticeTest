package ru.ibs.project.ThirdLesson;

public abstract class User implements Move{
    private String userName;
    private Integer userAge;
    private String post;

    public User(String userName, Integer userAge, String post) {
        this.userName = userName;
        this.userAge = userAge;
        this.post = post;
    }
    User(String userName, Integer userAge){
        this.userName = userName;
        this.userAge = userAge;
    }


    @Override
    public String allUsers() {
        return null;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
