package org.ravi;

import java.util.List;
import java.util.StringJoiner;

public class JoinStrings {

    public static void main(String[] args) {
        StringJoiner names = new StringJoiner(", ","[","]");
        names.setEmptyValue("Currently no names available");
        System.out.println(names);
        System.out.println("Adding names now.");
        List<User> users = UsersListFactory.getList();
        users.stream().map(User::getName).sorted().forEach(names::add);
        System.out.println(names);
        System.out.println("Length is "+names.length());
    }
}
