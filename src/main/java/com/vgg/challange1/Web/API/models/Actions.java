package com.vgg.challange1.Web.API.models;

//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;

//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

//import javax.persistence.*;

@Entity
public class Actions {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "project_id", nullable = false) //foreign key
    private long project_id;

    @Column(name = "description", nullable = false)
    private  String description;

    @Column(name = "note", nullable = false)
    private  String note;

    Actions() {

    }

    Actions(long project_id, String description, String note){
        this.project_id = project_id;
        this.description = description;
        this.note = note;
    }

    Actions(long id, long project_id, String description, String note){
        this.id = id;
        this.project_id = project_id;
        this.description = description;
        this.note = note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProject_id() {
        return project_id;
    }

    public void setName(long project_id) {
        this.project_id = project_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "BucketList{" +
                "id=" + id +
                ", project_id='" + project_id + '\'' +
                ", description='" + description + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}