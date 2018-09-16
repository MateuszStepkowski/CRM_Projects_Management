package pl.coderslab.crm_projects_management.entity;

import org.hibernate.annotations.CreationTimestamp;
import pl.coderslab.crm_projects_management.repository.TaskRepository;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @CreationTimestamp
    private Timestamp createDate;

    @NotBlank
    private String topic;

    @NotNull
    @ManyToOne
    private Project project;

    private String description;

    @NotNull
    @ManyToOne
    private Status status;

    @NotNull
    @ManyToOne
    private Priority priority;

    @NotNull
    @ManyToOne
    private User user;


    public Task() {
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return getId() == task.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", topic='" + topic + '\'' +
                ", project=" + project +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", user=" + user +
                '}';
    }
}
