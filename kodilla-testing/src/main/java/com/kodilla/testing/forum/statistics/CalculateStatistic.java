package com.kodilla.testing.forum.statistics;

public class CalculateStatistic {

    private static int userQuantity;
    private static int postQuantity;
    private static int commentsQuantity;
    private static double averagePostPerUser;
    private static double averageCommentsPerUser;
    private static double averageCommentsPerPost;

    public int getUserQuantity() {
        return userQuantity;
    }
    public int getPostQuantity() {
        return postQuantity;
    }
    public int getCommentsQuantity() {
        return commentsQuantity;
    }
    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }
    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }
    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
    public static void calculateAdvStatistics(Statistics statistics){

        userQuantity = statistics.usersNames().size();
        postQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostPerUser = calculateAveragePostPerUser();
        averageCommentsPerUser = calculateAverageCommentsPerUser();
        averageCommentsPerPost = calculateAverageCommentsPerPost();
    }
    private static double calculateAveragePostPerUser() {
        if(userQuantity>0) {
            return (double) postQuantity/userQuantity;
        } else {
            return 0;
        }
    }
    private static double calculateAverageCommentsPerUser() {
        if(userQuantity>0) {
            return (double) commentsQuantity / userQuantity;
        } else {
            return 0;
        }
    }
    private static double calculateAverageCommentsPerPost() {
        if(postQuantity>0) {
            return (double) commentsQuantity / postQuantity;
        } else {
            return 0;
        }
    }
    public void showStatistic(){
        System.out.println("Calculation statistic");
        System.out.println("User quantity: " + userQuantity);
        System.out.println("Post quantity: " + postQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Average post per user: " + calculateAveragePostPerUser());
        System.out.println("Average comments per user: " + calculateAverageCommentsPerUser());
        System.out.println("Average comments per post: " + calculateAverageCommentsPerPost());
        }
    }



