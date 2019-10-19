package com.food.samosa.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name="user")
public class UserEntity extends  BaseEntity {
    @Column(length = 50)
    @NotEmpty
    private  String firstName;

    @Column(length = 50)
    @NotEmpty
    private  String lastName;

    @Email
    @NotEmpty
    @Column(unique = true, length = 50)
    private String email;

    @Column(length = 50)
    private String location;

    @Column
    private int numSelection;

    @NotEmpty
    @Length(min = 5)
    private String password;


    @OneToMany(mappedBy = "userID")
    private Set<FoodPreferenceEntity> foodPreferenceEntities;


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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumSelection() {
        return numSelection;
    }

    public void setNumSelection(int numSelection) {
        this.numSelection = numSelection;
    }


    public Set<FoodPreferenceEntity> getFoodPreferenceEntities() {
        return foodPreferenceEntities;
    }

    public void setFoodPreferenceEntities(Set<FoodPreferenceEntity> foodPreferenceEntities) {
        this.foodPreferenceEntities = foodPreferenceEntities;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
