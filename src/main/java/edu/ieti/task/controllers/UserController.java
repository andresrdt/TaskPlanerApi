/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieti.task.controllers;

import edu.ieti.task.model.User;
import edu.ieti.task.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@Service
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/Users")

public class UserController {
    @Autowired
    UserService userService;
     @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public boolean signup(@RequestBody User signup) {
        return userService.create(signup);
    }

     @RequestMapping(value = "/login", method = RequestMethod.POST)
      public void login(@RequestBody User login){
          if (login.getId() == null || login.getPassword() == null) {
              
          }
          
      }
}
