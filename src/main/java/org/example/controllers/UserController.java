package org.example.controllers;

import org.example.dao.QuestionDAO;
import org.example.dao.UserDAO;
import org.example.entities.Question;
import org.example.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    private final UserDAO userDAO;
    private final QuestionDAO questionDAO;

    public UserController(UserDAO userDAO, QuestionDAO questionDAO) {
        this.userDAO = userDAO;
        this.questionDAO = questionDAO;
    }

    @GetMapping(value = "/addUser")
    public ModelAndView addStudent() {
        return new ModelAndView("addUser", "user", new User());
    }

    @PostMapping(value = "/saveUser")
    public ModelAndView saveStudent(@ModelAttribute User user) {
        userDAO.saveUser(user.getName());
        return new ModelAndView("redirect:/user/begin");
    }

    @PostMapping(value = "/begin")
    public ModelAndView beginTests() {
        Question question = questionDAO.getQuestion();
        return new ModelAndView("test", "question", question);
    }

    @GetMapping(value = "/finish")
    public ModelAndView finishTests() {
        return new ModelAndView("finish");
    }

    @GetMapping(value = "/result")
    public ModelAndView getResult() {
        return new ModelAndView("result");
    }


}
