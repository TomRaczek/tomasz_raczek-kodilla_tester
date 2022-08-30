package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School>educationalInstitution = new HashMap<>();
        Principal bossmann = new Principal("Bossmann");
        Principal chiefmann = new Principal("Chiefmann");
        Principal presidente = new Principal("Presidente");

        School bossmannsSchool = new School("Central Academy of Lifting Heavy", Arrays.asList(31,34,26,22,23,21,32));
        School chiefmannsSchool = new School("Temerian School for Poor Infantry", Arrays.asList(31,31,26,22,27,22,33));
        School presidentesSchool = new School("University of Applied Corruption", Arrays.asList(30,32,25,22,21,24,30));

        educationalInstitution.put(bossmann,bossmannsSchool);
        educationalInstitution.put(chiefmann,chiefmannsSchool);
        educationalInstitution.put(presidente,presidentesSchool);

        for (Map.Entry<Principal, School> institutionEntry : educationalInstitution.entrySet()) {
            System.out.println(institutionEntry.getKey().getPrincipalName() + " is the Principal of "
                    + institutionEntry.getValue().getSchoolName() + " which has " + institutionEntry.getValue().getAllStudents()
                    + " students");
        }
    }
}