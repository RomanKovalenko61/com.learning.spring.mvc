package com.learning.spring.mvc;

import com.learning.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be minimum 2 symbols")
    private String name;
    @NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field") //for check space
    private String surname;
    @Min(value = 500, message = "must be greater than 499") // inclusive 500
    @Max(value = 1000, message = "must be less than 1001") // inclusive 1000
    private int salary;
    private String department;
    private Map<String,String> deparments;
    private String carBrand;
    private Map<String,String> carBrands;
    private String[] languages;
    private Map<String, String> languagesList;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;

    public Employee() {
        deparments = new HashMap<>();
        deparments.put("IT", "Information Technology");
        deparments.put("HR", "Human Resources");
        deparments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "MB");

        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("Deutsch", "DE");
        languagesList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDeparments() {
        return deparments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
