package com.company;

import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class User {
    public enum Status {
        ACTIVE, INACTIVE, BLOCKED, NEW
    }
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private Status status;
    private final LocalDateTime TIMESTAMP;

    public User(String firstname, String lastname, int age, String email, Status status, LocalDateTime timestamp) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;
        this.TIMESTAMP = timestamp;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDateTime getTIMESTAMP() {
        return TIMESTAMP;
    }


    public void setFirstname(String newFirstname) {
        this.firstname = newFirstname;
    }

    public void setLastname(String newLastname) {
        this.lastname = newLastname;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setStatus(Status newStatus) {
        this.status = newStatus;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss");
        String formatDateTime = TIMESTAMP.format(formatter);
        return firstname+" "+lastname+" "+age+" "+email+" "+status+" "+formatDateTime;
    }

    public static void getFilterUsersBy(List<User> list, LocalDateTime date, Status instat, Status finstat) {
        for (User i:list) {
            if ((i.status == instat) && (i.TIMESTAMP.isBefore(date))){
                i.setStatus(finstat);
            }
            System.out.println(i);
        }
    }
}





