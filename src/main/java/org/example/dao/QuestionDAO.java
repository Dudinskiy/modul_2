package org.example.dao;

import org.example.entities.Question;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class QuestionDAO {

    public Question getQuestion() {
        Question result = null;
        int a = 0;
        int b = 10;
        int i = a + (int) (Math.random() * b);
        String query = "select * from questions where id=?;";

        try (PreparedStatement statement = PostgreDataSource.getConnection()
                .prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            statement.setInt(1, i);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String question = resultSet.getString("question");
                String answer = resultSet.getString("answer");
                int points = resultSet.getInt("points");;

                result = new Question(id, question, answer, points);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
