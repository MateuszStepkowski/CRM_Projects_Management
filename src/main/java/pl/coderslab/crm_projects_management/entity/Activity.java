package pl.coderslab.crm_projects_management.entity;

import pl.coderslab.crm_projects_management.entity.enums.ActionEnum;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Timestamp createDate;

    @NotNull
    @ManyToOne
    private Project project;

    @NotNull
    @ManyToOne
    User user;

    private ActionEnum action;

    @ManyToOne
    Task task;

    public Activity(Timestamp createDate, @NotNull Project project, @NotNull User user, ActionEnum action, Task task) {
        this.createDate = createDate;
        this.project = project;
        this.user = user;
        this.action = action;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
