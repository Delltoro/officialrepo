package com.pwr.model;

//import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;

import javax.persistence.*;

@Entity
public class Advertisement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int     idAdv;

    private  int  discipline;
    private  String  description;

    @Column(nullable = false)
    private  String  city;
    @Column(nullable = false)
    private  String  cityRegion;

    private  int     experience;
    private  boolean wantSparring;
    private  boolean wantTraining;

    public enum playerSkills {
        BEGINNER,
        INTERMEDIATE,
        UPPER_INTERMEDIATE,
        ADVANCED,
        EXPERT
    }
    public enum gameStyle {
        OFFENSIVE,
        DEFENSIVE
    }


    @ManyToOne
    public User user;

    //GETTERS
    public int getDiscipline() {
        return discipline;
    }
    public String getDescription() {
        return description;
    }
    public String getCity() {
        return city;
    }
    public String getCityRegion() {
        return cityRegion;
    }
    public int getExperience() {
        return experience;
    }
    public boolean getWantSparring() {
        return wantSparring;
    }
    public boolean getWantTraining() {
        return wantTraining;
    }

    //SETTERS
    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void setWantSparring(boolean wantSparring) {
        this.wantSparring = wantSparring;
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
    public Advertisement(User user, int discipline,String description, String city, String cityRegion, int experience,
                         boolean wantSparring, boolean wantTraining) {
        this.discipline = discipline;
        this.description = description;
        this.city = city;
        this.cityRegion = cityRegion;
        this.experience = experience;
        this.wantSparring = wantSparring;
        this.wantTraining = wantTraining;
        this.user = user;
    }
    public Advertisement(){

    }


}

/*
insert into advertisement
values
(
	1,
	"wroclaw" ,
    "srodmiescie" ,
    "lubie grac w tenisia" ,
    "tenis" ,
    5,
    true,
    true,
    1
)

 */