package com.pwr.model;

//import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Advertisement {

    enum gameStyle {
        OFFENSIVE,
        DEFENSIVE
    }

    @Id
    private  int     idAdv;
    private  String  discipline;
    private  String  description;
  //  private  LocalDate createdAt;
  //  private  LocalDate    expireAt;
    private  String  city;
    private  String  cityRegion;
    private  int     experience;
    private  boolean wantSparring;
    private  boolean wantTraining;

    @ManyToOne
    @JoinColumn(name ="FK_UserID")
    private User user;

    enum playerSkills {
        BEGINNER,
        INTERMEDIATE,
        UPPER_INTERMEDIATE,
        ADVANCED,
        EXPERT
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityRegion() {
        return cityRegion;
    }

    public void setCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isWantSparring() {
        return wantSparring;
    }

    public void setWantSparring(boolean wantSparring) {
        this.wantSparring = wantSparring;
    }

    public boolean isWantTraining() {
        return wantTraining;
    }

    public void setWantTraining(boolean wantTraining) {
        this.wantTraining = wantTraining;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "idAdv=" + idAdv +
                ", discipline='" + discipline + '\'' +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", cityRegion='" + cityRegion + '\'' +
                ", experience=" + experience +
                ", wantSparring=" + wantSparring +
                ", wantTraining=" + wantTraining +
                '}';
    }

    public Advertisement(User user,String discipline, String description, String city, String cityRegion, int experience, boolean wantSparring, boolean wantTraining) {
        this.discipline = discipline;
        this.description = description;
        this.city = city;
        this.cityRegion = cityRegion;
        this.experience = experience;
        this.wantSparring = wantSparring;
        this.wantTraining = wantTraining;
        this.user = user;
    }
}
