package com.kodilla.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.sql.SQLException;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getUsersResultsCount(rs);
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {

        String testQuery = "SELECT FIRSTNAME, LASTNAME, COUNT(*) AS POSTS_NUMBER " +
                "FROM USERS U JOIN POSTS P ON P.USER_ID = U.ID " +
                "GROUP BY U.ID " +
                "HAVING COUNT(*) > 1";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(testQuery);
        int count = getUsersAndPostsResultsCount(rs);
        insertUsers(statement);
        String idQuery = "SELECT MAX(ID) FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(idQuery);
        int maxId = getMaxId(rs);
        insertPosts(statement, maxId);
        statement = createStatement();
        rs = statement.executeQuery(testQuery);
        int counter = getUsersAndPostsResultsCount(rs);
        int expected = count + 1;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertPosts(Statement statement, int maxID) throws SQLException {
        for (int i = 0; i < 5; i++) {
            statement.executeUpdate(
                    String.format("INSERT INTO POSTS(USER_ID, BODY) VALUES ('%s', '%s')",
                            maxID - i,
                            "New Update " + i
                    )
            );
            statement.executeUpdate(
                    String.format("INSERT INTO POSTS(USER_ID, BODY) VALUES ('%s', '%s')",
                            maxID,
                            "New Update 0 " + i
                    )
            );
        }
    }
    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private static int getUsersResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }
    private static int getUsersAndPostsResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%s, %s, %d%n",
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"),
                    rs.getInt("POSTS_NUMBER"));
            counter++;
        }
        return counter;
    }


    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }
    private static int getMaxId(ResultSet rs) throws SQLException {
        int id = 0;
        rs.next();
        id = rs.getInt(1);
        return id;
    }
}