package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticTest {

    private Statistics statisticsMock;
    private CalculateStatistic calculateStatistic;

    @Test
    public void testCalculateStatisticWithZeroPost() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("User 1");
        usersList.add("User 2");
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        calculateStatistic = new CalculateStatistic();
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        CalculateStatistic.calculateAdvStatistics (statisticsMock);
        //Then
        assertEquals(0,calculateStatistic.getPostQuantity());
        assertEquals(0,calculateStatistic.getAveragePostPerUser(),0.01);
        assertEquals(0,calculateStatistic.getAverageCommentsPerPost(),0.01);
    }
    @Test
    public void testCalculateStatisticWithThousandPost() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("User 1");
        usersList.add("User 2");
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        calculateStatistic = new CalculateStatistic();
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        CalculateStatistic.calculateAdvStatistics (statisticsMock);
        //Then
        assertEquals(1000,calculateStatistic.getPostQuantity());
        assertEquals(500,calculateStatistic.getAveragePostPerUser(),0.01);
        assertEquals(0.04,calculateStatistic.getAverageCommentsPerPost(),0.01);
    }
    @Test
    public void testCalculateStatisticWithZeroComments() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("User 1");
        usersList.add("User 2");
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        calculateStatistic = new CalculateStatistic();
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        CalculateStatistic.calculateAdvStatistics (statisticsMock);
        //Then
        assertEquals(0,calculateStatistic.getCommentsQuantity());
        assertEquals(0,calculateStatistic.getAverageCommentsPerUser(),0.01);
        assertEquals(0,calculateStatistic.getAverageCommentsPerPost(),0.01);
    }
    @Test
    public void testCalculateStatisticWithCommentsLessThanPost() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("User 1");
        usersList.add("User 2");
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        calculateStatistic = new CalculateStatistic();
        //Given
        when(statisticsMock.commentsCount()).thenReturn(4);
        when(statisticsMock.postsCount()).thenReturn(16);
        //When
        CalculateStatistic.calculateAdvStatistics (statisticsMock);
        //Then
        assertEquals(16,calculateStatistic.getPostQuantity());
        assertEquals(4,calculateStatistic.getCommentsQuantity());
        assertEquals(8,calculateStatistic.getAveragePostPerUser(),0.01);
        assertEquals(2,calculateStatistic.getAverageCommentsPerUser(),0.01);
        assertEquals(0.25,calculateStatistic.getAverageCommentsPerPost(),0.01);
    }
    @Test
    public void testCalculateStatisticWithCommentsGraterThanPost() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("User 1");
        usersList.add("User 2");
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        calculateStatistic = new CalculateStatistic();
        //Given
        when(statisticsMock.commentsCount()).thenReturn(24);
        when(statisticsMock.postsCount()).thenReturn(4);
        //When
        CalculateStatistic.calculateAdvStatistics (statisticsMock);
        //Then
        assertEquals(24,calculateStatistic.getCommentsQuantity());
        assertEquals(4,calculateStatistic.getPostQuantity());
        assertEquals(2,calculateStatistic.getAveragePostPerUser(),0.01);
        assertEquals(12,calculateStatistic.getAverageCommentsPerUser(),0.01);
        assertEquals(6,calculateStatistic.getAverageCommentsPerPost(),0.01);
    }
    @Test
    public void testCalculateStatisticWithZeroUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        calculateStatistic = new CalculateStatistic();
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //When
        CalculateStatistic.calculateAdvStatistics (statisticsMock);
        //Then
        assertEquals(0,calculateStatistic.getUserQuantity());
        assertEquals(0,calculateStatistic.getAveragePostPerUser(),0.01);
        assertEquals(0,calculateStatistic.getAverageCommentsPerUser(),0.01);
    }
    @Test
    public void testCalculateStatisticWithThousandUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i =0;i <1000; i++){
            usersList.add("User");
        }
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        calculateStatistic = new CalculateStatistic();
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //When
        CalculateStatistic.calculateAdvStatistics (statisticsMock);
        //Then
        assertEquals(1000,calculateStatistic.getUserQuantity());
        assertEquals(0.02,calculateStatistic.getAveragePostPerUser(),0.01);
        assertEquals(0.04,calculateStatistic.getAverageCommentsPerUser(),0.01);
    }
}