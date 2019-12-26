 

package com.teyyub.service;

import com.teyyub.model.Question;
import java.util.List;

/**
 *
 * @author teyyub , 4:00:39 PM
 */
public interface QuestionService {
  void  add(Question q);
  void deleteById(Integer Id);
  List<Question> getAllQuestions();
  Question getQuestionById(Integer id);
}
