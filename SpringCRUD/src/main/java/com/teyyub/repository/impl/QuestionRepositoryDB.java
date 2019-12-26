package com.teyyub.repository.impl;

import com.teyyub.model.Question;
import com.teyyub.repository.QuestionRepository;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author teyyub , 4:02:41 PM
 */
@Repository
public class QuestionRepositoryDB implements QuestionRepository {

//    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public QuestionRepositoryDB(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void add(Question q) {
        String sql = "INSERT INTO questions(question,cor_answer) VALUES (?, ?)";
//        Connection conn = null;
        try {
            byte[] photoBytes = q.getQuestionImage().getBytes();
            jdbcTemplate.update(sql, new Object[]{photoBytes, q.getCor_answer()});
        } catch (IOException ex) {
            Logger.getLogger(QuestionRepositoryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Question> getAllQuestions() {
        
        List<Question> lists=new ArrayList<>();
 
        String sql = "select * from course.questions ";
          lists = jdbcTemplate.query(sql, new QuestionRowMapper());
        System.out.println("getAllQuestions   :"+lists);
        return lists;
    }

    @Override
    public Question getQuestionById(Integer id) {
        String sql = "select * from course.questions where id=? ";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new QuestionRowMapper());

    }

    @Override
    public void deleteById(Integer Id) {
        String sql = "update questions set status = ?";
        jdbcTemplate.update(sql, new Object[]{Id});
    }
}
