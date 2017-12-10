package com.lobo.rauffer.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lobo.rauffer.blog.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {

   @RequestMapping(path = "/create", method = RequestMethod.GET)
   public String create() {
       return "userForm"; // forwarding the request to "userForm.jsp"
   }

   @RequestMapping(path = "/save", method = RequestMethod.POST)
   public String save(User user, Model model) {
       //TODO: invoke business logic implementation
       model.addAttribute("message", "User has been created.");
       return "userConfirmation"; // forwarding the request to "userConfirmation.jsp"
   }

}