package com.vgg.challange1.Web.API.models;

//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;

//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

//import javax.persistence.*;

@Entity
public class Projects {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 60, nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private  String description;

    @Column(name = "completed")
    private  boolean completed;

    Projects() {

    }

    Projects(String name, String description, boolean completed){
        this.name = name;
        this.description = description;
        this.completed = completed;
    }

    Projects(long id, String name, String description, boolean completed){
        this.id = id;
        this.name = name;
        this.description = description;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", completed='" + completed + '\'' +
                '}';
    }
}