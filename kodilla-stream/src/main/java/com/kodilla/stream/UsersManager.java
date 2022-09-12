package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<String> youngerThan30Users = filterUsersOlderThan30();
        System.out.println(youngerThan30Users);
        List<String> postNumber0Users = filterUsersWithNumberOfPost0();
        System.out.println(postNumber0Users);
        }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    public static List<String> filterUsersOlderThan30() {
        List<String> usernames1 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 30)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames1;
    }
   public static List<String> filterUsersWithNumberOfPost0() {
        List<String> uesrnames2 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return uesrnames2;
   }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}