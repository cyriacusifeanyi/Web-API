package com.vgg.challange1.Web.API.models;

//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;

//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

//import javax.persistence.*;

@Entity
public class Users {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username", unique = true, length = 60, nullable = false)
    private String username;

    @Column(name = "password", length = 60, nullable = false)
    private String password;

    Users() {

    }

    Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    Users(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}