/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieti.task.services.Impl;

import edu.ieti.task.model.Task;
import edu.ieti.task.model.User;
import edu.ieti.task.services.TaskService;
import edu.ieti.task.services.UserService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class TaskServiceImpl implements TaskService{
     @Autowired
    UserService userService;
    HashMap <String, Task> taskMap = new HashMap<>();
    @Override
    public List<Task> geAll() {
         List<Task> tasks = new ArrayList<Task>(taskMap.values());
        return tasks;
    }

    @Override
    public Task getById(String id) {
        Task task = taskMap.get(id);
        return task;
    }

    @Override
    public List<Task> getByUserId(String userId) {
         List<Task> tasks = geAll();
        List<Task> userTasks = new ArrayList<Task>();
        for (int i=0; i<tasks.size();i++){
            if(tasks.get(i).getResponsible().getId().equals(userId)){
                userTasks.add(tasks.get(i));
            }
        }
        return userTasks;
    }

    @Override
    public void assignTaskToUser(Task task, String userId) {
         userService.getById(userId).addTask(task);
    }

    @Override
    public void remove(String taskId) {
       taskMap.remove(taskId);
    }

    @Override
    public void update(Task task) {
         for(User u:userService.getAll()){
            int i = 0;
            int pos = 0;
            boolean found = false;
            for(Task t:u.getTaskList()){
                if(t.getId().equals(task.getId())){
                    pos = i;
                    found = true;
                }
                i++;
            }
            if(found) u.getTaskList().set(pos,task);
        }
    }
    
}
