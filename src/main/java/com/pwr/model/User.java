package com.pwr.model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.List;
import java.util.Vector;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true,nullable = false)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Advertisement> advertisements;

    public User(String password , String username,String firstName,String lastName,String email) {
        this.password = password;
        this.username = username;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;

    }
    public User() {

    }


    //GETTERS
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    //SETTERS
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
