package com.teyyub.service.impl;

import com.teyyub.model.Question;
import com.teyyub.repository.impl.QuestionRepositoryDB;
import com.teyyub.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author teyyub , 4:01:16 PM
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepositoryDB repository;

    @Override
    public void add(Question q) {
        repository.add(q);
    }

    @Override
    public List<Question> getAllQuestions() {
        return repository.getAllQuestions();
    }

    @Override
    public Question getQuestionById(Integer id) {
        return repository.getQuestionById(id);
    }

    @Override
    public void deleteById(Integer Id) {
        repository.deleteById(Id);
    }

}
