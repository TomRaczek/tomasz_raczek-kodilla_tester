package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(averagePostsAboveAge39());
        System.out.println(averagePostsBelowAge40());
    }
    public static Double averagePostsAboveAge39() {
        double avgAbove39 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 39)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgAbove39;
    }
    public static Double averagePostsBelowAge40() {
        double avgBelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgBelow40;
    }
}