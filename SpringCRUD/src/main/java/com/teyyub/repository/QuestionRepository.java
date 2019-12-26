package com.teyyub.repository;

import com.teyyub.model.Question;
import java.util.List;

/**
 *
 * @author teyyub , 4:02:04 PM
 */
public interface QuestionRepository {

    void add(Question q);
    void deleteById(Integer Id);
    List<Question> getAllQuestions();
    Question getQuestionById(Integer id);
    
}
