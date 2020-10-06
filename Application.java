package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Application {
    public static void main(String args[]) {
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User("Max", "Robinson", 27, "m.robinson@gmail.com", User.Status.NEW, LocalDateTime.parse("2015-08-04T10:11:30")));
        list.add(new User("Clark", "Johnston", 30, "c.johnston@gmail.com", User.Status.ACTIVE, LocalDateTime.now()));
        list.add(new User("Haris", "Allen", 25, "h.allen@gmail.com", User.Status.NEW, LocalDateTime.now()));
        list.add(new User("Dominik", "Ross", 19, "d.ross@gmail.com", User.Status.INACTIVE, LocalDateTime.parse("2019-10-13T19:07:01")));
        list.add(new User("Savana", "Myers", 27, "s.myers@gmail.com", User.Status.INACTIVE, LocalDateTime.now()));

        User.getFilterUsersBy(list, LocalDateTime.now().minusDays(1), User.Status.NEW, User.Status.ACTIVE);

        System.out.println();

        User.getFilterUsersBy(list, LocalDateTime.now().minusMonths(1), User.Status.INACTIVE, User.Status.BLOCKED);
    }
}
