/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieti.task.services;

import edu.ieti.task.model.User;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface UserService {
    List<User> getAll();
    
    User getById(String userId);
    
    boolean create(User user);
    
    void update(User user);
    
    void remove(String userId);
}
