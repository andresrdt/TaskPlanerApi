/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieti.task.services;

import edu.ieti.task.model.Task;
import edu.ieti.task.model.User;
import java.util.List;

/**
 *
 * @author Usuario
 */
 public interface TaskService {
        List<Task> geAll();
        
        Task getById(String id);
        
        List<Task> getByUserId(String userId);
        
        void assignTaskToUser(Task task, String userId);
        
        void remove(String taskId);
        
        void update(Task task);
    }