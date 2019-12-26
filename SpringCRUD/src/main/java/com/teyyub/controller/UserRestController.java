package com.teyyub.controller;

import com.teyyub.model.Question;
import com.teyyub.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author teyyub , 11:58:14 AM
 */
//@RestController
//public class UserRestController {
//
////    @Autowired
////    QuestionService questionService;
////
////    @GetMapping("/getQuestionList")
////    public ResponseEntity<List<Question>> getAllTests() {
////        
////        System.out.println("questionService.getAllQuestions() "+questionService.getAllQuestions());
////        
////        return new ResponseEntity<>(questionService.getAllQuestions(), HttpStatus.OK);
////        
////    }
////
////    @GetMapping("/getPersonById/{id}")
////    public ResponseEntity<Question> getPersonByid(@PathVariable int id) {
////
////        return new ResponseEntity<>(questionService.getQuestionById(id), HttpStatus.OK);
////    }
//
//}
