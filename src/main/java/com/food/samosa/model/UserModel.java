package com.food.samosa.model;



import java.util.Set;

public class UserModel extends BaseModel {

    private  String firstName;

    private  String lastName;

    private String email;

    private String location;

    private int numSelection;

    private String password;

    private Set<FoodPreferenceModel> foodPreferences;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<FoodPreferenceModel> getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(Set<FoodPreferenceModel> foodPreferences) {
        this.foodPreferences = foodPreferences;
    }
}
