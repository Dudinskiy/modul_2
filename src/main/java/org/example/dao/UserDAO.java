package org.example.dao;

import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;

import java.sql.SQLException;


@Repository
public class UserDAO {

    public void saveUser(String name) {
        String query = "insert into users (name) values(?);";
        try (PreparedStatement statement = PostgreDataSource.getConnection()
                .prepareStatement(query)) {
            statement.setString(1, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
