/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieti.task.services.Impl;

import edu.ieti.task.model.User;
import edu.ieti.task.services.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class UserServiceImpl implements UserService {
    List<User> users = new ArrayList<>();    
    @Override
    public List<User> getAll() {
         return users;
    }

    @Override
    public User getById(String userId) {
        User user = null;
        for (User u : users){
            if(u.getId().equals(userId)) user = u;
        }
        return user;
    }

    @Override
    public boolean create(User user) {
        boolean add = true;
         for(User u:users){
            if(u.getId().equals(user.getId())) add = false;
        }
        if(add) users.add(user);
        return add;
    }

    @Override
    public void update(User user) {
        int i = 0;
        int pos = 0;
        boolean found = false;
        for(User u:users){
            if(u.getId().equals(user.getId())){
                pos = i;
                found = true;
            }
            i++;
        }
        if(found) {
            users.set(pos, user);
        }
    }

    @Override
    public void remove(String userId) {
         int i = 0;
        int pos = 0;
        boolean found = false;
        for(User u:users){
            i++;
            if(u.getId().equals(userId)){
                pos = i;
                found = true;
            }
        }
        if(found) {
            users.remove(pos);
        }
    }
}
