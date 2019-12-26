package com.teyyub.controller;

import com.teyyub.model.Question;
import com.teyyub.model.User;
import com.teyyub.service.QuestionService;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author teyyub , 3:42:47 PM
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model) {

        model.addAttribute("questions", questionService.getAllQuestions());
        return "questions";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String listAll(Model model) {
        List<Question> l = questionService.getAllQuestions();
        System.out.println("size of list " + l.size());
        model.addAttribute("questions", l);
        return "questions";
    }

    @RequestMapping(value = "/getQuestionList", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    List<Question> allQuestions() {
        System.out.println("allQuestions()");
        return questionService.getAllQuestions();
    }

    @RequestMapping("/getQuestionById/{id}")
    public @ResponseBody
    Question getQuestionByid(@PathVariable int id) {

        return questionService.getQuestionById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)

    public String getAddNewQuestionForm(Model model) {
        Question newQuestion = new Question();
        model.addAttribute("newQuestion", newQuestion);
        return "addQuestion";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewQuestionForm(@ModelAttribute("newQuestion") Question newQuestion) {
        System.out.println("calling processAddNewQuestionForm ");
        questionService.add(newQuestion);
        return "redirect:/questions";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public ModelAndView update(@PathVariable("id") int id) {
        ModelAndView model = new ModelAndView("user/user_form");

//        User user = userService.findUserById(id);
//        model.addObject("userForm", user);
        return model;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("userForm") User user) {
//        if (user != null && user.getId() != null) {
//            userService.updateUser(user);
//        } else {
//            userService.addUser(user);
//        }
        return new ModelAndView("redirect:/user/list");
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
//        userService.deleteUser(id);
        return new ModelAndView("redirect:/user/list");
    }

    @RequestMapping("/exam_question")
    public String getQuestionById(@RequestParam("id") String questionId, Model model) {
        Question q = questionService.getQuestionById(Integer.valueOf(questionId));
        System.out.println(q.toString());
        model.addAttribute("question", q);
        return "question";
    }

    @RequestMapping(value = "/getImage/{id}")
    public void getStudentPhoto(HttpServletResponse response, @PathVariable("id") int id) throws Exception {
        response.setContentType("image/jpeg");
        Question q = questionService.getQuestionById(id);
        InputStream inputStream = new ByteArrayInputStream(q.getData());
        IOUtils.copy(inputStream, response.getOutputStream());
    }

}
