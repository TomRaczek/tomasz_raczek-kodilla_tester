package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(averagePostsAboveAge39(UsersRepository.getUsersList()));
        System.out.println(averagePostsBelowAge40(UsersRepository.getUsersList()));
        ;
    }
    public static Double averagePostsAboveAge39(List<User> users) {
        double avgAbove39 = users
                .stream()
                .filter(user -> user.getAge() > 39)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .orElse(0);
        return avgAbove39;
    }
    public static Double averagePostsBelowAge40(List<User> users) {
        double avgBelow40 = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .orElse(0);
        return avgBelow40;
    }
}