package com.prapor.spring.mvc.model;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String rang;
    private int age;
    private int experience;
    private String corporations;
    private String department;
    private Map<String, String> departments;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Inform byuro", "IB");
        departments.put("Collectors", "money");
        departments.put("Sale", "sale");
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
