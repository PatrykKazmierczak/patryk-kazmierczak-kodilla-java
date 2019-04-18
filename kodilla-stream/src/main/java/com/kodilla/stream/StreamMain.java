package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getNumberOfUserPost() >= 1)
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(),LocalDate.now()).getYears() >= 20)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser))
                .entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}
