package com.prapor.spring.mvc.model;

import com.prapor.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Должно быть минимум 2 символа")
    private String name;
//    @NotEmpty(message = "ранг не должен быть пустым!")
    @NotBlank(message = "ранг не должен быть пустым!")
    private String rang;
    @Min(value = 25, message = "Age mast by minimum 25")
    @Max(value = 70, message = "Age must by maximum 70")
    private int age;
    private int experience;
    private String corporations;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private String language;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Use form xxx-xx-xx")
    private String phoneNumber;
    @CheckEmail(value = "rzd.ru", message = "must by ends with rzd.ru")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Inform byuro", "IB");
        departments.put("Collectors", "money");
        departments.put("Sale", "sale");

        carBrands = new HashMap<>();
        carBrands.put("Lada", "Vedro");
        carBrands.put("Solyaris", "hynady");
        carBrands.put("Seed", "KIA");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCorporations() {
        return corporations;
    }

    public void setCorporations(String corporations) {
        this.corporations = corporations;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rang='" + rang + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", corporations='" + corporations + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
