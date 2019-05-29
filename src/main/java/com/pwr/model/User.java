package com.pwr.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Vector;

@Entity
public class User {
    @Id
    private String username;
    private String password;
    private String firstName;

    public Vector<Advertisement> getAdvertisementVector() {
        return advertisementVector;
    }

    public void setAdvertisementVector(Vector<Advertisement> advertisementVector) {
        this.advertisementVector = advertisementVector;
    }

    public void addAdvertisement(Advertisement adv) {
        this.advertisementVector.add(adv);
    }

    private String lastName;
    private String email;
    private Vector<Advertisement> advertisementVector = new Vector<>();
    public User(String password , String username,String firstName,String lastName,String email) {
        this.password = password;
        this.username = username;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;

    }
    public User() {

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
