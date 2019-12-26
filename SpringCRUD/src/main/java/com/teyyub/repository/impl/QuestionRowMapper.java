package com.teyyub.repository.impl;

import com.teyyub.model.Question;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author teyyub , 5:34:11 PM
 */
public class QuestionRowMapper implements RowMapper<Question> {

    @Override
    public Question mapRow(ResultSet rs, int rowNum) throws SQLException {

        Question q = new Question();
        q.setId(rs.getInt("Id"));
        byte[] photoBytes = rs.getBytes("question");
        q.setData(photoBytes);
        q.setCor_answer(rs.getString("cor_answer"));
        return q;

    }

}
