package edu.ieti.task.model;
import java.util.Date;
public class Task {
   

    private String id;
    private User responsible;
    private String status;
    private Date dueDate;
    private String text;

    public Task() {
    }

    public Task(String id, User responsible, String status, Date dueDate,String text) {
        this.id = id;
        this.responsible = responsible;
        this.status = status;
        this.dueDate = dueDate;
        this.text=text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public String getText(){
        return text;
    }
    public void setText(String text ){
        this.text=text;        
    }
}

