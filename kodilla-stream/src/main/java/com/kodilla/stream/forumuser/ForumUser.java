package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int numberOfUserPost;

    public ForumUser(final int userId, final String userName, final char userSex, final CharSequence birth, final int numberOfUserPost) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = LocalDate.parse(birth);
        this.numberOfUserPost = numberOfUserPost;

    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfUserPost() {
        return numberOfUserPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + dateOfBirth +
                ", numberOfUserPost=" + numberOfUserPost +
                '}';
    }
}


